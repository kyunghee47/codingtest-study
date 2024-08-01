import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            if (arr[i] > max) {
                idx = i;
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(idx + 1);
    }
}
