package function;

import java.util.*;
public class syntax_with_parameters {
    public static void calulatesum( int num1,int num2){
       
        int sum= num1+num2;
        
       
        System.out.println("sum is :"+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        sc.close();
        calulatesum(a,b);
    }
}
