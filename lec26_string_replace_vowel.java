
public class lec26_string_replace_vowel {
    public static void main(String[] args) {

        /*input : hello i am java developer 
         *output : h10ll9 8 7m j6v5 d4v3l2p1r
        */
        
        String s1 = "hello i am java developer";
        StringBuilder sb = new StringBuilder(s1);
        String s2 = "AEIOUaeiou";
        int count = 0;
        for(int i = sb.length()-1;i>=0;i--){
            if(s2.contains(String.valueOf(sb.charAt(i)))){
                sb.deleteCharAt(i);
                sb.insert(i,++count);
            }
          
        }
        System.out.println(sb);

    }

    
}