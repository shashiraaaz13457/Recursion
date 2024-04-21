public class Fibonacci_Number {
    public static void main(String[] args) {
//        int ans = fibo(6);
//        System.out.println(ans);
//        for (int i = 0; i < 11; i++) {
//            System.out.println(fiboformula(i));
//        }
        System.out.println(fiboformula(9));
    }
    //Using formula for printing fibo no.
    static float fiboformula(float n){
        return (float)(Math.pow(((1 + Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
//    static int fibo(int n){
//        //base condition
//        if (n < 2){
//            return n; //It is for 0 and 1
//        }
//
//        //this is not tail recursion because here its not the last function call ,here two function calls are adding and then returning the value.
//        return fibo(n-1) + fibo(n-2);
//    }
}
