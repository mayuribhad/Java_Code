public class lec8_examples {
    public static void main(String[] args) {

        /*1. print pattern
         * 11111
         * 2222
         * 333
         * 44
         * 5
         */

        for(int i = 1; i<=5; i++){
            for(int j = 5; j>= i; j--){
                System.out.print(i);
            }
            System.out.println();

        }

        /*2. print pattern
         * 55555
         * 4444
         * 333
         * 22
         * 1
         */
        for(int i = 5; i>= 1; i--){
            for(int j = i; j>= 1; j--){
                System.out.print(i);
            }
            System.out.println();
        }

        /*3. print pattern
         *      1
         *     22
         *    333
         *   4444
         *  55555 
         */

        for(int i = 1; i<= 5; i++){
            for(int j = i; j< 5; j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(i);
            }
            System.out.println();
        }

        /*4. print pattern
         *     12345
         *    2345
         *   345
         *  45
         * 5
         */

        for(int i = 1; i<=5; i++){
            for(int j = i; j< 5; j++){
                System.out.print(" ");
            }
            for(int j = i; j<= 5; j++){
            System.out.print(j);
            }
            System.out.println();
        }

        /*5. print pattern
         *      1
         *     12
         *    123
         *   1234
         *  12345
         */

        for(int i = 1; i<=5; i++){
            for(int j = i; j< 5; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= i; j++){
            System.out.print(j);
            }
            System.out.println();
        }

        /*6. print pattern
         *      5
         *     44
         *    333
         *   2222
         *  11111
         */

        for(int i = 5; i>= 1; i--){
            for(int j = i; j> 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j<= 5; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        /*7. print pattern
         *      5
         *     54
         *    543
         *   5432
         *  54321
         */

        for(int i = 5; i>= 1; i--){
            for(int j = i; j> 1; j--){
                System.out.print(" ");
            }
            for(int j = 5; j>= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        /*8. print pattern
         *      AAAA
         *     BBBB
         *    CCCC
         *   DDDD
         */
        for(char i = 'A'; i<= 'D'; i++){
            for(char j = i; j< 'D'; j++){
                System.out.print(" ");

            }
            for(char j= 'A'; j<= 'D'; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        /*9. print pattern
         *      *
         *     **
         *    ***
         *   ****
         *  *****
         */

         for(int i = 1; i<= 5; i++){
            for(int j = i; j< 5; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
         }

         /*10. print pattern
          *         A
                   BB
                  CCC
                 DDDD  
          */

        for(char i = 'A'; i<='D'; i++){
            for(char j = i; j<'D'; j++){
                System.out.print(" ");
            }
            for(char j = 'A'; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        /*11. print pattern
         * 1234
         *  234
         *   34
         *    4
         */

         for(int i = 1; i<= 4; i++){
            for(int j = 1; j< i; j++){
                System.out.print(" ");
            }
            for(int j = i; j<= 4; j++){
                System.out.print(j);
            }
                System.out.println();
        }

        /*12. print pattern
         * ****
         *  ***
         *   **
         *    *
         */

         for(int i = 1; i<= 4; i++){
            for(int j = 1; j< i; j++){
                System.out.print(" ");
            }
            for(int j = i; j<= 4; j++){
                System.out.print("*");
            }
            System.out.println();
         }

         /*13. print pattern
          * 1234
             123
              12
               1
          */

        for(int i = 4; i>=1; i--){
            for(int j = i; j> 1; j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /*14. print pattern
         *      5
         *     45
         *    345
         *   2345
         *  12345
         */

         for(int i = 5; i>= 1; i--){
            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
         }

         /*15. pattern 
          * 11111
             2222
              333
               44
                5
          */

        for(int i = 1; i<=5; i++){
            for(int j = i; j> 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j<= 5; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        /*16. print pattern
         * 55555
         *  4444
         *   333
         *    22
         *     1
         */

         for(int i = 5; i>=1; i--){
            for(int j = i; j < 5; j++){
                System.out.print(" ");
            }
            for(int j = i; j>= 1; j--){
                System.out.print(i);
            }
            System.out.println();
         }

        /*17. print 
         * 12345
         *  1234
         *   123
         *    12
         *     1
         */

        for(int i = 5; i>= 1; i--){
            for(int j = i; j<5; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /*18. print
         * 54321
         *  4321
         *   321
         *    21
         *     1
         */

        for(int i = 5; i>= 1; i--){
            for(int j = i; j< 5; j++){
                System.out.print(" ");
            }
            for(int j = i; j>= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        /*19. print
         * 54321
         *  5432
         *   543
         *    54
         *     5
         */

        for(int i = 1; i<= 5; i++){
            for(int j = i; j> 1; j--){
                System.out.print(" ");
            }
            for(int j = 5; j>= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        /*20. print
         * 12345
         *  2345
         *   345
         *    45
         *     5
         */

        for(int i = 1; i<= 5; i++){
            for(int j = i; j> 1; j--){
                System.out.print(" ");
            }
            for(int j =i; j<= 5; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /*21. print 
         * 1
         * 23
         * 456
         * 78910
         */

        for(int i = 1; i<=5; i++){
            int s= 0;
            for(int j = i; j<=5; j++){
                s = j;
                System.out.print(s);
                s++;
            }
            System.out.println();
        }

        /*22. print 
         * 1
         * 23
         * 456
         * 78910
         */
        int a = 1;
        for(int i = 1; i<=5; i++){
            for(int j = i; j>=1; j--){
                System.out.print(a+ " ");
                a++;
            }
            System.out.println();
        }

        int b = 1;
        for(int i = 1; i<= 5; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(b+ " ");
                b--;
            }
            System.out.println();
        }

        /*print
         *      A
         *     AB
         *    ABC
         *   ABCD
         *  ABCDE
         */

         for(char i = 'A'; i<='E';i++){
            for(char j = i ; j<= 'E';j++){
                System.out.print(" ");
            }
            for(char j = 'A'; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
         }


         for(char i = 'e'; i>= 'a';i--){
            for(int j = i ;j<'e';j++){
                System.out.print(" ");
            }
            for(char j = 'a'; j<= i;j++){
                System.out.print(i);
            }
            System.out.println();
         }
    
    
    }
}


