public class twospower{

    static int power(int n, int x){
        if (x ==0){
            return 1 ;
        }
        else if(x>0){
            return n * power(n, x-1);
        }
        else{
            return 1/power(n, -x);
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }    
}
