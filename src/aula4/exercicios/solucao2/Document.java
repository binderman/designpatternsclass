package aula4.exercicios.solucao2;

import java.util.Date;

public class Document {
    private static int idCounter = 0;
    private String id;
    private Date timestamp;
    private String content;

    public Document(String type, Date timestamp, String content) {
        this.id = generateId(type);
        this.timestamp = timestamp;
        this.content = content;
    }

    private static synchronized String generateId(String type) {
        return type + (++idCounter);
    }

    public String getId() {
        return id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setContent(String content) {
        this.content = content;
    }
}