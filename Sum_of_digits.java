public class Sum_of_digits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(SumOfDigit(n));
    }
    static int SumOfDigit(int n){
        if (n == 0){
            return 0;
        }
        return n%10 + SumOfDigit(n/10);
    }
}
