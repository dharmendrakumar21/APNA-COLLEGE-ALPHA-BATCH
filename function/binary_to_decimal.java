package function;

public class binary_to_decimal {
    
    public static void bintodec( int binnum){
        int mynum=binnum;
        int pow=0;
        int decnum=0;
        while(binnum>0){
            int lastdight = binnum%10;
            decnum=decnum+ (lastdight*(int)Math.pow(2, pow));

            pow++;
            binnum= binnum/10;

        }
        System.out.println("decimal of"+ mynum + "=" + decnum);
    }
    public static void main(String[] args) {
bintodec(101);
        
    }
}
