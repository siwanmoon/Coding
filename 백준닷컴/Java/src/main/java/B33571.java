import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B33571 {
    public static int countHoles(char c) {
        return switch (c) {
            case 'A', 'D', 'O', 'P', 'Q', 'R',
                 'a', 'b', 'd', 'e', 'g', 'o', 'p', 'q',
                 '@' -> 1;
            case 'B' -> 2;
            default -> 0;
        };
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        String line = br.readLine();

        for (char c : line.toCharArray()) {
            cnt += countHoles(c);
        }

        System.out.println(cnt);
    }
}
