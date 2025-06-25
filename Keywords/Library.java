public class Library {
    public static void main(String[] args) {
        LibraryDetails book1 = new LibraryDetails("The Alchemist", "Paulo Coelho", 1);
        LibraryDetails book2 = new LibraryDetails("1984", "George Orwell", 12);
        book2.displayLibraryName();
        book1.displayDetails();
        book2.displayDetails();

    }
}

class LibraryDetails{
    static String libraryName="Central library";
    String title;
    String author;
    final int isbn;

    public LibraryDetails(String title, String author,int isbn) {
        this.title = title;
        this.author = author;
        this.isbn=isbn;
    }

    static void displayLibraryName(){
        System.out.println("library name: "+libraryName);

    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }



}
