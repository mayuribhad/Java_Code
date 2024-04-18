public class lec25_string_count_vowels {
    public static void main(String[] args) {

        /*string "Rani"
         * output - 2
         */

        String s1 = "Rani";
        int count = 0;
        for(int i = 0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(c == 'a'|| c=='e'||c == 'i'|| c == 'o'|| c == 'u'|| c == 'A'|| c == 'E'|| c == 'I'|| c == 'O'|| c == 'U')
            count++;

        }
        System.out.println(count);

    
        
    }
    
}
