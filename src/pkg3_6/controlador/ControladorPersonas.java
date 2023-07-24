/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_6.controlador;

import pkg3_6.modelo.ConexionDB;
import pkg3_6.modelo.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergio Cazares
 */
public class ControladorPersonas {
    
    private ConexionDB db;
    
    public boolean crearPersona(Persona persona) { return true; }
    
    public boolean actualizarPersona(Persona persona) { return true; }
    
    public boolean borrarPersona(Persona persona) { return true; }
    
    public Persona obtenerPersona(String nombre) { 
        return new Persona("", "", "", "");
    }
    
    public List<Persona> obtenerPersonas() {
        List<Persona> personas = new ArrayList<>();
        try {
            ResultSet rs = db.ejecutarConsulta("SELECT nombre, telefono, email, cubiculo, departamento FROM personas");
            while ( rs.next() ) {
                personas.add(new Persona(
                        rs.getString("nombre"), 
                        rs.getString("telefono"), 
                        rs.getString("email"),
                        rs.getString("cubiculo")
                    )
                );
            }
        } catch(Exception ex) {
            System.out.println("Falla al ejecutar SQL: " + ex);
        }
        return personas;
    }
}
