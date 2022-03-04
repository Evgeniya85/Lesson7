package lesson7;

import java.util.Scanner;

public class Convector {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение текущий курс : ");
        double curs = input.nextDouble();
        System.out.print("Введите колличество рублей : ");
        double rub = input.nextDouble();
        double dol = rub / curs;
        System.out.println( " Итого: " + dol + "  долларов " );
    }
}
