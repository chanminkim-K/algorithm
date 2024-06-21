package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A, B, C;

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        int int_result = A + B - C;
        int str_result = Integer.parseInt(A + "" + B) - C;

        sb.append(int_result).append("\n").append(str_result);
        System.out.println(sb);
    }
}
