package src.CodingNinja;

import java.util.ArrayList;

public class Search2DMatrix {
    public static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target){
        for(ArrayList<Integer> matrix : mat){
            for (Integer integer : matrix) {
                if (integer == target)
                    return true;
            }
        }
        return false;
    }
}
