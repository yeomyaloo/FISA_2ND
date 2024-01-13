import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int n = r < g ? r : g;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(r % i == 0 && g % i == 0) {
                list.add(i);
            }
        }

        for(int i=0; i<list.size(); i++) {
            System.out.printf("%d %d %d", list.get(i), r/list.get(i), g/list.get(i));
            System.out.println();
        }
    }
}