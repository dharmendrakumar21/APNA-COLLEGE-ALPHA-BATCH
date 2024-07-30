package function;

public class swap {
    public static void sawping( int a,int b){
        
       
         int temp =a;

        a=b;
        b= temp;
        System.out.println("swaped value a is "+a);
        System.out.println("swaped value b is "+b);
    }
    public static void main( String args[]){
        int a=20;
        int b=17;
        sawping(a,b );
       

    }
}
