public class Main {
    public static void main(String[] args) {

        // Membuat 3 objek Student
        Student s1 = new Student("221001001", "Andi", 3.75);
        Student s2 = new Student("221001002", "Budi", 3.40);
        Student s3 = new Student("221001003", "Citra", 3.90);

        // Menampilkan data
        s1.display();
        s2.display();
        s3.display();
    }
}
