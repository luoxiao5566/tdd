import java.util.HashSet;
import java.util.Set;

public class Mommifier {
    public static final String MOMMY = "mommy";
    public static final Set<Character> SETCHAR = new HashSet<Character>(){
        {
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
        }
    };
    public String string_mommifier(String str) {

        if (!proportion_judgment(str)){
            return str;
        }
        StringBuilder Variable_string = new StringBuilder(str);
        Integer size = str.length();
        Integer temp = 0;
        for (int j = 0; j < size-1; j++) {
            if (judge_whether_it_is_a_vowel(str.charAt(j))&&judge_whether_it_is_a_vowel(str.charAt(j+1))){
                Integer cur = j+1+temp;
                Variable_string.insert(cur,MOMMY);
                temp += 5;
            }
        }
        String new_string = Variable_string.toString();
        return  new_string;

    }
    public Boolean proportion_judgment(String str) {
        Integer size = str.length();
        Integer count = 0;
        for (int j = 0; j < size; j++) {
            if (judge_whether_it_is_a_vowel(str.charAt(j))) {
                count++;
            }
        }
        Integer proportion = count*100/size;

        return (proportion >= 30? true : false);

    }

    public Boolean judge_whether_it_is_a_vowel(char character){
        if (SETCHAR.contains(character)){
            return true;
        }
        return false;


    }
}
