package function;

import java.util.Scanner;



public class syntax_try {

    public static int helloworld(){
     
        System.out.println("dharmendra gangwar");
        System.out.println("dharmendra gangwar");
    return 3;
    }
    public static void sum(int num1,int num2){//parameter or formal parameter
        int add= num1 + num2;
        System.out.println("sum is :"+add);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        sum(a,b);//argument or actual parameter calling defination


    
    }
}
