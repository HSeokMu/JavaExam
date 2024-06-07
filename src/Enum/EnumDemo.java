package Enum;

public class EnumDemo {
    public static void main(String[] args) {
        Operation demo = Operation.PLUS;
        System.out.println(demo.calculate(10, 20));
    }
}
