package CH01_탐색_PART1_que.C01week;

import java.util.*;
import java.io.*;

public class BOJ_16945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[3][3];
//        int[][] ma = new int[3][3];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//        int[][][] squares = getMagicSquares();
        // 매직스퀘어를 저장
        int[][][] ms = getMagicSquares();

        for (int[][] msArr : ms) {
            int sumCost = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int cost = Math.abs(arr[i][j] - msArr[i][j]);
                    sumCost += cost;
                }
            }
            min = Math.min(min, sumCost);
        }

        System.out.println(min);

//        for (int[] a : arr) {
//            for (int x : a) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }

    }

    public static int[][][] getMagicSquares() {
        // 기본 마방진
        int[][] base = {
                {8, 3, 4},
                {1, 5, 9},
                {6, 7, 2}
        };
        // 8가지의 종류 - 원본 (1) -> 90, 180, 270 (3)
        // 원본 -> 3번 꺾음(4) -> 좌우반전 (4+4) => 8
        int[][][] result = new int[8][3][3];
        result[0] = base;
        for (int i = 1; i < 8; i++) {
            // i 1, 2, 3
            int[][] rotation = new int[3][3];
            // 회전이나 반전을 통해서 변형된 마방진을 저장할 공간
            if (i < 4) {
                // result[0], base -> 90, 180, 270...
                for (int j = 0; j < 3; j++) {
                    // 이전 마방진
                    for (int k = 0; k < 3; k++) {
                        // 원본 배열 j, k
                        // 변형시키려는 배열 k (열의 길이-1)-j
                        // 시계 방향으로 90도 회전
                        rotation[k][2 - j] = result[i - 1][j][k];
                    }
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    // 이전 마방진
                    for (int k = 0; k < 3; k++) {
                        // 원본 배열 j, k
                        // 변형시키려는 배열 j (열의 길이-1)-k
                        // 좌우 반전
                        rotation[j][2 - k] = result[i - 4][j][k];
                    }
                }
            }
            result[i] = rotation;
//            for (int r = 0; r < 3; r++) {
//                for (int c = 0; c < 3; c++) {
//                    System.out.print(rotation[r][c]);
//                }
//                System.out.println();
//            }
        }
        return result;
    }
}
