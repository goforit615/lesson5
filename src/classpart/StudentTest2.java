package classpart;

public class StudentTest2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "손범수";

        Student student2 = new Student();
        student2.studentName = "임진주";

        System.out.println(student1.studentName);
        System.out.println(student2.studentName);
    }
}
