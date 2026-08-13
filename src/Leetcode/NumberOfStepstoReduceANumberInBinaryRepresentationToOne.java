package src.Leetcode;

import java.math.BigInteger;

public class NumberOfStepstoReduceANumberInBinaryRepresentationToOne {
    public static int numSteps(String s) {

        //Binary to Integer Array
        BigInteger decimal = new BigInteger(s, 2);

        int steps = 0;

        while (!decimal.equals(BigInteger.ONE)) {
            if(decimal.mod(BigInteger.TWO).equals(BigInteger.ZERO))
                decimal = decimal.divide(BigInteger.TWO);
            else
                decimal = decimal.add(BigInteger.ONE);
            steps++;
        }
        return steps;
    }

    static void main() {
        System.out.println(numSteps("1111011110000011100000110001011011110010111001010111110001"));
        System.out.println(numSteps("1111110011101010110011100100101110010100101110111010111110110010"));
    }
}
