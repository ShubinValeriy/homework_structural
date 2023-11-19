public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int firstNumber = Integer.parseInt(a, 2);
        int secondNumber = Integer.parseInt(b, 2);
        int result = firstNumber + secondNumber;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int firstNumber = Integer.parseInt(a, 2);
        int secondNumber = Integer.parseInt(b, 2);
        int result = firstNumber * secondNumber;
        return Integer.toBinaryString(result);
    }
}
