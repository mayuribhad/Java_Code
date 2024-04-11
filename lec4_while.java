
public class lec4_while {

/* While Lop */
    public static void main(String[] args) {

        /* print 1-10 no */
        int a = 1;
        while (a<= 10) {
            System.out.println(a+ " ");
            a++;
            
        }

        /* print 1-10 in reverse order */
        int b = 10;
        while(b >= 1){
            System.out.println(b+ " "); 
            b--;
        }

        /* print given no in reverse order */
        int n = 123;
        while (n!= 0) {
            int d = n%10;
            System.out.print(d);
            n = n/10;
            
        }


        /* print the given no */
        int m = 11 ;
        while (m<= 0) {
            
            System.out.print(m+ " "); //invalid output
            m++;

        }




    /* do---while Loop */

    int c = 1;
    do{
        System.out.println(c);
        c++;
    }
    while(c <= 10);


    /* print reverse no using do-while loop */
    int d = 10;
    do{
        System.out.println(d);
        d--;
    }while(d >= 1 );

    
    int i = 1 ;
    while(i<= 10){
        System.out.println(i*5);
        i++;
    }

    /* Sum of 10 natural no */
    int s = 1;
    while(s<= 10){
        System.out.println(s+1);
        s++;
    }

    /* Print sum of 10 natural no  */

    int t = 1, equal = 0;
    while(t<= 10){
        equal = equal + t;
        t++;
        
        }
        System.out.println(equal);

    }
}
