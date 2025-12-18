public class Student {
    private String npm;
    private String name;
    private double gpa;

    // Constructor
    public Student(String npm, String name, double gpa) {
        this.npm = npm;
        this.name = name;
        this.gpa = gpa;
    }

    // Getters
    public String getNpm() {
        return npm;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Display method
    public void display() {
        System.out.println("Student " + npm + " - " + name + ", GPA: " + gpa);
    }
}
