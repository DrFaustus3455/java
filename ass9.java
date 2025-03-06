import java.util.Scanner;

public class ass9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Width = ");
        double w = scan.nextDouble();
        System.out.print("Height = ");
        double h = scan.nextDouble();

        double area = w * h;
        double perimeter = 2 * (w + h);

        System.out.println("Area is " + area);
        System.out.print("Perimeter is " + perimeter);

        scan.close();
    }
}