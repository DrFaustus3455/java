public class do_while {
    public static void main(String[] args) {
        int sum = 0; int n = 20;
        int i = 1;
        do {
        sum += i; 
        ++i;
        } while (i <= n);
        System.out.println("Sum = " + sum);
    }
}
