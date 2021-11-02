import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int a=1; a<=n ;a++) {
            for (int b = 1; b <= n; b++) {
                if (b <= n - a) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
