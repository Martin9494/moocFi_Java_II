package validating;

public class Calculator {

    public int factorial(int num) {
        if(num < 0){
            throw new IllegalArgumentException("num can not be smaller than 0");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if(setSize < 0 || subsetSize < 0 || subsetSize > setSize){
            throw new IllegalArgumentException("Numbers can not be smaller than 0");

        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
