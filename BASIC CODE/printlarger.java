import java.util.Scanner;

public class printlarger {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        if (a>b) {
            System.out.println( "a greater than b" + a);
            
        } else {
            System.out.println( "b greater then a" + b);
            
        }
    }
}
