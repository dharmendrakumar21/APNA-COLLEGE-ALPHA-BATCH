package ARRAY;


import java.util.Scanner;

public class array_creat {
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc =new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        sc.close();
        System.out.println("phy:"+ marks[0]);
        System.err.println("che :"+ marks[1]);
        System.out.println("math:"+ marks[2]);
        marks[2]=marks[2]+1;
        System.out.println("updated math marks:"+ marks[2]);
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage :"+ percentage);
        System.out.println("array length:"+ marks.length);

        // int num[]={1,2,3,};
        // String fruits[]={"apple", "mango","fig"};
        // System.out.println(marks);
        // System.out.println(num);
        // System.out.println(fruits);


        
    }
}
