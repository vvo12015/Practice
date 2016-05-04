package workshop2;

public class AddNumberBase36 {

    public static final int BASE = 36;

    public String add(String a, String b) {

        String result;
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] chA = a.toCharArray();
        char[] chB = b.toCharArray();
        int countDigits = a.length() > b.length()?a.length():b.length();
        int lastPositionA = a.length()-1;
        int lastPositionB = b.length()-1;

        char jobArray[] = new char[countDigits];
        boolean discharge = false;
        int jobChar, charA, charB;

        for (int i = jobArray.length-1, j = 0; i >= 0 ; i--, j++) {

            if (lastPositionA >= j)
            {
                charA = parseNumber(chA[lastPositionA - j]);
            }
            else charA = 0;

            if (lastPositionB >= j) {

                charB = parseNumber(chB[lastPositionB - j]);

            }
            else charB = 0;

            jobChar = charA + charB;

            if (discharge) {
                jobChar++;
                discharge = false;
            }

            if (jobChar > 35){discharge = true;}

            jobArray[i] = parseChar(jobChar);
        }

        if (discharge) result = "1" + new String(jobArray);
        else result = new String(jobArray);

        return result;

    }

    private int parseNumber(char c) {
        int charA;
        if (c >= 'a') charA = c - 'a' + 10;
        else charA = c - '0';
        return charA;
    }

    private char parseChar(int i){
        if (i > 35) i -= 36;

        if (i >= 10){return (char) (i - 10 + 'a');}
        else return (char) (i + '0');
    }

}
