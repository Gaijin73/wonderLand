package org.javaacadmey.wonderfield;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Game {
    public static final int NUMBER_PLAYERS = 3;
    public static final int NUMBER_ROUNDS = 4;
    public static final int NUMBER_GROUP_ROUNDS = 3;
    public static final int ROUND_INDEX = 3;
    private static final Tasks[] TASKS = new Tasks[NUMBER_ROUNDS];

    public static Scanner scanner = new Scanner(System.in);

    public void init() throws InterruptedException {
        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.\n"
                + "Вам нужно ввести вопросы и ответы для игры.");

        // Получение вопросов и ответов
        for (int i = 0; i < NUMBER_ROUNDS; i++) {
            System.out.println("Введите вопрос #" + (i + 1));
            String questionText = scanner.nextLine();
            System.out.println("Введите ответ на вопрос #" + (i + 1));
            String answerText = scanner.nextLine();
            TASKS[i] = new Tasks(questionText, answerText);
        }

        System.out.println("Иницализация закончена, игра начнется через 5 секунд");

        // Ожидание 5 скунд
        sleep(5000);

        // Вывод 50 пустых строк
        System.out.println("\n".repeat(50));
    }
}
