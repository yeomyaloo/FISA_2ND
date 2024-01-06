// https://www.acmicpc.net/problem/16945
import java.io.*;
import java.util.Scanner;

public class Boj16945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int exampleNum = Integer.parseInt(br.readLine());
//        double exampleDou = Double.parseDouble(br.readLine());
//        String exampleStr = br.readLine();

        int[][] arr= new int[3][3];

        // 3 x 3 배열
        // 표준 입출력
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.println(arr[i][j]);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
    public static int[][][] getMagicSquares(){
        int[][][] result = null;
        int[][] baseArr = {
                {8,3,4},
                {1,5,9},
                {6,7,2}
        };

        /* 8가지의 종류: 원본 (1) ==> 90, 180, 270 (3가지)
         * 원본 ==> 3번 꺾음 (=4가지), 좌우반전 (= *2) ==> 8가지
        */
        result = new int[8][3][3];
        result[0] = baseArr;

        for (int i=1; i<8; i++){
            if (i<4){
                // result[0], baseArr ==> 90, 180, 270, ...
                for(int j=0; j<3; j++){
                    // 이전 마방진
                    for(int k=0; k<3; k++) {
                        // 시계 방향으로 90도 회전시키기 - 이건 그냥 외울 것.
                        // 원본의 행의 j, k
                        // 변형시키려는 배열 k (열의 길이-1)-j
                        // TODO: 회전 라이브러리화.
                        rotation[k][2-j] = result[i-1][j][k];
                    }
                }
            }

            result[i]= rotation;
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    arr[r][c] = sc.nextInt();
                }
            }
        }
        return result;
    }
}











