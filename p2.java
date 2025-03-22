import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = Scan.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = Scan.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = Scan.nextInt();

        if (num1 > num2 && num1 > num3) 
        {
            System.out.println("The 1st number is the greatest among three");
        }
        else if (num2 > num1 && num2 > num3) 
        {
            System.out.println("The 2nd number is the greatest among three");
        }
        else if (num3 > num1 && num3 > num2) 
        {
            System.out.println("The 3rd number is the greatest among three");
        }
        else 
        {
            System.out.println("Error: Please choose different numbers");
        }

        Scan.close();
    }
}