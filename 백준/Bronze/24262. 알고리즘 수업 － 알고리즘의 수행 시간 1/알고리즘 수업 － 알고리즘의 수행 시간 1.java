import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        //given
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //when
        bw.write(1 + "\n" + 0);

        //then
        bw.flush();
        bw.close();
    }

}
