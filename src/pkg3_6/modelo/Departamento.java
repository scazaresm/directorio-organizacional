/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_6.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo para representar la entidad 'Departamento'
 * 
 * @author Sergio Cazares
 */
public class Departamento {
    
    private String nombre;
    private String responsable;
    private String telefono;
    
    List<Persona> personal = new ArrayList<>();

    public Departamento(String nombre, String responsable, String telefono) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Persona> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Persona> personal) {
        this.personal = personal;
    }
    
    public void agregarPersona(Persona persona) {
        persona.setDepartamento(this);
        this.personal.add(persona);
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }
    
}
