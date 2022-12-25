import java.util.*;
public class a2pro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("1. Category");
        System.out.println("2. Product");
        System.out.println("3. Display Bill");
        System.out.println("4. Display All");
        System.out.print("Enter your choice : ");
        ch = sc.nextInt();
        switch(ch){
            // Category
            case 1:{
                category();
            }
            //Product
            case 2:{
                product();
            }
            case 3:{
                disbill();
            }
        }
    }

    //CATEGORY INPUT
    public static void category(){
        Scanner sc = new Scanner(System.in);
        int ich, cid;
        String cname;
        float gstr;
        System.out.println("1. Add Category");
                System.out.println("2. Manage Category");
                System.out.print("Enter your Choice : ");
                ich = Integer.parseInt(sc.nextLine());
                if(ich == 1){
                    System.out.print("Category ID :");
                    cid = Integer.parseInt(sc.nextLine());
                    System.out.print("Category Name : ");
                    cname = sc.nextLine();
                    System.out.print("GST Rate : ");
                    gstr = sc.nextFloat();
                    System.out.println("SUCCESSFULL");
                }
                if(ich == 2){
                    System.out.println("1. Edit Category");
                    System.out.println("2. Delet Category");
                }
    }

    //PRODUCT 
    public static void product(){
        Scanner sc = new Scanner(System.in);
        int pid, cid, total;
        String pname;
        System.out.print("Product ID : ");
        pid = Integer.parseInt(sc.nextLine());
        System.out.print("Product Name : ");
        pname = sc.nextLine();
        System.out.print("Category ID : ");
        cid = sc.nextInt();
        System.out.print("Total : ");
        total = sc.nextInt();
        System.out.println("DONE");
    }

    //DISPLAY BILL
    public static void disbill(){
        int pid;
        System.out.println(pid);
    }
    
    // String pname, cname;
    // int cid, pid, total, gtotal;
    // float gstr, cgst, sgst;
}
