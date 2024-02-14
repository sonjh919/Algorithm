import java.util.*;
class Solution {
    public List<Integer> solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-z]", "");
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<my_string.length();i++){
            list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
        }
        Collections.sort(list);
        return list;
    }
}