public class numberExampleUsingRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        //Base Condition : It is the condition to break the infinite loop.
//                            or Here the recursion stops making calls.
        if (n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //tail recursion
        //this is the last function call
        print(n+1);
    }
}
