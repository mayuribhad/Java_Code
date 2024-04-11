public class lec9_counter {

    /*1. print 
     * 1
     * 3 2
     * 6 5 4
     *10 9 8 7
    15 14 13 12 11 
     */

    public static void main(String[] args) {
        int cnt = 1;
        for(int i = 1; i<=5; i++){
            int c = cnt;
            for(int j= i; j>= 1; j--){
                
                System.out.print(c+ " ");
                c--;
            }
            System.out.println();
            cnt += i + 1; 
            
        }
        
        /*1
         *2 3
          4 5 6
          7 8 9 10
         11 12 13 14 15
         */

         cnt = 1;
        for(int i =1; i<=5; i++){
            int c = cnt;
            for(int j = i; j>= 1; j--){
                System.out.print(c+ " ");
                c++;
            }
           
            System.out.println();
            cnt += i;
        }

        /* 15
         * 14 13
         * 12 11 10
         *  9  8  7  6
         *  5  4  3  2  1
        */


        int n = 5;
        cnt = n*(n+1)/2;
        for(int i = 1; i<= 5; i++){
            int c = cnt;
            for(int j = i; j>=1;j--){
                
                System.out.print(c+"  ");
                c--;
            }
            System.out.println();
            cnt -= i;
            
        }

        /*1
         *2 6
          3 7 10
          4 8 11 13
          5 9 12 14 15
         */
        cnt = 1; 
        for(int i = 5; i>= 1; i--){
            int c = cnt;
            for(int j = 5; j>=i; j--){
               
                System.out.print(c+ " ");
                c+= j-1;
            }
            System.out.println();
            cnt++;

        }

        /*5
         *9 4 
         12 8 3
         14 11 7 2
         15 13 10 6 1 
         */

        cnt = 5;
        for(int i = 5; i>=1;i--){
            int c = cnt;
            for(int j =i; j>=1;j--){
                System.out.print(c+ "  ");
                c--;
            }
            System.out.println();
            cnt += i + 1;

        }

        
    }
    
    
}
