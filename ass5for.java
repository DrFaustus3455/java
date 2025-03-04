import java.util.Scanner;

public class ass5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        for(int i = 1; i < 11; i++)
        {
            System.out.println(num + " x " + i + " = " + num*i);
        }

        scanner.close();
    }
}