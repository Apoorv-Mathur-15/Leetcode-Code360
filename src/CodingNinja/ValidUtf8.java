package src.CodingNinja;

import java.util.ArrayList;

public class ValidUtf8 {
    public static boolean validUtf8(ArrayList<Integer> data) {
        int i = 0;

        while (i < data.size()) {
            int num = data.get(i);
            // Count how many leading 1s in the first byte
            int numberOfBytes = 0;
            if ((num & 0b10000000) == 0) {
                // 1-byte character
                numberOfBytes = 1;
            } else {
                int mask = 0b10000000;
                while ((num & mask) != 0) {
                    numberOfBytes++;
                    mask >>= 1;
                }

                if (numberOfBytes < 2 || numberOfBytes > 4) {
                    return false; // Invalid UTF-8 byte length
                }
            }

            // Check if there are enough bytes left
            if (i + numberOfBytes > data.size()) {
                return false;
            }

            // For multi-byte character, check the continuation bytes
            for (int j = 1; j < numberOfBytes; j++) {
                int nextByte = data.get(i + j);
                if ((nextByte & 0b11000000) != 0b10000000) {
                    return false; // Not a valid continuation byte
                }
            }

            i += numberOfBytes; // Move to the next character
        }

        return true;
    }
}
