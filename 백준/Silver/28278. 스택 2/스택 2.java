import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int order = sc.nextInt();
            switch (order) {
                case 1:
                    st.push(sc.nextInt());
                    break;
                case 2:
                    if (!st.isEmpty()) answer.add(st.pop());
                    else answer.add(-1);
                    break;
                case 3:
                    answer.add(st.size());
                    break;
                case 4:
                    answer.add(st.isEmpty() ? 1 : 0);
                    break;
                case 5:
                    if (!st.isEmpty()) answer.add(st.peek());
                    else answer.add(-1);
                    break;
            }
        }
        for (int a: answer) System.out.println(a);
    }
}
