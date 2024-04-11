public class lec7_examples {

    public static void main(String[] args) {
        
        /*print left triangle no pattern
         * 1
         * 22
         * 333
         * 4444
         * 55555
         */

         for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
         }

         /* print inverted triangle no pattern
          * 55555
          4444
          333
          22
          1
        */

        for(int i = 5; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        /*print no
         * 5
         * 44
         * 333
         * 2222
         * 11111
         */

        for(int i = 5; i>=1; i--){
            for(int j = 5; j>= i; j--){
                System.out.print(i);

            }
            System.out.println();
        }

        /*Print 
         * 1
         * 12
         * 123
         * 1234
         */

        for(int i = 1; i<= 4; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /*print
         * 1
         * 21
         * 321
         * 4321
         * 
         */

        for(int i = 1; i <= 4; i++){
            for(int j = i; j>= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        /*print
         * 5
         * 45
         * 345
         * 2345
         * 12345
         */

         for(int i = 5; i>=1; i--){
            for(int j = i; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
         }

         /*a
          *bb
           ccc
           dddd
          */

          for(char i = 'a'; i<= 'd'; i++){
            for(char j = 'a'; j<= i; j++){
                System.out.print(i);
            }
            System.out.println();
          }

          int n = 5;
          for(int i = 1; i<= n; i++){
            for(int k = 1; k<= n; k++){
                for(int l = 1; l<= n; l++){
                    for(int j = 1; j<= n; j++){
                        System.out.print("*");
                    }
                    System.out.print("\t");
                }
                System.out.println();
            }
            System.out.println();
          }

          /*print star
           * *****
           * ****
           * ***
           * **
           * * 
           */
          for(int i = 5; i>=1; i--){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
          }

        



       
    }
    
}
