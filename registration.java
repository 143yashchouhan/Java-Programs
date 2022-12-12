import java.util.*;

public class registration {
    public static void main(String[] args) {
        choice();
    }

    // Choice Funtion
    public static void choice() {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("REGISTRATION PROGRAM\n");
        System.out.println("[1] Register");
        System.out.println("[2] Login");
        System.out.print("Enter your Choice : ");
        ch = sc.nextInt();

        switch (ch) {

            case 1: {
                reg();
                break;
            }
            case 2: {
                login();
                break;
            }
        }
    }

    // Custome Funtion For input
    public static void reg() {
        Scanner sc = new Scanner(System.in);
        String firstname, lastname, gender, email, pass, conpass, country, state, city;
        System.out.print("Enter your First Name : ");
        firstname = sc.nextLine();
        System.out.print("Enter your Last Name : ");
        lastname = sc.nextLine();
        do {
            System.out.print("Enter your Gender M/F : ");
            gender = sc.nextLine();
        } while ((!gender.equals("m")) && (!gender.equals("M")) || (!gender.equals("f")) && (!gender.equals("F")));
        System.out.print("Enter your Email : ");
        email = sc.nextLine();
        System.out.println("Enter Password : ");
        pass = sc.nextLine();
        do {
            System.out.print("Enter Conform Password : ");
            conpass = sc.nextLine();
        } while (!conpass.equals(pass));

        System.out.print("Enter your country : ");
        country = sc.nextLine();
        System.out.print("Enter your State : ");
        state = sc.nextLine();
        System.out.print("Enter your City : ");
        city = sc.nextLine();
        System.out.print("REGISTRATION DONE");
    }

    // Login
    public static void login() {
        Scanner sc = new Scanner(System.in);
        String email, pass;
        System.out.print("Enter your Email : ");
        email = sc.nextLine();
        System.out.print("Enter Password : ");
        pass = sc.nextLine();
        // System.out.print("LOGIN SUCESSFULL");
    }
}
