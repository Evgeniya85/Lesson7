package lesson7;

import java.util.Scanner;

public class test {
    public static void main (String [] args) {
        String answer;
        boolean exit;
        System.out.println ("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner inputAnswer = new Scanner (System.in);

        exit = false;
        for(int i = 1; i <= 3; i++){
            if (exit == true)
                break;
            answer = inputAnswer.next ();
            switch (answer){
                case ("вирус"):
                    System.out.println ("Правильно!");
                    exit = true;
                    break;
                case ("Сдаюсь"):
                    System.out.println ("Правильный ответ: вирус.");
                    exit = true;
                    break;
                default:
                    System.out.println("Подумай еще.");
            }
        }
    }
}

