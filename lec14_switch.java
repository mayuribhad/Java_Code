import java.util.Scanner;

public class lec14_switch {
    public static void main(String[] args) {
        int a = 3, b = 5;
        Scanner c = new Scanner(System.in);
        int choice = c.nextInt();
        switch(choice){
            case 1: System.out.println("Addition " +(a+b));
                break;
            case 2: System.out.println("Substraction "+(a-b));
                break;
            case 3: System.out.println("Division "+(a/b));
                break;
            case 4: System.out.println("Multiplication "+(a*b));
                break;
            default: System.out.println("Invalid input");

        }

        /*print days of week */
        /*month of year */
    }
    
}
