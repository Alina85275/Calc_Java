import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Presenter p = new Presenter(new RCalcModel(), new View());
        PresenterComplex c = new PresenterComplex();
        System.out.println("Выберите рациональное или комплексное число?: ");
        System.out.println("1 - рациональное;");
        System.out.println("2 - комплексное;");
        int swtc = sc.nextInt();
        if (swtc == 1) {
            p.buttonClick();
        } else if (swtc == 2) {
            c.buttonClick2();
        } else
            System.out.println("Введён некорректный вариант");
    }
}