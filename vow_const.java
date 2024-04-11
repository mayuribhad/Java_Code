public class vow_const {
    public static void main(String[] args) {
        String s1 = "hello i am java developer";
        StringBuilder sb = new StringBuilder();
        String s2 = "AEIOUaeiou";
        StringBuilder vowels = new StringBuilder();
        for(int i = 0; i<s1.length();i++){
            char c = s1.charAt(i);
            if(!s2.contains(String.valueOf(c))){
                if(!Character.isWhitespace(c))
                    sb.append(c);
            }
            else
                vowels.append(c);
        }
        sb.append(vowels);
        for(int i = 0; i<s1.length();i++)
            if(s1.charAt(i)== ' ')
                sb.insert(i,' ');
        System.out.println(sb);
    }
    
}
