public class lec3_logical {
    public static void main(String[] args) {
        /* logica && */

        int a = 10, b = 20, c= 5;
        System.out.println(a>b && b> c && c>a);

        /* logical or || */
        int j = 10, d = 20;
        System.out.println(j>d || d>j);

        /*logical not ! */
        int e = 10, f = 20;
        System.out.println(!(e>f || f>e));
    }
    
}
