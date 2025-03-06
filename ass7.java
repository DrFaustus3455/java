import java.util.Scanner;

public class ass7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Radius: ");
        double R = sc.nextDouble();
        double area = Math.PI * R *R;
        double perimeter = 2 * Math.PI * R;


        sc.close();

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);

    }
}