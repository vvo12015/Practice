package workshop2;

import java.util.ArrayList;

public class SetZero {

    public int set(int num, int i) {

        ArrayList<Byte> bits = parseBit(num);

        if (i < bits.size()){
            int numberBitForSet = bits.size() - i - 1;
        }
        int result = parseDec();

        return result;
    }

    private ArrayList<Byte> parseBit(int num){

        ArrayList<Byte> bits = new ArrayList<Byte>();

        while (num > 0){
            bits.add(0,(byte) (num % 2));
            num /= 2;
        }

        return bits;
    }

    private int parseDec(ArrayList<Byte> bits){
        int result = 0;

        for (int i = 0; i < bits.size(); i++) {
            result = result * 2 + bits.get(i);
        }

        return result;
    }
}
