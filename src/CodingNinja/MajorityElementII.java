package src.CodingNinja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementII {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr){
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : arr) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        int floor = arr.size()/3;
        for(Map.Entry<Integer, Integer> map : hashMap.entrySet()){
            if(map.getValue() > floor)
                result.add(map.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(3);
        arr1.add(2);
        arr1.add(2);
        arr1.add(1);
        arr1.add(5);
        arr1.add(2);
        arr1.add(3);
        arr2.add(7);
        arr2.add(4);
        arr2.add(4);
        arr2.add(9);
        arr2.add(7);
        ArrayList<Integer> result1 = majorityElementII(arr1);
        ArrayList<Integer> result2 = majorityElementII(arr2);
        for(int i : result1)
            System.out.println(i);
        System.out.println("-------------------------");
        for(int i : result2)
            System.out.println(i);
    }
}
