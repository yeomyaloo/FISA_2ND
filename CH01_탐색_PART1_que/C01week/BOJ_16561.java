package CH01_탐색_PART1_que.C01week;

import java.io.*;

public class BOJ_16561 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 3; i <= n - 6; i += 3) {
            for (int j = 3; j <= n - 3 - i; j += 3) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
