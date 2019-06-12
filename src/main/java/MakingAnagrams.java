import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakingAnagrams {

    public static int makeAnagram(String a, String b) {

        char[] aCharArray = a.toCharArray();
        char[] bCharArray = b.toCharArray();

        Arrays.sort(aCharArray);
        Arrays.sort(bCharArray);

        int charRemove;

        if(Arrays.equals(aCharArray,bCharArray)){
            return 0;
        }else{

            List<Character> intersection = new ArrayList();
            List<Character> listaA = new ArrayList();
            List<Character> listaB = new ArrayList();

            for (char aux_a:aCharArray) {
                listaA.add(aux_a);
            }

            for (char aux_b:bCharArray) {
                listaB.add(aux_b);
            }

            for (Character la : listaA){
                if(listaB.contains(la)){
                    intersection.add(la);
                    listaB.remove(la);
                }
            }

            int charRemoveA = (aCharArray.length - intersection.size());
            int charRemoveB = (bCharArray.length - intersection.size());
            charRemove = charRemoveA + charRemoveB;
        }

        return charRemove;
    }
}
