import java.util.Scanner;

public class B27294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int s = sc.nextInt();

        if (t >= 12 && t <= 16 && s == 0){
            System.out.println(320);
        } else{
            System.out.println(280);
        }

        sc.close();
    }
}