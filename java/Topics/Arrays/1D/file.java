class file{

    static void show(int n){
        System.out.println("Hello");
        if(n ==0){
            return ; // exit from teh function
        }
        show(n-1);
    }
    public static void main(String[] args) {
        show(5);
    }
}