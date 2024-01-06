
// 참고: package들을 주석 처리할 것.
import java.io.*;
import java.util.Arrays;

public class Boj3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 참고: boolean은, 생성 시 false가 기본값.
        boolean[] visited = new boolean[42];
        int count= 0;

        // 배열 표시 방법:
        // System.out.println(Arrays.toString(visited));

        for(int i=0; i<10;i++){
            int num = Integer.parseInt(br.readLine());
            int remain = num%42;
            // System.out.println(visited[remain]);
            if (visited[remain]){
                continue;
            }else{
                visited[remain] = true;
                count++;
            }

        }
        System.out.println(count);
    }
}
