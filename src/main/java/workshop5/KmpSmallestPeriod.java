package workshop5;

public class KmpSmallestPeriod {
    public String findSmallestPeriod(String input){

        int subLength = input.length() / 2;
        int countJoins = 1;
        String smallestPeriod = null;

        for (int i = subLength; i > 0 ; i--) {
            if ((countOccurrence(input, input.substring(0, i)) > countJoins) &&
                    (countOccurrence())){
                smallestPeriod = input.substring(0, i);
                countJoins = countOccurrence(input, input.substring(0, i));
            }
        }
        return smallestPeriod;
    }


    private int countOccurrence(String string, String subString){

        int countOccurrence = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.indexOf(subString, i) > -1){
                countOccurrence++;
                i += subString.length()-1;
            }
        }
        return countOccurrence;
    }
}
