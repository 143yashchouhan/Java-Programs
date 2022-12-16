import java.util.*;
class revclass {
     static int fun(int no) {
        int r, rem;
        r = 0;
        do {
            rem = no % 10;
            r = (r * 10) + rem;
            no = no / 10;
            System.out.print(rem);
        } while (no > 0);
        return r;
    }

}
public class revnumber{
    public static void main(String args[]){
        int noi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        noi = sc.nextInt();
        System.out.println("reverse number is : " + revclass.fun(noi));
    }
}
