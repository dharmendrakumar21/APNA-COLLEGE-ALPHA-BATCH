import java.util.Scanner;

public class between3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        if (a>b&& a>c){
            System.out.println("a is greater than b and c"  +a);

        }
        else if(b>a&& b>c){
            System.out.println("b is greater than a and c"  +b);

        }
        else{
            System.out.println(" c is greater than a and b" +c);
        }
    }
    
}
