package workshop2;

import java.util.ArrayList;

public class SetZero {

    public static final int NEGATIVE_REMAINDER = -1;
    public static final int OFFSET_LAST_POSITION = 1;
    public static final int ONE_BIT = 1;
    public static final int EMPTY_REMAINDER = 0;
    public static final int FIRST_POSITION = 0;
    public static final int ZERO_BIT = 0;
    public static final int COUNT_BIT_INT = 32;
    public static final int POSITIVE_REMAINDER = 1;
    public static final int BASE_SYSTEM = 2;
    public static final int OFFSET = 1;


    public int set(int num, int i){

        ArrayList<Integer> bits = new ArrayList<Integer>(parseToBits(num));

        bits = setZero(bits, i);

        int result = parseDec(bits);

        return result;
    }

    private ArrayList<Integer> setZero(ArrayList<Integer> input, int i) {

        ArrayList<Integer> bits = new ArrayList<Integer>(input);

        i--;

        if (i < bits.size()){
            bits.set(i, ZERO_BIT);
        }

        return bits;
    }

    private ArrayList<Integer> parseToBits(int num) {

        ArrayList<Integer> bits = new ArrayList<Integer>();
        boolean negativeFlag = false;

        if (num < 0) {
            negativeFlag = true;
            num = -num;
        }

        while (num > 0) {
            bits.add(num % BASE_SYSTEM);
            num /= BASE_SYSTEM;
        }

        if (negativeFlag){
            bits = inversionBit(bits);
            bits = bitPlusOne(bits);
        }

        return bits;
    }

    private ArrayList<Integer> bitPlusOne(ArrayList<Integer> bits){

        ArrayList<Integer> result = new ArrayList<Integer>(bits);

        int remainder = POSITIVE_REMAINDER;
        int i = FIRST_POSITION;
        while ((remainder > EMPTY_REMAINDER ) && (i < result.size())){

            if ((result.get(i) + remainder) > ONE_BIT){
                result.set(i, ZERO_BIT);
                remainder = POSITIVE_REMAINDER;
            }else {
                if (remainder > EMPTY_REMAINDER){result.set(i, ONE_BIT);}
                remainder = EMPTY_REMAINDER;
            }
            i++;
        }

        for (i = result.size()-OFFSET_LAST_POSITION; i >= FIRST_POSITION; i--){
            System.out.print(result.get(i));
        }
        System.out.println();
        return result;
    }

    private ArrayList<Integer> inversionBit(ArrayList<Integer> bits){

        ArrayList<Integer> result = new ArrayList<Integer>();

        int bit;
        for (int i = FIRST_POSITION; i < COUNT_BIT_INT; i++) {
            if (i >= bits.size()) bit = ONE_BIT;
            else{
                if (bits.get(i) > ZERO_BIT) bit = ZERO_BIT;
                else bit = ONE_BIT;
            }
            result.add(bit);
        }

        for (int i = result.size()-OFFSET_LAST_POSITION; i >= FIRST_POSITION; i--){
            System.out.print(result.get(i));
        }

        System.out.println();
        return result;
    }

    private ArrayList<Integer> bitMinusOne(ArrayList<Integer> bits){

        ArrayList<Integer> result = new ArrayList<Integer>(bits);

        int remainder = NEGATIVE_REMAINDER;
        int i = 0;

        while ((remainder < EMPTY_REMAINDER) && (i < COUNT_BIT_INT)){

            if ((result.get(i) + remainder) < ZERO_BIT){
                result.set(i, ONE_BIT);
                remainder = NEGATIVE_REMAINDER;
            }else {
                if (remainder < EMPTY_REMAINDER)
                {
                    result.set(i, ZERO_BIT);
                }
                remainder = EMPTY_REMAINDER;
            }
            i++;
        }

        for (i = result.size()-OFFSET_LAST_POSITION; i >= FIRST_POSITION; i--){
            System.out.print(result.get(i));
        }
        System.out.println();
        return result;
    }
    
    private int parseDec(ArrayList<Integer> bits){

        boolean negativeFlag = false;

        if (bits.size() == COUNT_BIT_INT){
            if (bits.get(COUNT_BIT_INT - OFFSET_LAST_POSITION) == ONE_BIT){
                bits = bitMinusOne(bits);
                bits = inversionBit(bits);
                negativeFlag = true;
            }
        }

        int result = 0;

        for (int i = bits.size() - OFFSET_LAST_POSITION; i >= FIRST_POSITION; i--) {
            result = result * 2 + bits.get(i);
        }

        if (negativeFlag) return -result;

        return result;
    }
}