public class Count_zeros {
    public static void main(String[] args) {
        int n = 30004;
        System.out.println(countZeros(n));
    }
    static int countZeros(int n){
        return helper(n,0);
    }
    static int helper(int n, int count){
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
