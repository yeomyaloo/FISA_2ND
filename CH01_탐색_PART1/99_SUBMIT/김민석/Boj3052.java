
// 참고: package들을 주석 처리할 것.
import java.util.Scanner;

public class Boj16561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=0;

        // 인풋이 이상할 수도 있음:
//        int number = sc.nextInt();
//        double floatVal = sc.nextDouble();
//        String asdfasdf = sc.nextLine();

        // 해결 사례:
        int number = Integer.parseInt(sc.nextLine());
        sc.close();

        for( int i=3;i<=number-3-3;i+=3){
            for (int j=3;j<=number-3-i;j+=3){
                result += 1;
            }
        }
        System.out.println(result);
    }

    public static void mainImproved(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        sc.close();

        int jMin=3;
        int kMin=3;

        for( int i=3;i<=number-jMin-kMin;i+=3){
            for (int j=3;j<=number-kMin-i;j+=3){

            }
        }

    }
}
