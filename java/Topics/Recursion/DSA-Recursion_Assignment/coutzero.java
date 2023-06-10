public class coutzero {

    static int countzero(int n){
        
        if (n == 0){

            return 0;
        }
        else if(n%10==0){
                
                return 1 + countzero( n/10);
            }
        return countzero(n/10);
            
        }
    
    public static void main(String[] args) {
        System.out.println(countzero(10203000));
    }
}
