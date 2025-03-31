public class Cellphone {
    String name;
    String processor;
    String memory;
    String os;
    float weight;

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Processor = " + processor);
        System.out.println("Memory = " + memory);
        System.out.println("OS = " + os);
        System.out.println();

    }

    public static void main(String[] args) {
        Cellphone myPhone = new Cellphone();
        myPhone.name = "Infinix";
        myPhone.processor = "octa-core";
        myPhone.memory = "64GB , 6GB";
        myPhone.os = "360";

        myPhone.display();

        System.out.println("---MOM's PHONE---");
        
        Cellphone momsPhone = new Cellphone();
        momsPhone.name = "Samsung";
        momsPhone.processor = "octa-core";
        momsPhone.memory = "64GB , 6GB";
        momsPhone.os = "360";

        momsPhone.display();
    }
}
