package org.example;

import java.util.Scanner;

public class Add {
    private final Scanner scanner;

    public Add(Scanner scanner) {
        this.scanner = scanner;
    }

    public Task makeNewTask() {
        System.out.println("Добавляем новую задачу в планнер.\n Введите тему");
        String subj = scanner.nextLine();
        System.out.println("Введите время окончания");
        String endOfTask = scanner.nextLine();
        System.out.println("Введите автора");
        String author = scanner.nextLine();
        System.out.println("\nУстановите приоритет: 1 - низкий, 2 - средний, 3 - высокий");
        String prior = scanner.nextLine();
        int priority = 0;
        if (prior.equals("1") | prior.equals("2") | prior.equals("3")) {
            priority = Integer.parseInt(prior);
        } else {
            System.out.println("Ошибка ввода, приоритет не установлен");
        }

        return new Task(subj, author, priority, endOfTask);
    }
}
