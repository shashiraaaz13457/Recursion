public class Concept_of_passingNo {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
//        fun(n--);   Giving Infinite loop
        // n-- v/s --n
        fun(--n);
    }

}
