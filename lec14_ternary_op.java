public class lec14_ternary_op {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int c =(a>b)?a:b;
        System.out.println(c);

        double p = 60;
        String per = (p>80)?"Distinction":(p>=60)?"First class ":(p>=35)?"Passed "+p:"Fail";
        System.out.println(per);

        int n = 5;
        for(int i= 1; i<=n; i++){
            for(int j=1; j<=n;j++){
                if(j%2 !=0){
                System.out.print(1);
                }
                else{
                    System.out.print(0);
                }

            }
            System.out.println();
            
        }
    }
    
}
