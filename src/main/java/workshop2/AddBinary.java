package workshop2;

class AddBinary {
    public static final int BASE = 2;
    public static final int OFFSET_lAST_POSION = 1;


    public String add(String a, String b) {

        String result;

        char[] bitsA = a.toCharArray();
        char[] bitsB = b.toCharArray();

        int countDigits = a.length() > b.length()?a.length():b.length();

        int lastPositionA = a.length()- OFFSET_lAST_POSION;
        int lastPositionB = b.length()-OFFSET_lAST_POSION;

        char jobArray[] = new char[countDigits];
        boolean discharge = false;
        int jobChar, charA, charB;

        for (int i = jobArray.length-OFFSET_lAST_POSION, j = 0; i >= 0 ; i--, j++) {

            if (lastPositionA >= j)
            {
                charA = parseNumber(bitsA[lastPositionA - j]);
            }
            else charA = 0;

            if (lastPositionB >= j) {

                charB = parseNumber(bitsB[lastPositionB - j]);

            }
            else charB = 0;

            jobChar = charA + charB;

            if (discharge) {
                jobChar++;
                discharge = false;
            }

            if (jobChar > BASE - 1){
                discharge = true;
                jobChar = jobChar % BASE;
            }

            jobArray[i] = parseChar(jobChar);
        }

        if (discharge) result = "1" + new String(jobArray);
        else result = new String(jobArray);

        return result;

    }

    private int parseNumber(char c) {
        return c - '0';
    }

    private char parseChar(int i){
        return (char) (i + '0');
    }
}
