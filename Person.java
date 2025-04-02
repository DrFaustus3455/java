import java.util.Scanner;

public class Person {
    String name;
    int age;
    
    void show() {
        System.out.println("\n");
        System.out.println("XXXXXXXXXXXXXXX");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("XXXXXXXXXXXXXXX");
        System.out.println("\n");
    }

   /*  public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Person person1 = new Person();
        System.out.print("Write your name: ");
        person1.name = scan.nextLine();
        System.out.print("Write your age: ");
        person1.age = scan.nextInt();
        person1.show();
        scan.nextLine();

        Person person2 = new Person();
        System.out.print("Write your name: ");
        person2.name = scan.nextLine();
        System.out.print("Write your age: ");
        person2.age = scan.nextInt();
        person2.show();
        scan.nextLine();

        Person person3 = new Person();
        System.out.print("Write your name: ");
        person3.name = scan.nextLine();
        System.out.print("Write your age: ");
        person3.age = scan.nextInt(); 
        person3.show();
        scan.nextLine();

        Person person4 = new Person();
        System.out.print("Write your name: ");
        person4.name = scan.nextLine();
        System.out.print("Write your age: ");
        person4.age = scan.nextInt(); 
        person4.show();
        scan.nextLine();

        scan.close();
    }
    
}*/
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Person[] person = new Person[10];

    for(int i=0; i <= 4; i++ ) {
        person[i] = new Person();
        System.out.print("What is your name: ");
        person[i].name = scan.nextLine();
        System.out.print("What is your age: ");
        person[i].age = scan.nextInt();
        person[i].show();
        scan.nextLine();
    }
}
}
