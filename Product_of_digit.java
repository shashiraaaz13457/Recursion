public class Product_of_digit {
    public static void main(String[] args) {
        int n= 5342;
//        ProductOfDigit(n);
        System.out.println(ProductOfDigit(n));
    }
    static int ProductOfDigit(int n){
        if(n == 0){
            return 1;
        }
        return (n%10) * ProductOfDigit(n/10);
    }
}
