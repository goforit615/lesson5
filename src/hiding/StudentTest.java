package hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        //studentLee.studentName = "이병헌";
        studentLee.setStudentName("이병헌");

        System.out.println(studentLee.getStudentName());
    }
}
