import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
/*
시간제한 2초: 최대 계산 횟수는 2억번

N (5 ≤ N ≤ 2000)
M (1 ≤ M ≤ 2000)

O(N^2), O(N*M), O(M^2) 가능!
*/
public class Main {

    static ArrayList<Integer>[] edges;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        List<Person> list = new ArrayList<>();

        // input
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Person(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())));
        }

        list.sort(Comparator.comparing(Person::getYear)
                .thenComparing(person -> person.getMonth())
                .thenComparing(person -> person.getDay())
        );

        bw.write(list.get(list.size() - 1).name + "\n" + list.get(0).name);

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    static class Person {
        String name;
        int year;
        int month;
        int day;

        public Person(String name, int day, int month, int year) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public int getDay() {
            return day;
        }
    }
}