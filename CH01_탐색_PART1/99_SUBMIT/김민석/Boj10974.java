import java.util.Scanner;

public class Boj10974 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // tmp[]의 길이는 n이지만 visited[]의 길이는 n+1인 이유?
        /* TODO: FILL OUT HERE */
        permute(n, 0, new int[n], new boolean[n+1]);
    }

    // n을 입력받아 순열을 생성하는 메서드.
    // tmp: 임시로 순열을 저장할 배열.
    public static void permute( int n, int depth, int[] tmp, boolean[] visited){
        if(depth==n /* 종료 조건*/) {

            return;
        }
        
        /* N-1: 0부터 시작해서 N-1
         * 반복 로직 및 스스로에 대한 호출
         */
        System.out.println(depth);
        for(int i=0; i<n+1; i++){
            // 이미 방문했으면 생략하자.
            if(visited[i]) continue;

            // visited: n 숫자들의 방문 기록.
            // 1부터 n까지 ==> new boolean[n+1]
            visited[i] = true;

            // depth는, 순열에서 넣으려고 하는 순열 자리의 위치
            tmp[depth] = i;

            // 연결이 끊김.
            /* TODO: FILL OUT HERE */
            permute(n, depth+1, tmp, visited);
            // 방문 기록 초기화.
            visited[i]= false;
        }
        
    }
}


















