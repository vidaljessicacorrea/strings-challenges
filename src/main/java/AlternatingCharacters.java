public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        //AAAA
        char[] arrayChars = s.toCharArray();
        int countRemove = 0;

        for(int i = 0; i < arrayChars.length -1 ; i++){
            if(arrayChars[i] == 'A'  && arrayChars[i+1]!='B'){
                countRemove ++;
            }else if(arrayChars[i] == 'B'  && arrayChars[i+1]!='A'){
                countRemove ++;
            }
        }

        return countRemove;
    }

}
