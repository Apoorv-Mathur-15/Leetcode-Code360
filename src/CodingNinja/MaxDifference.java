package src.CodingNinja;

public class MaxDifference {

    public static int maximumDifference(String s) {
        int maxDiff = Integer.MIN_VALUE;
        int currentSum = 0;
        boolean hasZero = false;

        for (int i = 0; i < s.length(); i++) {
            // '0' contributes +1, '1' contributes -1
            int value = (s.charAt(i) == '0') ? 1 : -1;
            if (s.charAt(i) == '0') hasZero = true;

            currentSum += value;
            maxDiff = Math.max(maxDiff, currentSum);

            // Reset currentSum if it goes below 0
            if (currentSum < 0) currentSum = 0;
        }

        // If there is no '0' in the string, we cannot have a positive difference
        return hasZero ? maxDiff : -1;
    }
}
