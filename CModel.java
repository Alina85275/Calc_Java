public interface CModel {

    ComplexModel complexAdd(ComplexModel additive);

    ComplexModel complexReduce(ComplexModel reduction);

    ComplexModel complexMultiply(ComplexModel multiplier);

    ComplexModel complexDivide(ComplexModel divident);

    public double getA();

    public double getB();

    public ComplexModel getResult();

    void printResult(ComplexModel arg);
}