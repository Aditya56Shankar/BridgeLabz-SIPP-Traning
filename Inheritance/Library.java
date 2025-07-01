public class Library {
    public static void main(String[] args) {
        AuthoredBook book = new AuthoredBook(
                "The Great Gatsby",
                1925,
                "F. Scott Fitzgerald",
                "An American novelist widely regarded as one of the greatest writers of the 20th century."
        );

        System.out.println("--- Book Information ---");
        book.displayInfo();
    }
}

class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
class AuthoredBook extends Book {
    private String authorName;
    private String authorBio;

    public AuthoredBook(String title, int publicationYear, String authorName, String authorBio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.authorBio = authorBio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + authorName);
        System.out.println("Author Bio: " + authorBio);
    }
}

