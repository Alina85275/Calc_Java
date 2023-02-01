public class ComplexModel implements CModel {
    double a, b;
    ComplexModel result;

    ComplexModel(double a1, double b1) {
        a = a1;
        b = b1;
    }

    @Override
    public ComplexModel complexAdd(ComplexModel additive) {
        a = a + additive.a;
        b = b + additive.b;
        return this;
    }

    @Override
    public ComplexModel complexReduce(ComplexModel reduction) {
        a = a - reduction.a;
        b = b - reduction.b;
        return this;
    }

    @Override
    public ComplexModel complexMultiply(ComplexModel multiplier) {
        double buf = a;
        a = a * multiplier.a - b * multiplier.b;
        b = buf * multiplier.b + b * multiplier.a;
        return this;
    }

    @Override
    public ComplexModel complexDivide(ComplexModel divident) {
        double m = (a * divident.a + b * divident.b) / (divident.a * divident.a + divident.b * divident.b);
        b = (b * divident.a - a * divident.b) / (divident.a * divident.a + divident.b * divident.b);
        a = m;
        return this;
    }

    @Override
    public double getA() {
        return a;

    }

    @Override
    public double getB() {
        return b;

    }

    @Override
    public ComplexModel getResult() {
        return result;

    }

    @Override
    public void printResult(ComplexModel arg) {
        System.out.println(arg.getB() + "i " + "+ (" + arg.getA() + ")");
    }

}
