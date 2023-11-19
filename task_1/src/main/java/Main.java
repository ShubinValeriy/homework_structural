public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println("-20 + 2 = " + calc.sum(-20, 2));
        System.out.println("10 * 22 = " + calc.mult(10, 22));
        System.out.println("2 ^ 4 = " + calc.pow(2, 4));
    }
}
