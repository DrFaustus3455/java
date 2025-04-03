class StaticMethodExample {
    static int i = 100;
    static String s = "Beginnersbook";

    static void display() {
        System.out.println("i:" + i);
        System.out.println("s:" + s);
    }

    void funcn() {
        display();
    }

    public static void main(String args[]) {
        StaticMethodExample obj = new StaticMethodExample();
        obj.funcn();
        display();
    }
}