import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arrS = sc.nextLine().split(" ");
        int x = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(arrS[i]);
        int answer = 0;

        Arrays.sort(arr);

        int lt = 0;
        int rt = n - 1;

        while (lt < rt) {
            int sum = arr[lt] + arr[rt];
            if (sum == x) {
                answer++;
                lt++;
                rt--;
            }
            else if (sum < x) lt++;
            else rt--;
        }

        System.out.println(answer);
    }
}