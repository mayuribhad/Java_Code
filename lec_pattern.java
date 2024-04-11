
public class lec_pattern {
    public static void main(String[] args) {
        int n = 5;
       for(int i = n;i>=1;i--){
            for(int j = 1;j<=n;j++){
                if(i==j || j==n|| i== 1){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
       }


       for(int i =n;i>=1;i--){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
       }
    }

}

   