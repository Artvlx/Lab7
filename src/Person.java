import java.util.Scanner;

public class Person {
    private String surname;
    private String firstName;
    private String street;
    private String zipCode;
    private String city;

    public void initialize(String surname, String firstName, String street, String zipCode, String city) {
        this.surname = surname;
        this.firstName = firstName;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;

    }
    public void print() {
        System.out.println("Surname: " + surname);
        System.out.println("First name: " + firstName);
        System.out.println("Street: " + street);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("City: " + city);
    }
}
class Staff extends Person {
    private String education;
    private String position;
    public void  initialize(String surname, String firstName,String zipCode,String street, String city, String education, String position) {
        super.initialize(surname, firstName, street, zipCode, city);
        this.education = education;
        this.position = position;
    }
    public void print(){
        super.print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }

}
class Main {
    public  static  void main
            (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Staff staff = new Staff();
        staff.initialize("Gasimov", "Mammadiyya", "02-776", "Dereniowa","Warsaw","Computer Engineer ","Student");
        staff.print();


}
}
