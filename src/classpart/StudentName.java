package classpart;

public class StudentName {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName( ) {
        return studentName;
    }

//    public void setStudentName(String Name) {
//        studentName = Name;
//    }
    public static void main(String[ ] args) {
        StudentName studentSon = new StudentName( );    // StudentName 클래스 생성
        studentSon.studentName = "손범수";

        System.out.println(studentSon.studentName);
        System.out.println(studentSon.getStudentName( ));
    }
}
