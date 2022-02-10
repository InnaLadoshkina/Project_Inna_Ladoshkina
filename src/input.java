import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите Имя");
        String string = a.nextLine();
        System.out.println("Вы ввели "+string);
        Scanner b = new Scanner(System.in);
        System.out.println("Введите Ваш возраст");
        int x = b.nextInt();
        System.out.println("Вы ввели "+x);
    }
}
