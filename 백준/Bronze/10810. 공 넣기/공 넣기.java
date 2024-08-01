import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n];
        for (int b = 0; b < m; b++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int a = i; a < j; a++) {
                basket[a] = k;
            }
        }
        for (int b : basket) {
            System.out.print(b + " ");
        }
    }
}