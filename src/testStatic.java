public class testStatic {
    static int age;
    static void show(){
        System.out.println("This is static method ");
    }

    public static void main(String[] args) {
        age =25;
        System.out.println("I am a  " + age + " years old");
    }
}
