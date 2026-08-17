package src.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateFiles {
    public static List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String path : paths){
            String[] pathComponents = path.split(" ");
            String root = pathComponents[0];
            for(int i = 1; i < pathComponents.length; i++){
                int start = pathComponents[i].indexOf("(");
                int end = pathComponents[i].indexOf(")");
                String content = pathComponents[i].substring(start, end);

                map.putIfAbsent(content, new ArrayList<>());
                map.get(content).add(root + "/" + pathComponents[i].substring(0, start));
            }
        }
        for(List<String> list1 : map.values()){
            if(list1.size()>1)
                list.add(list1);
        }
        return list;
    }

    public static void main(String[] args) {

        String[] paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));
    }
}
