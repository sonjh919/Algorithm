import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> idIdx = new HashMap<>();
        Map<String, Set<String>> reportedId = new HashMap<>();

        int i = 0;
        for (String id : id_list) {
            idIdx.put(id, i++);
            reportedId.put(id, new HashSet<>());
        }

        for (String report_str : report) {
            String[] ids = report_str.split(" ");

            reportedId.get(ids[1]).add(ids[0]);
        }

        for (String key : reportedId.keySet()) {
            if (reportedId.get(key).size() >= k) {
                for (String id : reportedId.get(key)) {
                    answer[idIdx.get(id)] += 1;
                }
            }
        }

        return answer;
    }
}