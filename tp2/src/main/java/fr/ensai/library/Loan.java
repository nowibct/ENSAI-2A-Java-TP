package fr.ensai.library;

/*
 * Create a class Loan
 * attributes: student, item, startDate, returnDate (null at creation)
 * methods: setReturnDate() to update the return date, toString() returning a String like “Item xxx borrowed by yyy.”
 */
public class Loan {

    // Attributes
    private Student student;
    private Item item;
    private localDate startDate;
    private localDate returnDate;

    /**
     * Constructs a new Book object.
     */
    public Loan(Student student, Item item, localDate startDate, localDate returnDate = NULL){
        this.student = student;
        this.item = item;
        this.startDate = startDate;
        this.returnDate = returnDate
    }

    @Override
    public String toString() {
        return "Item " + item + " borrowed by " + student.toString();
    }

}
