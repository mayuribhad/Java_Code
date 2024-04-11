import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.println("Enter the no:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
            int i = 1;
        while(i<=n){
            if(n % i == 0){
                count = count +1;
                i = i+1;
            }
            if(count == 2){
                System.out.println("No is prime");
            }
            else{
                System.out.println("No is not prime");
            }
        }
    }
    
}
