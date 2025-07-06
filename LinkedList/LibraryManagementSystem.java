public class LibraryManagementSystem {

    class Node {
        String bookTitle;
        String author;
        String genre;
        int bookId;
        boolean isAvailable;
        Node prev;
        Node next;

        public Node(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
            this.bookTitle = bookTitle;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.isAvailable = isAvailable;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void addFirst(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtIndex(String bookTitle, String author, String genre, int bookId, boolean isAvailable, int index) {
        if (index <= 0 || head == null) {
            addFirst(bookTitle, author, genre, bookId, isAvailable);
            return;
        }

        Node temp = head;
        int i = 0;

        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == tail) {
            addLast(bookTitle, author, genre, bookId, isAvailable);
        } else {
            Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
            newNode.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void remove(int bookId) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp == head && temp == tail) {
                    head = tail = null;
                } else if (temp == head) {
                    head = head.next;
                    head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Book with ID " + bookId + " removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    public void searchByTitle(String title) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.bookTitle.equalsIgnoreCase(title)) {
                System.out.println("Book ID: " + temp.bookId +
                        ", Title: " + temp.bookTitle +
                        ", Author: " + temp.author +
                        ", Genre: " + temp.genre +
                        ", Available: " + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }

    public void searchByAuthor(String author) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                System.out.println("Book ID: " + temp.bookId +
                        ", Title: " + temp.bookTitle +
                        ", Author: " + temp.author +
                        ", Genre: " + temp.genre +
                        ", Available: " + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found by author: " + author);
        }
    }

    public void updateAvailability(int bookId, boolean newStatus) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = newStatus;
                System.out.println("Availability updated for book ID " + bookId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node temp = head;
        System.out.println("Library Books (Forward):");
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookId +
                    ", Title: " + temp.bookTitle +
                    ", Author: " + temp.author +
                    ", Genre: " + temp.genre +
                    ", Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node temp = tail;
        System.out.println("Library Books (Reverse):");
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookId +
                    ", Title: " + temp.bookTitle +
                    ", Author: " + temp.author +
                    ", Genre: " + temp.genre +
                    ", Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    public void countBooks() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total number of books: " + count);
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        library.addFirst("The Hobbit", "J.R.R. Tolkien", "Fantasy", 101, true);
        library.addLast("1984", "George Orwell", "Dystopian", 102, false);
        library.addAtIndex("Dune", "Frank Herbert", "Sci-Fi", 103, true, 1);

        library.displayForward();
        library.displayReverse();

        library.searchByTitle("1984");
        library.searchByAuthor("J.R.R. Tolkien");

        library.updateAvailability(102, true);
        library.displayForward();

        library.countBooks();

        library.remove(103);
        library.displayForward();
        library.countBooks();
    }
}
