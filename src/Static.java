public class Static {
    int multiply(int a, int b) {
        return a * b;
    }
    static int sum(int a, int b) {
        return a+b;
    }
}
class test {
    public static void main(String[] args) {
        Static s = new Static();
        System.out.println("4 x 8 =" + s.multiply(4,8) );
        System.out.println("4 + 8 = "+ s.multiply(4 ,8));
    }
}


