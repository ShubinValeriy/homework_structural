public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        System.out.println("101 + 1010 = " + bins.sum("101", "1010")); // = 1111
        System.out.println("100 * 1000 = " + bins.mult("100", "1000")); // = 100000
    }
}
