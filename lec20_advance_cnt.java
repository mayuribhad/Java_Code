import java.net.SocketPermission;

import javafx.scene.effect.Light.Spot;

public class lec20_advance_cnt {
    public static void main(String[] args) {

        /*print
         * 1
         * 22
         * 333
         * 4444
         * 55555
         * 4444
         * 333
         * 22
         * 1
         * 
         */
        
         int n = 5;
         for(int i =1; i<=(n*2)-1;i++){
            if(i <= n){
                for(int j = i; j>=1;j--){
                    System.out.print(i);
                }
            }
            else{
                for(int j = i; j<=(n*2)-1; j++){
                    System.out.print((n*2)-i);
                }
            }
             System.out.println();   
            
         }

        /*print
         * 5
         * 44
         * 333
         * 2222
         * 11111
         * 2222
         * 333
         * 44
         * 5
         */

         int m = 5;
        for(int i = 1; i<=(m*2)-1;i++){
            if(i <= m){
                for(int j = i;j>=1;j--){
                    System.out.print((m-i+1));
                }
            }
            else{
                for(int j = i; j<= (m*2)-1;j++){
                    System.out.print(i-m+1);
                }
            }
            System.out.println();
            
        }

        /*print
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */

        int a=5;
        for(int i = 1; i<=(a*2)-1;i++){
            if(i<=a){
                for(int j = 1;j<=i;j++){
                    System.out.print(j);
                }
            }
            else{
                for(int j = 1; j <=(n*2)-i;j++){
                    System.out.print(j);
                }
            }
            System.out.println();
            
        }

        /*print
         * 1
         * 21
         * 321
         * 4321
         * 54321
         * 4321
         * 321
         * 21
         * 1
         */

        n = 5;
        for(int i = 1; i<= (n*2)-1; i++){
            if(i<=n){
                for(int j = i; j>=1; j--){
                    System.out.print(j);
                }
            }
            else{
                for(int j = (n*2)-i; j>=1; j--){
                    System.out.print(j);
                }
            }
            System.out.println();
            
        }

        /*print
         * 5
         * 54
         * 543
         * 5432
         * 54321
         * 5432
         * 543
         * 54
         * 5
         */

         n = 5;
        for(int i = 1; i<=(n*2)-1;i++){
            if(i <= n){
                for(int j = 1;j<=i;j++){
                    System.out.print(n-j+1);
                }
            }
            else{
                for(int j = 1; j<= (n*2)-i; j++){
                    System.out.print(n-j+1);
                }
            }
            System.out.println();
        }

        /*print
         * 5
         * 45
         * 345
         * 2345
         * 12345
         * 2345
         * 345
         * 45
         * 5  
         */

        n = 5;
        for(int i = 1;i<=(n*2)-1;i++){
            if(i<=n){
                for(int j = i;j>=1;j--){
                    System.out.print(n-j+1);
                }
            }
            else{
                for(int j = (n*2)-1;j>=i; j--){
                    System.out.print(j-n+1);
                }
            }
            System.out.println();

        }

        /*print
         * 12345
         * 2345
         * 345
         * 45
         * 5
         * 45
         * 345
         * 2345
         * 12345
         * 
         */

         n = 5;
         for(int i =1; i<=(n*2)-1;i++){
            if(i<=n){
                for(int j = i; j<=n;j++){
                    System.out.print(j);
                }
            }
            else{
                for(int j = (n*2)-i; j<=n; j++){
                    System.out.print(j);
                }
            }
            System.out.println();
         }

         /*print
          *55555
          4444
          333
          22
          1
          22
          333
          4444
          55555
          */

        n =5;
        for(int i = 1; i<= (n*2)-1;i++){
            if(i<=n){
                for(int j=i; j<=n;j++){
                    System.out.print(n-i+1);
                }
            }
            else{
                for(int j = (n*2)-i;j<=n;j++){
                    System.out.print(i-n+1);
                }
            }
            System.out.println();
        }

        /*print
         * 11111
         * 2222
         * 333
         * 44
         * 5
         * 44
         * 333
         * 2222
         * 11111
         */
        n = 5;
        for(int i =1; i<=(n*2)-1;i++){
            if(i <= n){
                for(int j = i;j<=n;j++){
                    System.out.print(i);
                }
            }
            else{
                for(int j = i;j>=5;j--){
                    System.out.print((n*2)-i);
                }
            }
            System.out.println();
        }

        /*print
         * 54321
         * 4321
         * 321
         * 21
         * 1
         * 21
         * 321
         * 4321
         * 54321
         */

        n = 5;
        for(int i = 1; i<= (n*2)-1;i++){
            if(i <= n){
                for(int j = (n-i)+1; j>=1;j--){
                    System.out.print(j);
                }
            }
            else{
                for(int j = (i-n)+1;j>=1;j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        /*print
         * 54321
         * 5432
         * 543
         * 54
         * 5
         * 54
         * 543
         * 5432
         * 54321
         */

        // n = 5;
        // for(int i = 1; i<=(n*2)-1;i++){
        //             if(i<=n){
        //         for(int j = n;j>=i;j--){
        //             System.out.print(j);
        //         }
        //     }
        //     else{
        //         for(int j = i; j>=n;j--){
        //             System.out.print();
        //         }
        //     }
        // }

        /*print
         *      *
         *     **
         *    ***
         *   ****
         *  *****
         *   ****
         *    ***
         *     **
         *      *
         */


         n = 5;
         for(int i = 1;i<=(n*2)-1;i++){
            if(i <=n){
                for(int j = i; j<n;j++){
                    System.out.print(" ");
                }
                for(int j = i;j>=1;j--){
                    System.out.print("*");
                } 
            }
            else{
                for(int j = (n*2)-i; j<n;j++){
                    System.out.print(" ");
                }
                for(int j = i;j<=(n*2)-1;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        /*
         * *****
         *  ****
         *   ***
         *    **
         *     *
         *    **
         *   ***
         *  ****
         * *****
         */

        n = 5;
        for(int i = 1; i<=(n*2)-1;i++){
            if(i<=n){
                for(int j =i;j>1;j--)
                System.out.print(" ");
                for(int j=i;j<n;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = 1;j<n;j++)
                System.out.print(" ");
                for(int j = i;j>)
            }
            System.out.println();
        }
    }
    
}

