package com.docencia.tareas.soap;

import java.util.List;

import com.docencia.tareas.model.Alumno;

import jakarta.jws.*;

@WebService(
    targetNamespace = "http://alumnos.ies.puerto.es/",
    name = "AlumnoPorType"
)
public interface IAlumnoSoapEndpoint {
    
    @WebMethod(operationName = "listar")
    List<Alumno> listar();

    
    

}
