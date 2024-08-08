import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strArr = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(strArr[i]);

        int lAnswer = 0, rAnswer = 0;
        int lt = 0;
        int rt = n - 1;
        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);
        while(lt < rt) {
            int sum = arr[lt] + arr[rt];
            int gap = sum > 0 ? sum : -sum;
            if (gap < min) {
                lAnswer = arr[lt];
                rAnswer = arr[rt];
                min = gap;
                if (sum == 0){
                    break;
                }
            }
            if(sum < 0) lt++;
            else rt--;
        }
        System.out.println(lAnswer + " " + rAnswer);
    }
}