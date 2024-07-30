package function;



public class binomial {

    public static int factorial(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
            

        }
        return f;

    }
    public static int bincoff(int n,int r){
        int fact_n = factorial(n);
        int fact_r=factorial(r);
        int fact_nmr= factorial(n-r);
        int bincoff=fact_n/(fact_r*fact_nmr);
        return bincoff;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a, int b,int c){
        return a+b+ c ;
    }

    public static void main(String[] args) { 
        System.out.println(bincoff(10, 04));
        System.out.println(sum(3,5));
        System.out.println(sum(2, 03, 06));
       
    }
    
}
