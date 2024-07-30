import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        sc.close();
       /* do{ 
            int n=sc.nextInt();

            if (n%10==0) {
                break;

                
            }
            System.out.println(n);

        }while(true); */
        for(int i=1;i<=6;i++){
            if (i==4){
                continue;

            }
            System.out.println(i);
        }

    }
}
