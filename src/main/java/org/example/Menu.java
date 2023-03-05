package org.example;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String selectFunction() {
        System.out.print("""
                --------------------------------------
                Выберите действие:
                --------------------------------------
                1. показать все задачи
                2. добавить новую задачу
                3. изменить существующую задачу
                4. отсортировать задачи по приоритету
                5. выполнить запись планера в файл            
                --------------------------------------
                0. Выход
                """);
        return scanner.nextLine();
    }

    public String selectSaveType() {
        System.out.print("""
                Выберите тип файла для записи:
                1. CSV
                2. JSOM
                3. XML
                --------------------------------------
                4. Вернуться в главное меню
                --------------------------------------
                0. Выход
                """);
        return scanner.nextLine();

    }

    public String selectModificTask() {
        System.out.print("""
                Что вы хотите изменить в задаче:
                1. Имя автора
                2. Приоритет
                3. Дедлайн
                
                --------------------------------------
                4. Вернуться в меню
                --------------------------------------
                0. Выход
                """);
        return scanner.nextLine();
    }

}

