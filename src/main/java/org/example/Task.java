package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task implements Comparable<Task> {
    private String subject;
    private String author;
    private String addTime;
    private String addDate;
    private int priority;
    private String endOfTask;
    private int id;
    private static int count;

    static {
        count = 0;
    }


    /**
     * Это конструктор
     *
     * @param subject   Что нужно сделать
     * @param author    Автор
     * @param priority  приоритет
     * @param endOfTask время окончания задачи
     */

    public Task(String subject, String author, int priority, String endOfTask) {
        this.subject = subject;
        this.author = author;
        this.addTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.addDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.priority = priority;
        this.endOfTask = endOfTask;
        this.id = ++count;
    }

    public Task(String subject) {
        this.addTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.addDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.subject = subject;
        this.author = "неизвестный";
        this.priority = 0;
        this.endOfTask = "бессрочно";
        this.id = ++count;
    }

    public Task() {
        this.addTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.addDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.subject = "Задача " + (count);
        this.author = "неизвестный";
        this.priority = 0;
        this.endOfTask = "бессрочно";
        this.id = ++count;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAddTime() {
        return addTime;
    }

    public String getAddDate() {
        return addDate;
    }

    public String getEndOfTask() {
        return endOfTask;
    }

    public int getId() {
        return id;
    }

    public String getPriority() {
        return switch (priority) {
            case 1 -> "приоритет низкий";
            case 2 -> "средний приоритет";
            case 3 -> "наивысший приоритет";
            default -> "приоритет не установлен";
        };
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


    public void setEndOfTask(String endOfTask) {
        this.endOfTask = endOfTask;
    }

    @Override
    public String toString() {
        return "№" + getId() + ' ' + getSubject() +
                ", автор: " + getAuthor() +
                ", время добавления: " + addTime +
                ", дата добавления: " + addDate +
                ", дедлайн: " + endOfTask +
                ", важность: " + getPriority();
    }

    @Override
    public int compareTo(Task o) {
        int compareId
                = o.getId();
        return this.id - compareId;
    }
}

