import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Reader[] array = new Reader[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Введите ФИО");
            String initials = in.next();
            System.out.println("Введите факультет");
            String facult = in.next();
            System.out.println("Введите дату рождения");
            String bithdate = in.next();
            System.out.println("Введите номер телефона");
            String phone = in.next();
            array[i] = new Reader(initials, bithdate, phone, facult);
        }
        System.out.println(array[0].TakeBook(in.nextInt()));

        String test = in.nextLine();
        System.out.println(array[2].TakeBook(in.nextLine()));

        System.out.println(array[3].ReturnBook(in.nextInt()));

        String test2 = in.nextLine();
        System.out.println(array[4].ReturnBook(in.nextLine()));
    }
}