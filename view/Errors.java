package Seminar7.view;

import java.util.Scanner;

public class Errors {
    static Scanner scanner = new Scanner(System.in);

    public static int menuErrors(int size) {
        int num;
        while (true) {
            num = scanner.nextInt();
            if (num > 0 && num <= size) break;
            System.out.println("введите корректный номер меню");
        }
        return num;
    }

}
