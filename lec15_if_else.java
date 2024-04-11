public class lec15_if_else {
    public static void main(String[] args) {

        /*print
         * AAAAA
         * bbbbb
         * CCCCC
         * ddddd
         * EEEEE
         */
        for(int i = 1; i<=5;i++){
            for(int j = 1; j<=5; j++){
                if(i%2 != 0){
                    System.out.print((char)(i+64));
                }
                else{
                    System.out.print((char)(i+96));
                }
            }
            System.out.println();
        }

        /*print
         * EEEEE
         * ddddd
         * CCCCC
         * bbbbb
         * AAAAA
         */

         for(int i = 5;i>=1;i--){
            for(int j = 5; j>=1;j--){
                if(i%2 != 0){
                    System.out.print((char)(i+64));
                }
                else{
                    System.out.print((char)(i+96));
                }
            }
            System.out.println();
        }

        /*print
         * AbCdE
         * AbCdE
         * AbCdE
         * AbCdE
         * AbCdE
        */

        for(int i =5;i>=1; i--){
            for(int j = 1; j<=5; j++){
                if(j%2 != 0){
                    System.out.print((char)(j+64));
                }
                else{
                    System.out.print((char)(j+96));
                }
            }
            System.out.println();
        }

        /* print
         * EdCbA
         * EdCbA
         * EdCbA
         * EdCbA
         * EdCbA    
        */

        for(int i = 5; i>=1; i--){
            for(int j = 5; j>=1; j--){
                if(j%2 != 0){
                    System.out.print((char)(j+64));
                }
                else{
                    System.out.print((char)(j+96));
                }
            }
            System.out.println();
        }

        /*print
         * 11111
         * AAAAA
         * 11111
         * BBBBB
         * 11111
         */

         for(int i =1; i<=5; i++){
            for(int j =1;j<=5; j++){
                if(i%2 != 0){
                    System.out.print(1);
                }
                else{
                    System.out.print((char)(i+64));
                }
            }
            System.out.println();
         }
    }
    
}
