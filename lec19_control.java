public class lec19_control {
    public static void main(String args[]){
        // int n = 5;
        /*print 
         * A
           bb
           CCC
           dddd
           EEEEE
         */
        for(int i =1; i<=5;i++){
            for(int j = i;j>=1;j--){
                if(i % 2 == 0){
                    System.out.print((char)(i+96));
                }
                else{
                    System.out.print((char)(i+64));
                }
                
            }
            System.out.println();

        }

        /*print
         * E
           dd
           CCC
           bbbb
           AAAAA
         */

        for(int i = 5;i>=1;i--){
            for(int j= i;j<=5;j++){
                if(i % 2 == 0){
                    System.out.print((char)(i+96));
                }
                else{
                    System.out.print((char)(i+64));
                }
            }
            System.out.println();
        }

        /*print
         * A
           bA
           CbA
           dCbA
           EdCbA
         */

        for(int i = 1;i<=5;i++ ){
            for(int j = i;j>=1;j--){
                if(j % 2 == 0){
                    System.out.print((char)(j+96));
                }
                else{
                    System.out.print((char)(j+64));
                }
            }
            System.out.println();
        }

        /*print
         * E
           dE
           CdE
           bCdE
           AbCdE
         */
        for(int i = 5; i>=1; i--){
            for(int j = i;j<=5;j++){
                if(j % 2 ==0){
                    System.out.print((char)(j+96));
                }
                else{
                    System.out.print((char)(j+64));
                }
            }
            System.out.println();
        }

        /*print
         * AAAAA
           bbbb
           CCC
           dd
           E
         */
        for(int i = 1; i<= 5;i++){
            for(int j = i; j<=5;j++){
                if(i %2==0){
                    System.out.print((char)(i+96));
                }
                else{
                    System.out.print((char)(i+64));
                }
            }
            System.out.println();
        }

        /*print
         * EEEEE
           dddd
           CCC
           bb
           A
         */

        for(int i = 5; i>=1;i--){
            for(int j = i; j>=1;j--){
                if(i%2==0){
                    System.out.print((char)(i+96));
                }
                else{
                    System.out.print((char)(i+64));
                }
            }
            System.out.println();
        }
    
        /*print
         * AbCdE
           bCdE
           CdE
           dE
           E
         */
        for(int i = 1; i<=5; i++){
            for(int j = i; j<=5; j++){
                if(j % 2 == 0){
                    System.out.print((char)(j+96));
                }
                else{
                    System.out.print((char)(j+64));
                }
            }
            System.out.println();
        }
    }
}
