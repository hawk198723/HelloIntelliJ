package Stream.StreamTest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamTest {

    public static void main(String[] args) throws IOException {
        char c;
        // create BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please type in any char, hit 'q' to quit...");
        // read that object br

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}