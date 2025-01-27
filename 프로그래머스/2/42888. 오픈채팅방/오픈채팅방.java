import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> msg = new HashMap<>();
        msg.put("Enter", "님이 들어왔습니다.");
        msg.put("Leave", "님이 나갔습니다.");
        
        HashMap<String, String> user = new HashMap<>();
        
        for(String s : record){
            String[] split = s.split(" ");
            if(split.length==3)user.put(split[1],split[2]);
        }
        
        ArrayList<String> answer = new ArrayList<>();
        
        for(String s : record){
            String[] split = s.split(" ");
            if(msg.containsKey(split[0])){
                answer.add(user.get(split[1]) + msg.get(split[0]));
            }
        }
        
        return answer.toArray(new String[0]);
    }
}