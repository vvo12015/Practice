package workshop5;

public class KmpSmallestPeriod {

    public String findSmallestPeriod(String input){

        String result = null;
        if (input.indexOf(input.charAt(0), 1) > -1 ) {

            for (int i = 0; i < input.length();) {

                String oneSubString = input.substring(0, input.indexOf(input.charAt(i), i+1));
                String secondSubstring = input.substring(input.indexOf(input.charAt(i), i + 1), input.indexOf(input.charAt(i), i + 1) * 2);

                System.out.println(oneSubString);
                System.out.println(secondSubstring);
                if (oneSubString.equals(secondSubstring)) {
                    return oneSubString;
                }else {
                    i += input.indexOf(input.charAt(i), 1);
                }
            }
        }
        return result;
    }
}
