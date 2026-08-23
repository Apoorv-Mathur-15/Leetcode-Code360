package src.Leetcode;

public class StrongPasswordChecker {

    public static int strongPasswordChecker(String password) {

        int n = password.length();

        boolean lower = false;
        boolean upper = false;
        boolean digit = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c))
                lower = true;
            else if (Character.isUpperCase(c))
                upper = true;
            else if (Character.isDigit(c))
                digit = true;
        }

        int missing = 0;

        if (!lower) missing++;
        if (!upper) missing++;
        if (!digit) missing++;

        // Count groups of 3+ consecutive identical characters.
        int[] repeat = new int[n];
        int repeatCount = 0;

        for (int i = 0; i < n; ) {

            int j = i;

            while (j < n && password.charAt(j) == password.charAt(i)) {
                j++;
            }

            int len = j - i;

            if (len >= 3) {
                repeat[repeatCount++] = len;
            }

            i = j;
        }

        int replacements = 0;

        for (int i = 0; i < repeatCount; i++) {
            replacements += repeat[i] / 3;
        }

        // Case 1: password is too short.
        if (n < 6) {
            return Math.max(6 - n, missing);
        }

        // Case 2: password is within the allowed length.
        if (n <= 20) {
            return Math.max(missing, replacements);
        }

        // Case 3: password is too long.
        int deletions = n - 20;

        // Use deletions to reduce replacements.
        for (int mod = 0; mod < 3; mod++) {

            for (int i = 0; i < repeatCount && deletions > 0; i++) {

                if (repeat[i] < 3 || repeat[i] % 3 != mod)
                    continue;

                int needed = mod + 1;

                int use = Math.min(deletions, needed);

                repeat[i] -= use;
                deletions -= use;
            }
        }

        // Any remaining deletions can reduce a repetition by
        // 3 characters for every replacement saved.
        for (int i = 0; i < repeatCount && deletions > 0; i++) {

            if (repeat[i] >= 3) {
                int use = Math.min(deletions, repeat[i] - 2);

                repeat[i] -= use;
                deletions -= use;
            }
        }

        replacements = 0;

        for (int i = 0; i < repeatCount; i++) {
            replacements += repeat[i] / 3;
        }

        return (n - 20) + Math.max(missing, replacements);
    }

    public static void main(String[] args) {
        System.out.println(strongPasswordChecker("aab"));
        System.out.println(strongPasswordChecker("aA1"));
        System.out.println(strongPasswordChecker("1337C0d3"));
        System.out.println(strongPasswordChecker("Baaabb0"));
        System.out.println(strongPasswordChecker("Baabab0"));
    }
}