package CH01_탐색_PART1_que.C01week;

import java.io.*;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] visit = new boolean[42];
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());

            int mod = n % 42;

            if(visit[mod]) continue;

            cnt++;

            visit[mod] = true;
        }

        System.out.println(cnt);


    }
}
