public class lec13_if {
    public static void main(String[] args) {

        /*eligible for vote */

        int age = 15;
        if(age >= 18){
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("not eligible");
        }

        /*Check no is +ve or -ve */

        int a = -1;
        if(a> 0){
            System.out.println("No is positive");
        }
        else{
            System.out.println("-ve no");
        }

        /*print even odd no */

        int n = 10;
        if(n % 2 == 0){
            System.out.println("no is even");
        }
        else{
            System.out.println("no is odd");
        }

        /*else if ladder */

        double d = 55.5;
        if(d>= 80){
            System.out.println("Distinction");
        }
        else if(d>= 60){
            System.out.println("First class");
        }
        else if(d>=35){
            System.out.println("passed");
        }
        else{
            System.out.println("Fail");
        }

        /*display 5 sub marks */

        float sub_1 = 50, sub_2 = 40, sub_3 = 60, sub_4 = 70, sub_5 = 80;
        float total = (sub_1 + sub_2 + sub_3 + sub_4 + sub_5)/5;
        
        if(total >= 100){
            System.out.println("Grade A" +total);
        }
        else if(total >= 70){
            System.out.println("Grade B "+total);
        }
        else if(total >= 50){
            System.out.println("Grade c "+total+ "%");
        }
        else{
            System.out.println("fail");
        }

        /*Nested if */
        int e = 50, b = 40, c = 30;
        if(e>b){
            if(e>c){
                System.out.println("E is greater");
            }else{
                System.out.println("C is greater");
            }
        }    
        else{
            if(b>c){
                System.out.println("B is greater");
            }
            else{
                System.out.println("C is greater");
            }
        }

        /*print fibonaccie series */

        int n1 = 0, n2 = 1, n3;
        System.out.print(n1+" "+n2+" ");
        for(int i = 2; i<10;i++){
            n3 = n1+n2;
            System.out.print(n3+ " ");
            n1 = n2;
            n2=n3;
        }



    }

}

    

