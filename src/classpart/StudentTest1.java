package classpart;

public class StudentTest1   {
    public static void main(String[] args) {
        StudentName student1 = new StudentName();   // 첫 번째 학생 생성
        student1.studentName = "손범수";
        System.out.println(student1.getStudentName());
        StudentName student2 = new StudentName();   // 두 번째 학생 생성
        student2.studentName = "임진주";
        System.out.println(student2.getStudentName());
    }
}
