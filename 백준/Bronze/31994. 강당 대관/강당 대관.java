import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

/*
Network 75
ArtificialIntelligence 93
Startup 5
CyberSecurity 47
TestStrategy 42
Algorithm 74
DataAnalysis 65
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> map = new HashMap<>();
//      input
        for (int i = 0; i < 7; i++) {
            String[] s = br.readLine().split(" ");
            map.put(s[0], Integer.parseInt(s[1]));
        }

        Entry<String, Integer> stringIntegerEntry = map.entrySet().stream()
                .max(Comparator.comparing(Entry::getValue))
                .get();

        bw.write(stringIntegerEntry.getKey());
//      output
        br.close();
        bw.close();
    }
}
