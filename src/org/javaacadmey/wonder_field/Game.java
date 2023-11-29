package org.javaacadmey.wonder_field;

import java.util.Scanner;

public class Game {
    int numberPlayers = 3;
    int numberRounds = 4;
    int numberGroupRounds = 3;
    int roundIndex = 3;

    public static Scanner scanner = new Scanner(System.in);

    public static void init() {
        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.\n" +
                "Вам нужно ввести вопросы и ответы для игры.\n" +
                "Введите вопрос #1");
        System.out.println("Введите вопрос #1");
    }
}
