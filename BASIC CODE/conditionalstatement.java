import java.util.Scanner;

public class conditionalstatement {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.close();
        if (age>=18) {
            System.out.println("adult you donet vote");
        }
         if(age>13 && age<18){
            System.out.println("teenager");
         }   

            
         else {
            System.out.println("not adult");
            
        }

    }
}
