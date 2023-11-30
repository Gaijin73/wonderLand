package org.javaacadmey.wonderfield;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Game {
    int numberPlayers = 3;
    int numberRounds = 4;
    int numberGroupRounds = 3;
    int roundIndex = 3;

    String[] questions = new String[4];
    String[] answers = new String[4];

    public static Scanner scanner = new Scanner(System.in);

    public void init() throws InterruptedException {
        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.\n" +
                "Вам нужно ввести вопросы и ответы для игры.");

        for (int i = 1; i <= numberRounds; i++) {
            System.out.println("Введите вопрос #" + i);
            questions[i] = scanner.nextLine();
            System.out.println("Введите ответ на вопрос #" + i);
            answers[i] = scanner.nextLine();
        }

        System.out.println("Иницализация закончена, игра начнется через 5 секунд");

        // Ожидание 5 скунд
        sleep(5000);

        // Вывод 50 пустых строк
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
