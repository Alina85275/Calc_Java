import java.util.Scanner;

public class PresenterComplex {

    public PresenterComplex() {

    }

    public void buttonClick2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вещественную часть первого числа: ");
        double real = sc.nextDouble();
        System.out.println("Введите мнимую часть первого числа: ");
        double img = sc.nextDouble();
        ComplexModel num = new ComplexModel(real, img);
        ComplexModel num2 = new ComplexModel(0, 0);
        System.out.println("Выберите действие: ");
        System.out.println("1 - прибавить комплексное число;");
        System.out.println("2 - отнять комплексное число;");
        System.out.println("3 - умножить на комплексное число;");
        System.out.println("4 - делить на комплексное число;");
        int swtc = sc.nextInt();

        if (swtc == 1 || swtc == 2 || swtc == 3 || swtc == 4) {
            System.out.println("Введите вещественную и мнимую часть второго комплексного числа: ");
            num2 = new ComplexModel(sc.nextDouble(), sc.nextDouble());
        }
        switch (swtc) {
            case 1: {
                num.printResult(num.complexAdd(num2));
                break;
            }
            case 4: {
                num.printResult(num.complexReduce(num2));
                break;
            }
            case 6: {
                num.printResult(num.complexMultiply(num2));
                break;
            }
            case 7: {
                num.printResult(num.complexDivide(num2));
                break;
            }
            default: {
                System.out.println("Ошибка.");
            }
        }

    }

}
