package fr.ensai.library;

/*
 * Create class Magazine extends Item
 * attributes: issn, issueNumber
 */
public class Magazine extends Item {

    // Attributes
    private String issn;
    private int issueNumber;

    // Constructor
    public Magazine(String issn, String title, int year, int pageCount, int issueNumber) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }
}
