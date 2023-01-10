import java.util.*;

public class StudentDatabase {
    public static void main(String[] args) {
        int noFoStudents;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number of students you wanna add : ");
        noFoStudents = sc.nextInt();
        Student[] stud = new Student[noFoStudents];

        for (int i = 0; i < noFoStudents; i++) {
            stud[i] = new Student();
            stud[i].course();
            stud[i].totalfee();
            stud[i].payfee();
        }
        for (int i = 0; i < noFoStudents; i++) {
            stud[i].display();
        }

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
    private int feepaid;
    private static int coursefee = 600;
    private static int id = 1000;

    // CONSTRUCTOR use name and year
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Student First Name : ");
        firstname = sc.nextLine();
        System.out.print("Enter Student Last Name : ");
        lastname = sc.nextLine();
        System.out.print("1. First Year\n2. Second Year\n3. Third Year\nEnter Your Year : ");
        gradeyear = sc.nextInt();
        generateid();
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
        System.out.print("\nCourse (600 Per Course) \n1. Java\n2. Python\n3. Php\n4. C++\n5. Q to quit\n");
        do {
            System.out.print("Name The Course (explicitly) : ");
            course = sc.nextLine();
            if (!course.equals("Q") && !course.equals("q")) {
                courses = courses + "\n  " + course + ",";
                tutionfee = tutionfee + coursefee;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("Enrolment Done");
    }

    // TOTAL FEE
    public void totalfee() {
        System.out.println("Your Total Fees is : " + tutionfee);
    }

    // FEE
    public void payfee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Your Payment Amount : ");
        feepaid = sc.nextInt();
        tutionfee = tutionfee - feepaid;
        System.out.println("\n------------------");
        System.out.println("Thanks for paying of " + feepaid);
        System.out.println("Remaining Fees : " + tutionfee);
        System.out.println("------------------");
    }

    // DISPLAY ALL
    public void display() {
        System.out.println("-----------------------");
        System.out.println("Name : " + firstname + " " + lastname);
        System.out.println("Grade Year : " + gradeyear);
        System.out.println("SID : " + sid);
        System.out.println("Enroled In : " + courses);
        System.out.println("Fee Remaining : " + tutionfee);
        System.out.println("-----------------------");
    }

}