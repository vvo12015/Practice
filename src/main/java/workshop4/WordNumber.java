package workshop4;

public class WordNumber {
    public int count(String input) {

        input = input.toLowerCase();
        char[] chars = input.toCharArray();

        int countSpace = 0;
        boolean isLetter = false;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z'){
                isLetter = true;
            }
            else{
                if (isLetter) countSpace++;
                isLetter = false;
            }
        }

        if (isLetter) countSpace++;

        return countSpace;
    }
}
