package src.CodingNinja;

import java.util.ArrayList;

public class Search2DMatrix {
    public static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target){
        for(ArrayList<Integer> matrix : mat){
            for(int i=0; i<matrix.size(); i++){
                if(matrix.get(i) == target)
                    return true;
            }
        }
        return false;
    }
}
