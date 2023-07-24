/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_6.modelo;

/**
 * Modelo para representar la entidad 'Persona'
 * 
 * @author Sergio Cazares
 */
public class Persona {
    
    private String nombre;
    private String telefono;
    private String email;
    private String cubiculo;
    private Departamento departamento;

    public Persona(String nombre,
                   String telefono, 
                   String email, 
                   String cubiculo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.cubiculo = cubiculo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCubiculo() {
        return cubiculo;
    }

    public void setCubiculo(String cubiculo) {
        this.cubiculo = cubiculo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
    @Override
    public String toString() {
      return this.nombre;  
    }
    
}
