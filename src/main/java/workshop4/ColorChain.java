package workshop4;

public class ColorChain {

    public int count(int N) {

        int[] intermediateResult = new int[N + 1];

        return counterCombinations(intermediateResult, N);


    }

    private int counterCombinations(int[] intermediateResult, int N){

        if (N < 0) return 0;

        if (N == 0 || N == 1) return 1;

        int countCombinations;

        if (intermediateResult[N] == 0) {
            countCombinations = counterCombinations(intermediateResult, N - 1) * indicator(N, 1) +
                    counterCombinations(intermediateResult, N - 2) * indicator(N, 2) +
                    counterCombinations(intermediateResult, N - 3) * indicator(N, 3);

            intermediateResult[N] = countCombinations;
        }else {
            return intermediateResult[N];
        }

        return countCombinations;
    }

    private int indicator(int value, int par){
        if (value >= par && value >= 0) return 1;
        else return 0;
    }
}