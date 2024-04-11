import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle ");
        float p = sc.nextFloat();

        System.out.println("Enter intrest ");
        float i = sc.nextFloat();

        System.out.println("Entr time ");
        float t = sc.nextFloat();

        float s1 = (p*i*t)/100;

        System.out.println("Simple Intrest is: " +s1);


    }
    
}
