import java.util.Scanner;

public class ass5while {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = s.nextInt();
        int i=0;
        while(i <= 10)
        {
            System.out.println(num + " x " + i + " = " + num*i);
            i++;
        }


        s.close();
    }
}