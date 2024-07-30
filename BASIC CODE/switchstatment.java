import java.util.Scanner;

public class switchstatment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        sc.close();
        switch(number){
            case 1:System.out.println("dharmendra");
            break;
            
            case 2:System.out.println("ankush");
            break;
            case 3:System.out.println("amandeep");
            break;
            case 4:System.out.println("atul");
            break;
            case 5: System.out.println("dheraj");
            break;
            default:System.out.println("alone");
        }
    }
    
}
