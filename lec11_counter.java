public class lec11_counter {
    public static void main(String[] args) {

        /*print
         * AFJMO
           BGKN
           CHL
           DI
           E
         */

        int cnt = 1;
        for(int i = 1; i <=5; i++){
            int c = cnt;
            for(int j = 5 ; j >=i; j--){
                System.out.print((char)(c+64));
                c += j;
            }
            System.out.println();
            cnt++;
        }

        /*print
         * EILNO
         * DHKM
         * CGJ
         * BF
         * A
         */

        int cn = 5 ;
        for(int i = 1; i<= 5; i++){
            int c = cn;
            for(int j = 5; j >= i;j--){
                
                System.out.print((char)(c+64));
                c += j-1;
            }
            System.out.println();
            cn--;
        }

        /*print
         * OJFCA
         * NIEB
         * MHD
         * LG
         * K
         */

        int n = 5, count = (n*(n+1)/2);
        for(int i = 1; i<= n; i++){
            int c = count;
            for(int j = 5; j >= i; j--){
                System.out.print((char)(c+64));
                c -= j;
            }
            System.out.println();
            count--;

        }

        /*print
         * KGDBA
         * LHEC
         * MIF
         * NJ
         * O
         */

        int m = 5, counter = (m*(m+1)/2)-(n-1);
        for(int i = 1; i<= m; i++){
            int c = counter;
            for(int j = m; j >=i; j--){
                System.out.print((char)(c+64));
                c -= j - 1;
            }
            System.out.println();
            counter ++;
        }

        /*
         * ACFJO
         * BEIN
         * DHM
         * GL
         * K
         */

        int CNT = 1;
        for(int i =1; i<=n; i++){
            int c = CNT;
            for(int j = i; j <=n; j++){
                System.out.print((char)(c+64));
                c += j+1;
            }
            System.out.println();
            CNT += i;
        }

        /*print
         * ABDGK
         * CEHL
         * FIM
         * JN
         * O
         */

        int Count = 1;
        for(int i = 1; i<=n; i++){
            int c = Count;
            for(int j = i; j<= n; j++){
                System.out.print((char)(c+64));
                c += j;
            }
            System.out.println();
            Count += i+1;
        }

        /*print
         * OMJFA
         * NKGB
         * LHC
         * ID
         * E
         */

        int a = 5, COUNT = (a*(a+1)/2);
        for(int i = 1; i<=n; i++){
            int c = COUNT;
            for(int j = i; j<=n; j++){
                System.out.print((char)(c+64));
                c -= j+1;
            }
            System.out.println();
            COUNT -= i;
        }

        /*print
         * ONLIE
         * MKHD
         * JGC
         * FB
         * A
         */

        int b = 5, Counter = (b*(b+1)/2);
        for(int i = 1; i<=n; i++){
            int c = Counter;
            for(int j =i; j<=n; j++){
                System.out.print((char)(c+64));
                c -=j;
            }
            System.out.println();
            Counter -= i+1;
        }

    }
    
}
