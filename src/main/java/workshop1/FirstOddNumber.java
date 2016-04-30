package workshop1;

public class FirstOddNumber {

    public int find(int[] input) {

        int result = -1;
        int i = 0;

        boolean b = true;

        while ((b) && (i < input.length)){

            if (input[i] % 2 == 1){
                result = i;
                b = false;
            }

            i++;
        }

        return result;
    }
}