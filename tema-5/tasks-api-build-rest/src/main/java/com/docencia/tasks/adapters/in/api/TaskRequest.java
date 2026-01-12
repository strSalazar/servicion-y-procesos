package com.docencia.tasks.adapters.in.api;
import java.util.Objects;

public class TaskRequest {
    private Long id;
    private String title;
    private String description;
    private boolean completed;

    public TaskRequest() {
    }

    public TaskRequest(Long id){
        this.id = id;
    }

    public TaskRequest(Long id, String title, String description, boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TaskRequest)) {
            return false;
        }
        TaskRequest taskRequest = (TaskRequest) o;
        return Objects.equals(id, taskRequest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            ", completed='" + isCompleted() + "'" +
            "}";
    }
}
