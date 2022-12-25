import java.util.*;

public class date {
    public static void main(String[] args) {

        int month, days, input;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No. of Days : ");
        input = sc.nextInt();
        month = input / 30;
        System.out.println("Months : " + month);
        days = input - (month * 30);
        System.out.println("Days : " + days);

    }
}
