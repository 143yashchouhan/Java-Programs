import java.io.FilterInputStream;
import java.util.*;

public class StudentDatabase {
    public static void main(String[] args) {
        Student stud = new Student();
        stud.course();
        stud.totalfee();
    }
}

class Student {
    // VARIABLES
    private String firstname;
    private String lastname;
    private int gradeyear;
    private String sid;
    private String courses;
    private int tutionfee = 0;
    private static int coursefee = 600;
    private static int id = 1000;

    // CONSTRUCTOR use name and year
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student First Name : ");
        firstname = sc.nextLine();
        System.out.print("Enter Student Last Name : ");
        lastname = sc.nextLine();
        System.out.print("1. First Year\n2. Second Year\n3. Third Year\nEnter Your Year : ");
        gradeyear = sc.nextInt();
        generateid();
        System.out.println("------------------");
        System.out.println(firstname + " " + lastname + " " + gradeyear + " " + sid);
        System.out.println("------------------");
    }

    // GENRTAE ID
    private void generateid() {
        id++;
        sid = gradeyear + "" + id;
    }

    // ENROLL IN COURSE
    public void course() {
        Scanner sc = new Scanner(System.in);
        String course;
        System.out.print("\nCourse \n1. Java\n2. Python\n3. Php\n4. C++\n5. Q to quit\n");
        do {
            System.out.print("\nName The Course (explicitly) : ");
            course = sc.nextLine();
            if (!course.equals("Q") && !course.equals("q")) {
                courses = courses + "\n" + course;
                tutionfee = tutionfee + coursefee;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.print("Enrolled In : " + courses);
        System.out.println("\nTution Fee : " + tutionfee);
    }

    // TOTAL FEE
    public void totalfee(){
        System.out.println("Your Total Fees is : " + tutionfee);
    }

    // FEE

    // SHOW PRINT

}