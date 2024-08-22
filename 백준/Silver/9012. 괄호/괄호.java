import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] answer = new String[t];

        for (int i = 0; i < t; i++) {
            Stack<Character> st = new Stack<>();
            answer[i] = "YES";
            for (char c : sc.next().toCharArray()) {
                if (c == '(') {
                    st.push(c);
                } else {
                    if(st.isEmpty()) answer[i] = "NO";
                    else st.pop();
                }
            }
            if(!st.isEmpty()) answer[i] = "NO";
        }
        for(String s: answer) System.out.println(s);
    }
}