public class p3 {
    public static void main(String[] args) {
        char s = ' ';
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(s + i);
            }
            System.out.printf("\n");
            s+=1;
        }
    }
}
