public class m_DemoNo1 {
    public void method(int a, int b, int c){
        
        System.out.print("a is small:");
        if(a<b&&a<c){
            System.out.println(a);
        }
        else if (b<a&&b<c){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

    }


    
    public static void main(String args[]){
        m_DemoNo1 d = new m_DemoNo1();
        d.method(25, 37, 29);

        
    
    
    }

}

    

