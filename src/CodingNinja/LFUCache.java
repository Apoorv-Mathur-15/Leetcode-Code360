package src.CodingNinja;

import java.util.*;

public class LFUCache {
    private int capacity;
    private Map<Integer, Integer> keyMap;
    private Map<Integer, Integer> countMap;
    private Map<Integer, LinkedHashMap<Integer, Integer>> freqMap;

    LFUCache(int capacity) {
        this.capacity = capacity;
        this.keyMap = new HashMap<>();
        this.countMap = new HashMap<>();
        this.freqMap = new HashMap<>();
    }

    int get(int key) {
        if(!keyMap.containsKey(key))
            return -1;
        int value = keyMap.get(key);
        int freq = countMap.get(key);

        freqMap.get(freq).remove(key);

        if(freqMap.get(freq).isEmpty())
            freqMap.remove(freq);

        countMap.put(key, freq + 1);

        freqMap.computeIfAbsent(freq + 1, k -> new LinkedHashMap<>()).put(key, value);

        return value;
    }

    void put(int key, int value) {
        if (capacity == 0) return;

        if (keyMap.containsKey(key)) {

            keyMap.put(key, value);
            get(key);
        } else {
            if (keyMap.size() >= capacity) {
                // Evict the least frequently used key
                evictLFU();
            }
            // Insert the new key
            keyMap.put(key, value);
            countMap.put(key, 1); // Frequency is 1 for a new key

            // Add it to the frequency 1 list (LRU order)
            freqMap.computeIfAbsent(1, k -> new LinkedHashMap<>()).put(key, value);
        }
    }

    private void evictLFU() {

        int minFreq = Collections.min(freqMap.keySet());

        LinkedHashMap<Integer, Integer> lruList = freqMap.get(minFreq);
        Iterator<Map.Entry<Integer, Integer>> iterator = lruList.entrySet().iterator();
        Map.Entry<Integer, Integer> leastRecentlyUsed = iterator.next();
        int keyToEvict = leastRecentlyUsed.getKey();

        keyMap.remove(keyToEvict);
        countMap.remove(keyToEvict);
        lruList.remove(keyToEvict);

        if (lruList.isEmpty()) {
            freqMap.remove(minFreq);
        }
    }
}
