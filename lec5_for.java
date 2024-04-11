public class lec5_for {
    public static void main(String[] args) {

        /*Print 1-10 no 
         * 1 2 3 4 5 6 7 8 9 10
         */

        for(int i =1; i<= 10; i++){
            System.out.print(i+ " ");
        }
        System.out.println();


        /* Print reverse no
         * 10 9 8 7 6 5 4 3 2 1
         */
        
        for(int i = 10; i>= 1; i--){
            System.out.print(i+ " ");
        }
        System.out.println();


        /*Sum of no 1-10 */

        int sum = 0 ;
        for(int i = 1; i<= 10; i++){
            sum = sum + i ;
        }
        System.out.println(sum);


        /*print 5's table */

        int t = 5,  n = 10;
        for(int i = 1; i<= n ; i++){
            System.out.println(t*i);
        }

        // /* Infinite loop runing */

        // for(;;)
        // {
        //     System.out.println("helo");
        // }

        
        int que = 0;
        for(int a=0,b=1 ; a<10 && b<10 ; a++, b++)
        {
            que += a;
            que += b;
            
            System.out.println("A: "+  a+  " B:" +b );
        }
        System.out.println("sum of a"+que+ "sum of b"+que);

        int m = 10;
        for(int i = 1; i<=m; i++){
            for(int j =1; j<= m; j++){
                System.out.println(i+ " " +j);
            }
        }
    }
    
}
