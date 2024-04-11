public class lec13_space_cnt {
    public static void main(String[] args) {
        
    
     /*                1
         *          2  3
         *       4  5  6
         *    7  8  9 10
         *11 12 13 14 15
         */

        int m = 5, cnt = 1;
        for(int i = 1; i<=m; i++){
            
            for(int j = i; j<m; j++){
                System.out.print("\t");
            }
            for(int j = i; j>=1;j--){
                System.out.print(cnt+ "\t");
                cnt++;
            }
            System.out.println();
            
        }

        /*              11
         *          7   12
         *       4  8   13  
         *   2   5  9   14
         *1  3   6  10  15
         */
        int n =5;
        cnt = (n*(n+1)/2)+1;
        for(int i = n; i>=1; i--){
            int c = cnt;
            for(int j =i; j>1; j--){
                System.out.print("\t");
            }
            for(int j=n; j>=i; j--){
                System.out.print(c +"\t");
                c ++;
            }
            System.out.println();
            cnt -= i-1;
        }

        /*                1
         *             6  2
         *         10  7  3 
         *     13  11  8  4
         * 15  14  12  9  5
        */
        int l = 5;
        cnt = 1;
        for(int i =l;i>=1; i--){
            int c = cnt;
            for(int j = i; j<l; j++){
                System.out.print("\t");
            }
            for(int j = l; j<=i;j++){
                System.out.print(c +"\t");
                c -= j;
            }
            System.out.println();
            cnt +=i;
        }
    }
    
}
