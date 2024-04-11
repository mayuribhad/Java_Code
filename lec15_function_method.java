import java.util.Scanner;

public class lec15_function_method {
    // public static int calculateProduct(int a, int b){
         
    //     return a*b;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt(); 
    //     System.out.println("product of 2 no is:"+ calculateProduct(a, b));

    // public static void factorial(int n){
    //     int factorial = 1;
    //     for(int i = n; i>=1;i--){
    //         factorial = factorial *i;
    //     }
    //     System.out.println(factorial);
    //     // return;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     factorial(n);  //call function
    // }

    public static void evenOdd(int n){
        if(n % 2 == 0){
            System.out.println("No is even");
        }
        else{
            System.out.println("no is odd");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOdd(n);
    }
        
        
}

        

