import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        sc.nextLine();
        String[] strArr = sc.nextLine().split(" ");
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(strArr[i]);

        int lt = 0, rt = 0;
        int sum = 0;
        int mLength = Integer.MAX_VALUE;

        while (lt <= rt && rt <= n) {
            if(sum < s)  {
                sum += arr[rt++];
            }
            else {
                mLength = Math.min(mLength, rt - lt);
                sum -= arr[lt++];
            }
        }

        if (mLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(mLength);
        }
    }
}
