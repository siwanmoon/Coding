import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class B10801 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int[] b = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] win = new int[2];

        for (int i = 0; i < 10; i++) {
            if (a[i] > b[i]){
                win[0]++;
            } else if (a[i] < b[i]) {
                win[1]++;
            }
        }

        if (win[0] > win[1]) {
            System.out.println('A');
        } else if (win[0] < win[1]) {
            System.out.println('B');
        } else {
            System.out.println('D');
        }

        br.close();
    }
}
