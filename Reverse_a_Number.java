public class Reverse_a_Number {
    public static void main(String[] args) {
        int n = 1345;
//        reverse(n);
//        System.out.println(sum);
//        System.out.println(reverse(n));
        System.out.println(reverse2(n));
    }

    // Way - 1
    static int sum = 0;
    static void reverse (int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }

    // Way-2
    static int reverse2 (int n){
        //sometimes you might need some additional variables in the argument
        // in that case, make another function.
        int digit = (int)(Math.log10(n)) + 1; //total number of digit.
        return helper(n,digit);
    }
    static int helper(int n, int digit){
        if (n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digit-1)) + helper(n/10,digit-1);
    }
}
