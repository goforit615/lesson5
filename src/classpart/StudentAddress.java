package classpart;

public class StudentAddress {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);        // 이름, 주소 출력
    }
}
