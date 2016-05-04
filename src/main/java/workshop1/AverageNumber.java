package workshop1;

public class AverageNumber {

    public int average(int a, int b) {
        int min, max, average;

        if  (a == b){
            return a;
        }
        else{
            if  (a > b) {
                max = a;
                min = b;
            }else{
                max = b;
                min = a;
            }
        }

        if  (Math.abs(a) > Math.abs(b)){
            max = a;
            min = b;
        }else if (Math.abs(a) < Math.abs(b)){
            max = b;
            min = a;
        }

        average = (min - max) / 2;

        average = min - average;

        return average;
    }

}
