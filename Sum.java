public class Sum {
    public static void main(String[] args) {
        int n = 5;
        int ans = Sum(n);
        System.out.println(ans);
    }
    static int Sum(int n){
        if (n <= 1){
            return 1;
        }
        return n + Sum(n-1);
    }
}
