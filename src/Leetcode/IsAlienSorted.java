package src.Leetcode;

public class IsAlienSorted {

    public static boolean isAlienSorted(String[] words, String order) {
        char[] orderCharArray = order.toCharArray();

        for (int i = 1; i < words.length; i++) {

            String previous = words[i - 1];
            String current = words[i];

            int minLength = Math.min(previous.length(), current.length());

            for (int j = 0; j < minLength; j++) {
                int previousIndex = getIndex(orderCharArray, previous.charAt(j));
                int currentIndex = getIndex(orderCharArray, current.charAt(j));

                if (previousIndex < currentIndex) {
                    break; // correct ordering
                }

                if (previousIndex > currentIndex) {
                    return false; // incorrect ordering
                }
            }

            // "apple" before "app" is invalid
            if (previous.length() > current.length()
                    && previous.startsWith(current)) {
                return false;
            }
        }

        return true;
    }

    private static int getIndex(char[] charArray, char ch) {
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
                isAlienSorted(
                        new String[]{"hello", "leetcode"},
                        "hlabcdefgijkmnopqrstuvwxyz"
                )
        );
    }
}