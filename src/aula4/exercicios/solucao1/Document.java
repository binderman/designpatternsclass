package aula4.exercicios.solucao1;

import java.util.Date;

public class Document {
    private String id;
    private Date timestamp;
    private String content;

    public Document(String id, Date timestamp, String content) {
        this.id = id;
        this.timestamp = timestamp;
        this.content = content;
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
