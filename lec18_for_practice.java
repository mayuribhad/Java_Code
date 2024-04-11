public class lec18_for_practice {
    public static void main(String[] args) {
        
        /*
     * e
     * de
     * cde
     * bcde
     * abcde
     */

    int n = 5;
    for(int i = n; i>=1; i--){
        for(int j = i; j<=n;j++){
            System.out.print((char)(j+96));
        }
        System.out.println();
    }

    /*E
     *ED
     EDC
     EDCB
     EDCBA
     */

    int m = 5;
    for(int i = m;i>=1;i--){
        for(int j =5; j>=i;j--){
            System.out.print((char)(j+64));
        }
        System.out.println();
    }

    /*a
     * ba
     * cba
     * dcba
     * edcba
     */

    int l = 5;
    for(int i = 1; i<=l;i++){
        for(int j = i; j>=1;j--){
            System.out.print((char)(j+96));
        }
        System.out.println();
    }

    /*A
     * AB
     * ABC
     * ABCD
     * ABCDE
     */

    int k =5;
    for(int i = 1;i<=k;i++){
        for(int j = 1; j<=i;j++){
            System.out.print((char)(j+64));
        }
        System.out.println();
    }

    /*e
     * dd
     * ccc
     * bbbb
     * aaaaa
     */
    for(int i = 5; i>=1;i--){
        for(int j =i;j<=5;j++){
            System.out.print((char)(i+96));
        }
        System.out.println();
    }

    /*11111
     * 2222
     * 333
     * 44
     * 5
     */

    for(int i=1;i<=5;i++){
        for(int j =5;j>=i;j--){
            System.out.print(i);
        }
        System.out.println();
    }

    /*55555
     *4444
     333
     22
     1 
     */

    for(int i =5; i>=1; i--){
        for(int j = 1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
    }

    /*12345
     * 1234
     * 123
     * 12
     * 1
     */

    for(int i =5;i>=1;i--){
        for(int j =1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
    
}
