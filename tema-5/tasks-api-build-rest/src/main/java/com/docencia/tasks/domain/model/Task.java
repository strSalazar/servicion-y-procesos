package com.docencia.tasks.domain.model;
import java.util.Objects;

public class Task {
    private Long identificador;
    private String titulo;
    private String descripcion;
    private boolean completado;

    public Task() {
    }

        public Task(Long id){
        this.identificador = id;
    }

    public Task(Long id, String title, String description, boolean completed) {
        this.identificador = id;
        this.titulo = title;
        this.descripcion = description;
        this.completado = completed;
    }

    public Long getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(Long id) {
        this.identificador = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String title) {
        this.titulo = title;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String description) {
        this.descripcion = description;
    }

    public boolean isCompletado() {
        return this.completado;
    }

    public boolean getCompleted() {
        return this.completado;
    }

    public void setCompletado(boolean completed) {
        this.completado = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Task)) {
            return false;
        }
        Task task = (Task) o;
        return Objects.equals(identificador, task.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getIdentificador() + "'" +
            ", title='" + getTitulo() + "'" +
            ", description='" + getDescripcion() + "'" +
            ", completed='" + isCompletado() + "'" +
            "}";
    }
}
