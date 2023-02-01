public class RCalcModel extends RationalModel { // задает значения иксу и игрику и производит сумму

    public RCalcModel() {

    }

    @Override
    public int result() {
        return a + b;
    }

    @Override
    public int subtruct() {
        return a - b;
    }

    @Override
    public int division() {
        return a / b;
    }

    @Override
    public int multiply() {
        return a * b;
    }

    @Override
    public void setA(int value) {
        super.a = value;
    }

    @Override
    public void setB(int value) {
        super.b = value;
    }

}