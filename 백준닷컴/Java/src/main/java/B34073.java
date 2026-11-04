import java.util.Scanner;

public class B34073 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String word = sc.next();
            System.out.printf("%sDORO ", word);
        }

        sc.close();
    }
}