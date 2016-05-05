package workshop2;

public class CountBits {

    public static final int CountBitInInteger = 31;
    public static final int SING = 1;
    public static final int FOR_INVERTATION = 1;

    public int count(int num) {

        int result;
        Boolean negativeFlag = false;

        if (num < 0){
            num = - num;
            result = 0;
            negativeFlag = true;
        }else{
            result = 0;
        }

        while (num > 0){

            result += num % 2;

            num /= 2;
        }

        if (negativeFlag) return CountBitInInteger - result + SING + FOR_INVERTATION;

        return result;
    }
}
