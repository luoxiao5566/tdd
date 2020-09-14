public class Mommifier {
    public Boolean Proportion(String str1) {
        Integer size = str1.length();
        Integer count = 0;
        for (int i = 0; i < size; i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                count++;
            }
        }
        Integer proportion = count*100/size;

        return (proportion >= 30? true : false);

    }
}
