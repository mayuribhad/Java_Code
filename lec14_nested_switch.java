import java.util.Scanner;

public class lec14_nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int emp_Id = sc.nextInt();
        String Department = sc.nextLine();

        switch (emp_Id) {
            case 1: System.out.println("Mayuri");
                break;
            case 2: System.out.println("Krishna");
                break;
            case 3: System.out.println("Priya");
                break;
            case 4:System.out.println("Employee no 4");
                switch (Department) {
                    case "IT": System.out.println("IT Department");
                        
                        break;
                    case "Management" : System.out.println("MAnagement Department");
                        break;
                
                    default: System.out.println("No Department");
                        break;
                }
        
            default: System.out.println("Enter correct emp_Id");
                break;
        }
    }
    
}
