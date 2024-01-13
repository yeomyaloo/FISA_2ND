import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i = A; i <= B; i++) {
            int n = i;
            while (n > 0) {
                if (n % 10 == 4 || n % 10 == 7) {
                    n = n / 10;
                    if (n == 0) count++;
                    else continue;
                } else break;
            }
        }
        System.out.println(count);

    }

}
