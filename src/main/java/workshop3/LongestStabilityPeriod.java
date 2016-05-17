package workshop3;

import java.util.Arrays;

public class LongestStabilityPeriod{

    public int count(int[] gdp) {

        int min = gdp[0];
        int max = gdp[0];
        int period = 1;
        int maxPeriod = 1;
        int i = 1;
        boolean exit = false;

        while (i < gdp.length) {

            if (Math.abs(gdp[i] - min) <= 1 && Math.abs(gdp[i] - max) <= 1){
                period++;
                min = Math.min(gdp[i], min);
                max = Math.max(gdp[i], max);
            }else{

                if (exit) return maxPeriod;

                if (i == gdp.length - 1) exit = true;
                period = 1;
                max = gdp[i];
                min = gdp[i];
                while (Math.abs(gdp[i-1] - max) <= 1 && i > 0 && Math.abs(gdp[i-1] - min) <= 1) {
                    max = Math.max(gdp[i-1], max);
                    min = Math.min(gdp[i-1], min);
                    i--;
                }
            }

            if (period > maxPeriod) maxPeriod = period;
            i++;
        }

        return maxPeriod;
    }
}