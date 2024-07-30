import java.util.Scanner;

public class passorfail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int marks=sc.nextInt();
        sc.close();
        String student=marks>=33?"pass":"fail";
        System.out.println(student);

    }
    
}
