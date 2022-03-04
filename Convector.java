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
        String result = String.format("%.2f",dol);
        System.out.println( " Итого: " + result + "  долларов " );
    }
}
