package CH01_탐색_PART1_que.C01week;

import java.util.*;
import java.io.*;

public class BOJ_10974 {

    static int n;
    static int[] arr;
    static boolean[] visit;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        visit = new boolean[n];
        answer = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        permute(0);

    }

    private static void permute(int idx) {
        if(idx == n){
            for(int x : answer){
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if(!visit[i]){
                visit[i] = true;
                answer[idx] = arr[i];
                permute(idx + 1);
                visit[i] = false;
            }
        }
    }
}
