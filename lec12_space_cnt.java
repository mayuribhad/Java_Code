
public class lec12_space_cnt {
    public static void main(String[] args) {

        /*1  2  3  4  5 
         *   6  7  8  9
         *     10 11 12
         *        13 14
         *           15
         */
        int n = 5;
        int cnt = 1;
        for(int i = 1;i<=n; i++){
            for(int j = i; j>1; j--){
                System.out.print("\t");
            }
            for(int j=i; j<=n; j++){
                System.out.print(cnt +"\t");
                cnt++;
            }
            System.out.println();
        }

        /* 15 14 13 12 11
              10  9  8 7
                  6  5 4
                     3 2
                       1*/  
        int m = 5;
        int count = m*(m+1)/2;
        for(int i = m; i>=1;i--){
            for(int j = i; j<m; j++){
                System.out.print("\t");
            }
            for(int j = i; j>=1;j--){
                System.out.print(count +"\t");
                count--;
            }
            System.out.println();
        }

        /*5  4  3  2  1
         *   9  8  7  6
         *     12 11 10
         *        14 13
         *           15
         */

        int l = 5;
        cnt = l;
        for(int i = l; i>=1; i--){
            int c = cnt;
            for(int j=i; j<l;j++){
                System.out.print("\t");
            }
            for(int j=i; j>=1;j--){
                System.out.print(c +"\t");
                c--;

            }
            System.out.println();
            cnt +=i-1;
        }

        int p = 5;
        cnt = p*(p+1)/2;
        for(int i=1;i<=p;i++){
            int c = cnt;
            for(int j =i; j>1;j--){
                System.out.print("\t");
            }
            for(int j=i;j<=p;j++){
                System.out.print(c +"\t");
                c -=j;
            }
            System.out.println();
            cnt -= i+1;
        }

        int q = 5;
        cnt = (q*(q-1)/2)+1;
        for(int i =1;i<=q;i++){
            int c = cnt;
            for(int j = i; j>1; j--){
                System.out.print("\t");
            }
            for(int j = n; j>=i; j--){
                System.out.print(c +"\t");
                c -= j-1;
            }
            System.out.println();
            cnt++;
        }
        
    }
    
}
  