public class lec10_counter {
    public static void main(String[] args) {
        int n = 5, cnt = (n*2)/2;
        for(int i = n; i>=1; i--){
            for(int j = i; j>= 1 ; j--){
                int c = cnt;
                System.out.print(c+ " ");
                c = j-1;
            }
            System.out.println();
            cnt -= i-1;
        }

        int m = 5, cn = m;
        for(int i = m; i >= 1; i--){
            for(int j = i; j >1; j--){
                System.out.print(" ");
            }
            int c = cn;
            for(int j = i; j <= m; j++){
                System.out.print((char)(c+64));
                c -=j+1;
            }
            System.out.println();
            cn += i-1;
        }

    }
    
}
