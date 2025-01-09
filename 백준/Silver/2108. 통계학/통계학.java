import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        bw.write(average(list) + "\n");
        bw.write(center(list) + "\n");
        bw.write(mode(list) + "\n");
        bw.write(range(list) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int mode(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : list) {
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }

        int maxvalue = Collections.max(map.values());
        List<Integer> tmp = new ArrayList<>();

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxvalue) {
                tmp.add(entry.getKey());
            }
        }

        Collections.sort(tmp);

        if (tmp.size() > 1)
            return tmp.get(1);
        else
            return tmp.get(0);

    }

    private static int range(List<Integer> list) {
        return list.get(list.size()-1) - list.get(0);
    }

    private static int center(List<Integer> list) {
        return list.get(list.size()/2);
    }

    private static int average(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return Math.round((float) sum / list.size());
    }

}
