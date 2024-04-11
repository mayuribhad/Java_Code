import java.util.Arrays;
public class lec22_ArrayMethod {

    public static void main(String[] args) {
        lec22_ArrayMethod am = new lec22_ArrayMethod();
        int a[] = {18,20,16,15,14,9,10};
        am.displayArray(a);
        System.out.print(am.sumOfArray(a));
        System.out.print(am.avgOfArray(a));
        System.out.println(am.findGreaterThanAvgOfArray(a));
    }

     //method to display array
    void displayArray(int a[]){
        System.out.print(Arrays.toString(a));
        System.out.println();
    }
    

    //method to find sum of array
    int sumOfArray(int a[]){
        int sum = 0; 
        for(int i = 0;i<a.length;i++){
            sum += a[i];
        
        }
        return sum;
    }
    
    //method to find avg of array
    double avgOfArray(int a[]){
        return (double)sumOfArray(a)/a.length;
    }
   
    //method to find greater element than avg
    int findGreaterThanAvgOfArray(int a[]){
        double avg = avgOfArray(a);
        int count = 0;
        for(int i = 0; i<a.length;i++){
            if(avg<a[i])
                count++;
        }
        int b[] = new int [count];
        count = 0;
        for(int i = 0; i<a.length;i++){
            if(avg<a[i])
                b[count++] = a[i];
            return b;    
        }
    
    }
}
