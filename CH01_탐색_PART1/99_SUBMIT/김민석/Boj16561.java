import java.util.*; // Java에서 사용되는 유틸 패키지 불러오기.

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("YOUR NAME?: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // 인풋이 이상할 수도 있음:
//        int number = sc.nextInt();
//        double floatVal = sc.nextDouble();
//        String asdfasdf = sc.nextLine();

        // 해결 사례:
        System.out.print("number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.print("floatVal: ");
        double floatVal = Double.parseDouble(sc.nextLine());
        System.out.print("asdfasdf: ");
        String asdfasdf = sc.nextLine();

        System.out.println("HELLO, YOUR NAME IS: "+name );
        System.out.printf("Input result: %d, %f, %s\n", number, floatVal, asdfasdf);
        sc.close();

    }
}
