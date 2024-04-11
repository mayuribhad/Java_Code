public class lec6_star_pattern {
    
    public static void main(String[] args) {

        /* print square of star pattern
         * *****
           *****
           *****
           *****
         */

        for(int i = 1; i<= 5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        /* print mirror image of star pattern
         * *****   *****
         * *****   *****
         * *****   *****
         * *****   *****
         * *****   ***** 
         */

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print("*");
                    
            }
            System.out.print("\t");
            for(int j = 1; j<= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        /*Print square pattern of ABCDE
         * AAAAA
         * BBBBB
         * CCCCC
         * DDDDD
         * EEEEE
         */

        for(char i = 'A'; i<='E';i++){
            for(char j = 'A'; j<= 'E'; j++){
                System.out.print(i);
            }
            System.out.println();

        }


        /*Square pattern of no
         * 11111
         * 22222
         * 33333
         * 44444
         * 55555
         */
        
         for(int i = 1; i<=5; i++){
            for(int j = 5; j>=1; j--){
                System.out.print(i);
            }
            System.out.println();
        }


        /*Left Triangle star pattern
         * *
         * **
         * ***
         * ****
         */
        
         for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*Left triangle no pattern
         * 1
         * 12
         * 123
         * 1234
         */
          
        for(int i = 1; i<= 4; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


        /* Left triangle no patter
         * 1
         * 21
         * 321
         * 4321
         * 54321
         * 
         */
        
        for(int i =1;i<=5; i++){
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        
        /*Inverted n0 pattern output will be :
         * 54321
         * 5432
         * 543
         * 54
         * 5
         */
        
        // int n = 5;
        for(int i = 1; i<=5; i++){
            for(int j = 5; j>= i; j--){
                System.out.print(j);
            }
            System.out.println("\t");
        }


        /* print inverted pattern of rows
         * 55555
         * 44444
         * 33333
         * 22222
         * 11111
         */
        
        for(int i = 5; i>=1; i--){
            for (int j = 1; j<=  5; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        /* print inverted pattern of column
         * 54321
         * 54321
         * 54321
         * 54321
         * 54321
         */

        for(int i = 1; i<= 5; i++){
            for(int j = 5; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }





        
        
        

       
    }

        
        
}
    

