public class Main_class {
    public static void main(String[] args) {
        
        Demo d1 = new Demo();
        System.out.print(d1.hashCode());
        Demo d2 = new Demo();
        System.out.print(d2.hashCode());
        d1.display();
        d2.display();
        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
        
    }
}

class Demo {

     int a,b;
    void display()
    {
        System.out.println("a="+a+"b=" +b);
    }
    public Boolean equals(Demo d1){
        if(a = d1.a)
            if(b = d1.b)
                return true;
        return false;

    }
}

    

