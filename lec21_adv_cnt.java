public class lec21_adv_cnt {
    public static void main(String[] args) {

        /*print
         *      5
         *     444
         *    33333
         *   2222222
         *  111111111
         */
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = i; j<n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(i*2)-1;j++){
                System.out.print(n-i+1);
            }
            System.out.println();
        }

        /*print
         *      1
         *     121
         *    12321
         *   1234321
         *  123454321
         */

        n =5;
        for(int i = 1; i<=n;i++){
            for(int j = i; j<n;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }
            for(int j = i-1; j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        n = 5;
        for(int i = 1; i<=n;i++){
            for(int j = i; j>1;j--){
                System.out.print(" ");
            }
            for(int j = i; j<=(n*2)-i;j++){
                System.out.print((char)((i%2 != 0)?i+ 64:i+ 96));
            }
            System.out.println();
        }

        /*print
         *      1
         *     222
         *    33333
         *   4444444
         *  555555555
         */
        n = 5;
        for(int i = 1; i<=n;i++){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(i*2)-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        /*print
         *      1
         *     212
         *    32123
         *   4321234
         *  543212345
         */

         n = 5;
         for(int i = 1;i<=n;i++){
            for(int j =i;j<n; j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            for(int j = 2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
         }

        n =5;
        for(int i = n; i>=1;i--){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = n; j>=i;j--){
                System.out.print(j);
            }
            for(int j = i+1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /*      5
         *     454
         *    34543
         *   2345432
         *  123454321
         */

        n = 5;
        for(int i =n;i>=1;i--){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = i;j<=n;j++){
                System.out.print(j);
            }
            for(int j = n-1;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        /*
         *   E
            ddd
           CCCCC
          bbbbbbb
         AAAAAAAAA
         */
        n = 10;
        for(int i =1;i<=n;i++){
            for(int j = i; j<n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(i*2)-1;j++){
                System.out.print((char)((i % 2 != 0)?(n-i+1)+ 64: (n-i+1)+ 96));
           
            }
            System.out.println();
        }

        /*123454321
         * 1234321
         *  12321
         *   121
         *    1
         */

        n = 5;
        for(int i = 5;i>=1;i--){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }
            for(int j = i-1; j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        /*543212345
         * 4321234
         *  32123
         *   212
         *    1
         */
        n = 5;
        for(int i =n;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j= i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /*111111111
         * 2222222
         *  33333
         *   444
         *    5
         *   444
         *  33333
         * 2222222
         *111111111
         */

         n = 5;
        for(int i = 1;i<=5;i++){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = i;j<=(n*2)-i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i =2;i<=n;i++){
            for(int j =i;j<n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(i*2)-1;j++){
            System.out.print(n-i+1);
            }
            System.out.println();
        }
           
        /*555555555
         * 4444444
         *  33333
         *   222
         *    1
         *   222
         *  33333
         * 4444444
         *555555555
         */
        n = 5;
        for(int i = 1; i<=n;i++){
            for(int j =i;j>1;j--){
                System.out.print(" ");
            }
            for(int j =i;j<=(n*2)-i;j++){
                System.out.print(n-i+1);
            }
            System.out.println();
        }
        for(int i =2;i<=n;i++){
            for(int j =i;j<n;j++){
                System.out.print(" ");
            }
            for(int j =1; j<=(i*2)-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        /*123454321
         * 2345432
         *  34543
         *   454
         *    5
         *   454
         *  34543
         * 2345432
         *123454321
         */

        n = 5;
        for(int i = 1;i<=n;i++){
            for(int j =i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            for(int j=n-1;j>=i;j--)
                System.out.print(j);
            System.out.println();
        }
        for(int i = n-1;i>=1;i--){
            for(int j = i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            for(int j=n-1;j>=i;j--)
                System.out.print(j);
            System.out.println();    
        }
        
        /*EdCbAbCdE
         * dCbAbCd
         *  CbAbC
         *   bAb
         *    A
         *   bAb
         *  CbAbC
         * dCbAbCd
         *EdCbAbCdE
         * 
         */
         
         n =5;
        for(int i = n;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print((char)((j % 2 != 0)?j+ 64:j+96));
            }
            for(int j =2;j<=i;j++){
                System.out.print((char)((j%2 != 0)?j+64:j+96));
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print((char)((j %2 !=0)?j+64:j+96));
            }
            for(int j=2;j<=i;j++){
                System.out.print((char)((j %2 != 0)?j+64:j+96));
            }
            System.out.println();
        }
    
    }
}
