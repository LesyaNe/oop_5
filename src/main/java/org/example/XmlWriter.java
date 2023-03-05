package org.example;
public class XmlWriter implements Format{

    public <T extends Task> String createString(T task) {
        return String.format("""
                <xml>
                <Task>
                <id>%d</id>
                <Subject>%s</Subject>
                <Author>%s</Author>
                <Adding time>%s</Adding time>
                <Adding date>%s</Adding date>
                <Deadline>%s</Deadline>
                <Priority>%s</Priority>
                </Task></xml>
                """, task.getId(), task.getSubject(), task.getAuthor(),task.getAddTime(), task.getAddDate(), task.getEndOfTask(), task.getPriority());
    }
}
