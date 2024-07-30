package revision;


import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count =1;
        sc.close();
       while(count<= n)
        {
            System.out.println(count);
            count++;

        }
        System.out.println();
    }
}
