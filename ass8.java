import java.util.Scanner;

public class ass8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Write your 1st number: ");
        double n1 = scan.nextDouble();
        System.out.print("Write your 2nd number: ");
        double n2 = scan.nextDouble();
        System.out.print("Write your 3rd number: ");
        double n3 = scan.nextDouble();

        double average = (n1+n2+n3)/3;
        System.out.print("Average = " + average);


        scan.close();
    }
}