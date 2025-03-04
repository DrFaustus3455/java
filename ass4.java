import java.util.Scanner;

public class ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int n1 = sc.nextInt();
        System.out.print("Input second number: ");
        int n2 = sc.nextInt();
        
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        System.out.print(n1 + " mod " + n2 + " = " + (n1%n2));
    }
}