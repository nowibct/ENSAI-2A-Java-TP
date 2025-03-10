package fr.ensai.library;

public class Main {

    public static void main(String[] args) {
        // * instance of a book
        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());

        // * instance of two magazines
        Magazine mag1 = new Magazine("1234", "Oui Oui", 2025, 0, 0);
        Magazine mag2 = new Magazine("5678", "Non Non", 2025, 1, 1);

        // * instance of a library
        Library testlib = new Library("TestLib");
        testlib.loadItemsFromCSV("books.csv");

        // * Add the two new objects to the existing library
        testlib.addItem(fellowshipOfTheRing);
        testlib.addItem(mag1);
        testlib.addItem(mag2);

        // * Display everything
        testlib.displayItems();

    }
}
