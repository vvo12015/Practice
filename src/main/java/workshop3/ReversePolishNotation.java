package workshop3;


import java.util.Stack;

public class ReversePolishNotation {

    private String[] singsAction = {"/", "*", "-", "+"};

    public int evaluate(String expression) throws Exception {

        Stack<Integer> stack = new Stack<Integer>();

        String[] arrayNumberSymbols = expression.split(" ");

        for (int i = 0; i < arrayNumberSymbols.length; i++) {

            if (checkString(arrayNumberSymbols[i])){

                stack.push(Integer.parseInt(arrayNumberSymbols[i]));

            }else {
                int a = stack.pop();
                int b = stack.pop();

                int[] actions = {division(a, b), multiplication(a, b), minus(a, b), plus(a, b)};

                if (numberSing(arrayNumberSymbols[i]) >= 0){

                    stack.push(actions[numberSing(arrayNumberSymbols[i])]);

                }else{
                    throw new Exception();
                }
            }
        }

        return stack.pop();
    }



    private int plus(int a, int b){
        return a + b;
    }

    private int minus(int a, int b){
        return a - b;
    }

    private int division(int a, int b){
        return a / b;
    }

    private int multiplication(int a, int b){
        return a * b;
    }

    private int numberSing(String sing){

        for (int i = 0; i < singsAction.length; i++) {
            if (singsAction[i].equals(sing)){
                return i;
            }
        }

        return -1;
    }

    private boolean checkString(String string) {
        if (string == null || string.length() == 0) return false;

        int i = 0;
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return false;
            }
            i = 1;
        }

        char c;
        for (; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
