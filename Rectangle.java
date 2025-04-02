import java.util.Scanner;


public class Rectangle {

    double length;
    double breath;
    double area;
    double perimeter;

    void show(){
        System.out.println();
        area = length * breath;
        perimeter = 2 * (length + breath);
        System.out.println("_________________________");
        System.out.println("Area: " + area + " cm");
        System.out.println("Perimeter: " + perimeter + " cm");
        System.out.println("_________________________");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle[] rectangle = new Rectangle[10];

        for(int i = 1; i <= 2; i++) {
            rectangle[i] = new Rectangle();

            System.out.print("What is your length: ");
            rectangle[i].length = scan.nextDouble();
            System.out.print("What is your breath: ");
            rectangle[i].breath = scan.nextDouble();
            rectangle[i].show();
            
        }
       
        scan.close();
        
    }
}