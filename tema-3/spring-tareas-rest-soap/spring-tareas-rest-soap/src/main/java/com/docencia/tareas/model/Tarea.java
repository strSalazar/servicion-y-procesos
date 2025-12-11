package com.docencia.tareas.model;

import java.util.Objects;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "tarea")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tarea {
    private Long id;
    private String titulo;
    private String descripcion;
    private boolean completada;

    /**
     * constructor vacio
     */
    public Tarea() {
    }

    /**
     * constructor de busqueda solo con el id
     * @param id
     */
    public Tarea(Long id) {
        this.id = id;
    }

    /**
     * constructor completo
     * @param id
     * @param titulo
     * @param descripcion
     * @param completada
     */
    public Tarea(Long id, String titulo, String descripcion, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    
    @Override
    public String toString() {
        return "Tarea [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", completada=" + completada
                + "]";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tarea)) {
            return false;
        }
        Tarea tarea = (Tarea) o;
        return Objects.equals(id, tarea.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
}
