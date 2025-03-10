
/**
 * Introduce an abstract class Item that will serve as the parent for both Book and Magazine
    * attributes: title, year, pageCount
    * Modify class Book extends Item Create and class Magazine extends Item 
    * attributes: issn, issueNumber
*/
package fr.ensai.library;

public abstract class Item {

    // Attributes
    protected String title;
    protected int year;
    protected int pageCount;

    // Constructor
    public Item(String title, int year, int pageCount) {
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }

    // Abstract method to enforce implementation in child classes
    
}
