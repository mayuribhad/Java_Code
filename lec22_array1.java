import java.util.Arrays;
public class lec22_array1 {

   /* input = {23,543,65,123,9,10}
      output = [231, 5431, 651, 1231, 91, 101] */ 
    public static void main(String[] args) {
        int a[] = {23,543,65,123,9,10};

        for(int i = 0; i<a.length;i++){
            int index = 0;
            if (a[i] == index) {
                System.out.print(i);
            }
            a[i] *= 10;
            index++;
            a[i] += index;
                
        }
        System.out.print(Arrays.toString(a));
        System.out.println();


        /*Sum of array :773 */
        int b[] = {23,543,65,123,9,10};
        int sum = 0;
        for(int i =0;i<b.length;i++)
            sum += b[i];
            System.out.print("Sum of array"+sum);
            System.out.println();


        /* avg is :16.39741 */
        int c[] = {2,6,10,12,54,89};
        double avg =0;
        for(int i = 0;i<c.length;i++){
            avg += c[i];
            avg /= a.length;
            
        }
        System.out.print("avg is:"+avg);
        System.out.println();

        /*Higher element than avg */
       int d[] = {2,6,10,12,14,89};
       double avrg = 0;
       for(int i = 0;i<d.length;i++){
        avrg += d[i];
        avrg /= d.length;
       }
        for(int i = 0;i<d.length;i++){
            if(d[i]>avrg)
                System.out.print("Higher element than avg is: "+d[i]);
        }
        System.out.println();

        /*Shift 1st element to last */
        int e[] = {2,6,10,12,14,89};
        for(int i = 0;i<e.length;i++){
            e[i] += e[i+1];
            e[i+1] = e[i] - e[i+1];
            e[i] -= e[i+1];
        
        }
        System.out.print(Arrays.toString(e));



    }        
}


    

