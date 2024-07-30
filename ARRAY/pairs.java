package ARRAY;

public class pairs {
    public static void printpair(int numbers[]){
        int tp=0;
        for(int i=0; i<numbers.length;i++){
            int curr= numbers[i];
            for( int j=i+1;j<numbers.length;j++){
                System.out.print ("(" + curr+","+ numbers[j] +")");
                tp++;
            }

            System.out.println();   
        }
        System.out.println("total numbers of pairs"+ tp);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,5,6,8,9};  
        printpair(numbers);

    }
}
