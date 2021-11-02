import java.util.Scanner;

public class operatorExpression {
    public static void main(String[] args) {

        float witdh;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        witdh = sc.nextFloat(); // nhap chieu rong

        System.out.println("Enter height:  ");
        height = sc.nextFloat();
        float area = witdh*height;
        System.out.println("Area is: " + area);

    }
}
