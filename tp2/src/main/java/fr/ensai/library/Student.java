package fr.ensai.library;

/*
 * Create a class Student
 * attributes: name, age, academicYear, isClassDelegate
 */
public class Student {

    // Attributes
    private String name;
    private int age;
    private int academicYear;
    private boolean isClassDelegate;

    /**
     * Constructs a new Book object.
     */
    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        this.name = name;
        this.age = age;
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }


}
