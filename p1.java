import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int month;
        int year;
         
        System.out.print("Input a month number(1-12): ");
        month = scan.nextInt();
        System.out.print("Input an year: ");
        year = scan.nextInt();

        int Year = year % 4;
       if (Year == 0)
       {
        switch(month)
        {
            case 1: 
            System.out.println("January " + year + " has 31 days");
            break;
            case 2: 
            System.out.println("Febuary " + year + " has 29 days");
            break;
            case 3: 
            System.out.println("March " + year + " has 30 days");
            break;
            case 4: 
            System.out.println("April " + year + " has 31 days");
            break;
            case 5: 
            System.out.println("May " + year + " has 30 days");
            break;
            case 6: 
            System.out.println("June " + year + " has 31 days");
            break;
            case 7: 
            System.out.println("July " + year + " has 30 days");
            break;
            case 8: 
            System.out.println("August " + year + " has 31 days");
            break;
            case 9: 
            System.out.println("September " + year + " has 30 days");
            break;
            case 10: 
            System.out.println("October " + year + " has 31 days");
            break;
            case 11: 
            System.out.println("November " + year + " has 30 days");
            break;
            case 12: 
            System.out.println("December " + year + " has 31 days");
            break;
            default: 
            System.out.print("Error: The particular month doesn't exist");
            break;
        }
     }
        else
        {
            switch(month)
            {
                case 1: 
                System.out.println("January " + year + " has 31 days");
                break;
                case 2: 
                System.out.println("Febuary " + year + " has 28 days");
                break;
                case 3: 
                System.out.println("March " + year + " has 30 days");
                break;
                case 4: 
                System.out.println("April " + year + " has 31 days");
                break;
                case 5: 
                System.out.println("May " + year + " has 30 days");
                break;
                case 6: 
                System.out.println("June " + year + " has 31 days");
                break;
                case 7: 
                System.out.println("July " + year + " has 30 days");
                break;
                case 8: 
                System.out.println("August " + year + " has 31 days");
                break;
                case 9: 
                System.out.println("September " + year + " has 30 days");
                break;
                case 10: 
                System.out.println("October " + year + " has 31 days");
                break;
                case 11: 
                System.out.println("November " + year + " has 30 days");
                break;
                case 12: 
                System.out.println("December " + year + " has 31 days");
                break;
                default: 
                System.out.print("Error: The particular month doesn't exist");
                break;
            } 
        }

        scan.close();
    }
}