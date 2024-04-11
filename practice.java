import java.util.Arrays;
public class practice {
    public static void main(String[] args) {
        int a[] = {23,5762,2346,5789,398,10,5789};
        int max = a[0];
        int smax = 0;
        for(int i = 0; i<a.length;i++){
           if(a[i] > max){
                smax = max;
                max = a[i];
            }
            else
                if(a[i]>smax && a[i] != max)
            smax = a[i];
        
        }
        System.out.print("max="+max);
        System.out.print("smax="+smax);
    }
    
}
