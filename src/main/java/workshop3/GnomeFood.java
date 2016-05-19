package workshop3;

import java.util.Arrays;

public class GnomeFood {

    public int[] find(int[] gnames, int[] portions) {

        int[] sortFood = new int[portions.length];
        System.arraycopy(sortFood, 0, portions, 0, portions.length);
        Arrays.sort(sortFood);

        int[] sortGnames = new int[gnames.length];
        System.arraycopy(sortFood, 0, gnames, 0, gnames.length);
        Arrays.sort(sortGnames);


        return sortFood;
    }

    public int foundPosition(int number, int[] array){
        return 0;
    }
}
