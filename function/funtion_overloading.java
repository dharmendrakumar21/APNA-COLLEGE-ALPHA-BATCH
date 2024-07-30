package function;



public class funtion_overloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(022, 0223));
        System.out.println(sum(2.8f, 2.2f));
        
    }
}
