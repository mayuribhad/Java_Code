public class lec0_unary {
    public static void main(String[] args) {

        /*
         * Unary operator contains 
         * increment and decrement
         * ++a, --a, a++, a--
         */
        
        int a = 10;
        int b = a++ + ++a;
        System.out.println(b);

        int c=20, sum = 0;
        sum%=c;
        System.out.println(sum);
    }


    
}
