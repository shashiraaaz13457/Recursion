public class No1_to_N_Recursion {
    public static void main(String[] args) {
        int n = 5;
//        fun(n);
        funBoth(n);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
