import java.util.Scanner;

public class convertUsdToVnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        System.out.println("Enter usd: ");
        double usd = sc.nextDouble();
        double convert = usd*vnd;
        System.out.println("Value vnd: " + convert);
    }
}
