import java.util.Scanner; //позволяет работать с терминалом

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) { // получает какой-то текст распечатывает его и получает число
        System.out.printf("%s", title);
        return in.nextInt();
    }

    // print(f'{title} = {data}')
    public void print(int division, String title) { // печать данных на экран
        System.out.printf("%s %d\n", title, division);
    }

}
