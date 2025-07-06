import java.time.LocalDate;

public class MovieManagementSystem {
    Node head;
    Node tail;
    class Node{
        String movieTitle;
        String director;
        int yearOfRelease;
        int rating;
        Node next,prev;


        public Node(String movieTitle, String director, int yearOfRelease, int rating) {
            this.movieTitle = movieTitle;
            this.director = director;
            this.yearOfRelease = yearOfRelease;
            this.rating = rating;
            this.next=null;
            this.prev=null;
        }

    }

    public void addFirst(String title, String director, int releaseDate, int rating) {
        Node newNode = new Node(title, director, releaseDate, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            newNode.prev=null;
            head.prev = newNode;
            head = newNode;

        }
    }
    public void addLast(String title, String director, int releaseDate, int rating) {
        Node newNode = new Node(title, director, releaseDate, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next=null;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addIndex(String title, String director, int releaseDate, int rating, int index) {
        if (index <= 0 || head == null) {
            addFirst(title, director, releaseDate, rating);
            return;
        }

        Node newNode = new Node(title, director, releaseDate, rating);
        Node temp = head;
        int i = 0;

        while (temp != null && i < index - 1) {
            i++;
            temp = temp.next;

        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

    }

    public void delete (String title){
        Node temp=head;
        while (temp!=null){
            if(temp.movieTitle.equals(title)){
                if (temp == head && temp == tail) {
                    head = tail = null;
                }
                else if (temp == head) {
                    head = head.next;
                    head.prev=null;

                }
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }

            temp=temp.next;
        }

    }

    public void searchByRating(int rating) {
        Node temp = head;

        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Title: " + temp.movieTitle +
                        ", Director: " + temp.director +
                        ", Year: " + temp.yearOfRelease +
                        ", Rating: " + temp.rating);
            }
            else {
                System.out.println("not found");
            }
            temp = temp.next;
        }

    }
    public void searchByDirector(String director) {
        Node temp = head;

        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println("Title: " + temp.movieTitle +
                        ", Director: " + temp.director +
                        ", Year: " + temp.yearOfRelease +
                        ", Rating: " + temp.rating);
            }
            else {
                System.out.println("not found");
            }
            temp = temp.next;
        }

    }
    public void printMovie() {
        Node temp=head;
        while (temp!=null){
            System.out.println("Title: " + temp.movieTitle +
                    ", Director: " + temp.director +
                    ", Year: " + temp.yearOfRelease +
                    ", Rating: " + temp.rating);
            temp=temp.next;
        }
    }
    public void forward() {
        Node temp=head;
        while (temp!=null){
            System.out.println("Title: " + temp.movieTitle +
                    ", Director: " + temp.director +
                    ", Year: " + temp.yearOfRelease +
                    ", Rating: " + temp.rating);
            temp=temp.next;
        }
    }
    public void reverse() {
        Node temp=tail;
        while (temp!=null){
            System.out.println("Title: " + temp.movieTitle +
                    ", Director: " + temp.director +
                    ", Year: " + temp.yearOfRelease +
                    ", Rating: " + temp.rating);
            temp=temp.prev;
        }
    }
    public void updateRating(String title, int newRating) {
        Node temp = head;
        while (temp != null) {
            if (temp.movieTitle.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for \"" + title + "\" to " + newRating);
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();

        mms.addFirst("Inception", "Christopher Nolan", 2010, 8);
        mms.addLast("Titanic", "James Cameron", 1997, 7);
        mms.addIndex("The Dark Knight", "Christopher Nolan", 2008, 9, 1);
//        mms.printMovie();
//        System.out.println("delete");
//        mms.delete("Inception");
//        mms.printMovie();
//        System.out.println("for");
//        mms.forward();
//        System.out.println("rev");
//        mms.reverse();
    }


}
