import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            if (x > 0) {
                st.push(x);
            } else {
                if(!st.isEmpty()) st.pop();
            }
        }
        int answer = 0;
        for (int a : st) {
            answer += a;
        }
        System.out.println(answer);
    }
}