import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strArr = {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int result = 0;
        Scanner sc = new Scanner(System.in);
        String[] numStr = sc.next().split("");
        for (String s : numStr) {
            for (int i = 0; i < strArr.length; i++) {
                if(strArr[i].contains(s)) result += 2 + i;
            }
        }
        System.out.println(result);
    }
}