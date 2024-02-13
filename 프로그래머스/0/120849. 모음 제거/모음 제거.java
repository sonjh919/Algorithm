import java.util.List;
class Solution {
    public String solution(String my_string) {
        List<String> list = List.of("a", "e", "i", "o", "u");
        for(String l : list){
            my_string = my_string.replaceAll(l, "");
        }
        return my_string;
    }
}