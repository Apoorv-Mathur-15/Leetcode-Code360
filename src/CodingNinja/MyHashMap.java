package src.CodingNinja;

import java.util.ArrayList;

public class MyHashMap {

}

class myHashMap{
    private String key;
    private int value;
    private ArrayList[] arr = null;

    public myHashMap()
    {
        // Implement the Constructor(s).
        arr = new ArrayList[1000];
    }

    public void insert(String key, int value)
    {
        // Implement the insert(k, v) function.

    }

    public int get(String key)
    {
        // Implement the get(k) function.
        return 0;
    }

    public void remove(String key)
    {
        // Implement the remove(k) function.
    }

    public boolean search(String key)
    {
        // Implement the search(k) function.
        return false;
    }

    public int getSize()
    {
        // Implement the getSize() function.
        return 0;
    }

    public boolean isEmpty()
    {
        // Implement the isEmpty() function.
        return false;
    }
    static class Entry {
        int key;
        int value;

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + key;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            Entry other = (Entry) obj;
            return key == other.key;
        }
    }
}
