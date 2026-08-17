package src.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class BullsAndCows {
    public static String getHint(String secret, String guess) {
        int x = 0, y = 0;
        HashMap<Character, Integer> secretMap = new HashMap<>();
        HashMap<Character, Integer> guessMap = new HashMap<>();
        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                x++;
                continue;
            }
            else {
                secretMap.put(secret.charAt(i), secretMap.getOrDefault(secret.charAt(i), 0)+1);
                guessMap.put(guess.charAt(i), guessMap.getOrDefault(guess.charAt(i), 0)+1);
            }
        }
        for(Map.Entry<Character, Integer> entry : guessMap.entrySet()) {
            if(secretMap.containsKey(entry.getKey()) && secretMap.get(entry.getKey()) >= entry.getValue()) {
                y += entry.getValue();
                secretMap.put(entry.getKey(), secretMap.get(entry.getKey()) - entry.getValue());
            }
            else if(!secretMap.containsKey(entry.getKey()))
                continue;
            else if(secretMap.containsKey(entry.getKey())) {
                if(secretMap.get(entry.getKey()) < entry.getValue()) {
                    y += secretMap.get(entry.getKey());
                    secretMap.put(entry.getKey(), 0);
                }
                else if(secretMap.get(entry.getKey()) == 0)
                    continue;
            }

        }
        return new StringBuilder().append(x).append("A").append(y).append("B").toString();
    }
    public static void main(String[] args) {
        System.out.println(getHint("1807", "7810"));
        System.out.println(getHint("1123", "0111"));
    }
}
