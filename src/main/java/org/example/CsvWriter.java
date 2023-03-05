package org.example;

public class CsvWriter implements Format{

    public <T extends Task> String createString(T task) {
        return String.format("%d,%s,%s,%s,%s,%s,%s\n",task.getId(), task.getSubject(), task.getAuthor(),
                task.getAddTime(), task.getAddDate(), task.getEndOfTask(), task.getPriority());
    }
}
