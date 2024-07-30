package revision;

public class revers {
    public static void main(String[] args) {
        
    
    int n=15102005;
    while(n>0){
        int lastdigit=n%10;
        System.out.print(lastdigit+"");
        n=n/10;
    }
}
}