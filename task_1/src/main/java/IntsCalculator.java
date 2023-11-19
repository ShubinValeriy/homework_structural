public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        double resultDouble = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result;
        int resultInt = (int) resultDouble;
        return resultInt;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double resultDouble = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result;
        int resultInt = (int) resultDouble;
        return resultInt;
    }

    @Override
    public int pow(int a, int b) {
        double resultDouble = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result;
        int resultInt = (int) resultDouble;
        return resultInt;
    }
}
