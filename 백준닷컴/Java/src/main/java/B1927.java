import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1927 {

    static StringBuilder sb;
    static int[] heap;
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        heap = new int[n + 1];
        size = 0;

        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());

            if (a == 0) {
                pop();
            } else {
                push(a);
            }
        }

        System.out.println(sb);
    }

    private static void pop () {
        if (size == 0) {
            sb.append("0").append("\n");
        } else {
            sb.append(heap[1]).append("\n");
            heap[1] = heap[size];
            heap[size] = 0;
            size--;
            int n = 1;

            while (n * 2 <= size) {
                if (n * 2 == size) {
                    if (heap[n] > heap[n * 2]) {
                        heapSwap(n, n * 2);
                        n = n * 2;
                    } else {
                        break;
                    }
                } else {
                    int small;

                    if (heap[n * 2] <= heap[n * 2 + 1]) {
                        small = n * 2;
                    } else {
                        small = n * 2 + 1;
                    }

                    if (heap[small] < heap[n]) {
                        heapSwap(small, n);
                        n = small;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    private static void push (int n) {
        size++;
        heap[size] = n;
        int current = size;

        while (current > 1) {
            if (heap[current] < heap[current / 2]) {
                heapSwap(current, current / 2);
                current /= 2;
            } else {
                break;
            }
        }
    }

    private static void heapSwap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
}
