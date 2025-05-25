package src.CodingNinja;

import java.util.HashMap;

public class myHashMap {
    private HashMap<String, Integer> map;
    private int size;

    public myHashMap()
    {
        // Implement the Constructor(s).
        map = new HashMap<>();
        size = 0;
    }

    public void insert(String key, int value)
    {
        // Implement the insert(k, v) function.
        map.put(key, value);
    }

    public int get(String key)
    {
        // Implement the get(k) function.
        return map.getOrDefault(key, -1);
    }

    public void remove(String key)
    {
        // Implement the remove(k) function.
        map.remove(key);
    }

    public boolean search(String key)
    {
        // Implement the search(k) function.
        return map.containsKey(key);
    }

    public int getSize()
    {
        // Implement the getSize() function.
        return map.size();
    }

    public boolean isEmpty()
    {
        // Implement the isEmpty() function.
        return map.isEmpty();
    }
}
