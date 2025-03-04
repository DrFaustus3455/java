import java.util.Scanner;

public class ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your first number: ");
        int n1 = sc.nextInt();
        System.out.print("Your second number: ");
        int n2 = sc.nextInt();
        
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        System.out.print(n1 + " % " + n2 + " = " + (n1%n2));
    }
}