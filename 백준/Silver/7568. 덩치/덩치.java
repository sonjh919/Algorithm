import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        People people = new People();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            people.add(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }

        people.setRank();

        people.printRank();

        bw.flush();
        bw.close();
        br.close();
    }
}

class People {
    List<Person> people;

    public People() {
        people = new ArrayList<>();
    }

    public void add(int weight, int height) {
        people.add(new Person(weight, height));
    }

    public void setRank() {
        for (Person person : people) {
            for (Person p : people) {
                person.compare(p);
            }
        }
    }

    public void printRank() {
        for (Person person : people) {
            person.printRank();
        }
    }
}

class Person {
    int weight;
    int height;
    int rank;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
        this.rank = 1;
    }

    public void printRank() {
        System.out.print(rank + " ");
    }

    public void compare(Person p) {
        if (this.weight < p.weight) {
            if (this.height < p.height) {
                rank++;
            }
        }
    }
}
