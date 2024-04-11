import java.util.Scanner;

public class m_evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int num = sc.nextInt();

        if(num %2 == 0){
            System.out.println("no is even");
        }
        else{
            System.out.println("no is odd");
        }
        
    }
    
}
