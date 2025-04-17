import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;
    

    Rectangle() {
        this.length = 1;
        this.breadth = 1;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return this.length;
    }

    public double getBreadth() {
        return this.breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }


    static double calculateArea(Rectangle r) {
        return r.length * r.breadth;
    }

    public double calculatePerimeter() {
        return 2 * (this.length + this.breadth);
    }

    public void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
        System.out.println("Area: " + calculateArea(this));
        System.out.println("Perimeter: " + this.calculatePerimeter());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length: ");
        double len = scan.nextDouble();
        System.out.print("Enter breadth: ");
        double bre = scan.nextDouble();

        Rectangle rect = new Rectangle(len, bre);
        rect.display();
    }
}