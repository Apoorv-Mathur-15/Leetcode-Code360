package src.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumIndexSumOfTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2){
        List<String> list = new ArrayList<>();
        int sum = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list2.length; j++){
                if(list1[i].equals(list2[j])){
                    int currentSum = i + j;
                    if(currentSum < sum){
                        list.clear();
                        list.add(list1[i]);
                        sum = currentSum;
                    }
                    else if(currentSum == sum)
                        list.add(list2[j]);
                }
            }
        }
        return list.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        String[] res = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(res));
    }

}
