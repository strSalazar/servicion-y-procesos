package com.docencia.tasks.adapters.in.api;
import java.util.Objects;

public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private boolean completed;

    public TaskResponse() {
    }

    public TaskResponse(Long id, String title, String description, boolean completed) {
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

    public TaskResponse id(Long id) {
        setId(id);
        return this;
    }

    public TaskResponse title(String title) {
        setTitle(title);
        return this;
    }

    public TaskResponse description(String description) {
        setDescription(description);
        return this;
    }

    public TaskResponse completed(boolean completed) {
        setCompleted(completed);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TaskResponse)) {
            return false;
        }
        TaskResponse taskResponse = (TaskResponse) o;
        return Objects.equals(id, taskResponse.id) && Objects.equals(title, taskResponse.title) && Objects.equals(description, taskResponse.description) && completed == taskResponse.completed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, completed);
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
