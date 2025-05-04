package classesandobjects;

// storing the list of books
public class Library {
    public static void main(String[] args) {
        // create instances of books
        Book b001 = new Book();
        Book b002 = new Book();
        Book b003 = new Book();

        // populate the values (dot) notation is used to access class attributes

        // book1
        b001.title = "The Book Thief";
        b001.author = "Markus Zusak";
        b001.genre = "Suspense";
        b001.pages = 1000;
        b001.pubYear = 2001;
        // book2
        b002.title = "All the Light We Cannot See ";
        b002.author = "Anthony Doerr";
        b002.genre = "Horror";
        b002.pages = 1040;
        b002.pubYear = 2021;

        // access the instances and print the details
        System.out.println(
                b001.title + " - " + b001.author + " - " + b001.genre + " - " + b001.pages + " - " + b001.pubYear);
        System.out.println(
                b002.title + " - " + b002.author + " - " + b002.genre + " - " + b002.pages + " - " + b002.pubYear);

        // default values
        System.out.println(
                b003.title + " - " + b003.author + " - " + b003.genre + " - " + b003.pages + " - " + b003.pubYear);
    }
}
