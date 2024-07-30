package revision;
import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum =0 ;
        int i=1;
        sc.close();
        while (i<=n) {
            sum=sum+i;
            i++;
            
        }
        System.out.println(sum);
        // for loop
        for(int d=1;d<=n;d++){
            System.out.println("******");
            
        }
    }
}
