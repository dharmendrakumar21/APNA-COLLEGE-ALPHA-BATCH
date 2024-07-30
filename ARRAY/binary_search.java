package ARRAY;

public class binary_search {
    public static int binarysearch(int numbers[], int key){

        int start=0;
        int end= numbers.length-1;
        while (start<=end) { 
            int mid=(start+end)/2;
            // comparission
            if (numbers[mid]== key) {
            return mid;

                
            }
            if (numbers[mid]<key) {//right
                start=mid+1;

                
            }else{
                end=mid-1;
            }

            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16,};
        int key=12;
        System.out.println("index key is"+ binarysearch( numbers, key));
    }
    // time complexcity log(n)
}
