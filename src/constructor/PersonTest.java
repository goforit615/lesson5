package constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person personKim = new Person( );
        personKim.name = "김구";
        personKim.weight = 85.5F;
        personKim.height = 180.0F;

        Person personLee = new Person("이순신", 175, 175);
    }
}
