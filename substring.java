

public class substring {
    public static void main(String[] args) {

        String email = "makda7770@gmail.com";
        String username = email.substring(0, email.indexOf("@") - 4);
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.print(domain);
    }
}