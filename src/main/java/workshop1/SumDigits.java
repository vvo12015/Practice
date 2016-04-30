package workshop1;

public class SumDigits {

    public int sum(int number) {
        int result = 0;
        number = Math.abs(number);
        boolean b = false;

        if (number < 0){
            number = Integer.MAX_VALUE;
            b = !b;
        }

        while (number > 0){

            result += number % 10;

            number /= 10;
        }

        if (b) result += 1;

        return result;
    }
}
