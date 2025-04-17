public class whileloop {
    public static void main(String[] args) {
        int sum = 0; int n = 20;
        int i = 1;
        while (i <= n) {
        sum += i; 
        ++i;
        }
        System.out.println("Sum = " + sum);
    }
}
