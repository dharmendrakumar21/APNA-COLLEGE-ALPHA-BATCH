import java.util.Scanner;

public class circle {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        float rad= sc.nextFloat();
        sc.close();
        float area =3.14f * rad * rad;
        System.out.println(area);


    }
}
