package src.CodingNinja;

import java.util.ArrayList;

public class MinimizeZ {
    public static int minimizeZ(ArrayList<Integer> a){
        a.sort(Integer::compare);
        if(a.get(0) < 0 && a.get(a.size() - 1) < 0)
            return a.get(a.size()-1) * a.get(a.size()-2);
        else if (a.get(0) < 0 && a.get(a.size() - 1) > 0) {
            return a.get(0) * a.get(a.size() - 1);
        } else
            return a.get(0) * a.get(1);
    }
}
