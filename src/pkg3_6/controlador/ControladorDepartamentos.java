/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_6.controlador;

import java.util.List;
import pkg3_6.modelo.ConexionDB;
import pkg3_6.modelo.Departamento;

import java.sql.ResultSet;
import java.util.ArrayList;
import pkg3_6.modelo.Persona;
import java.sql.Statement;

/**
 *
 * @author Sergio Cazares
 */
public class ControladorDepartamentos {
    
    private final ConexionDB db = ConexionDB.obtenerInstancia();
    
    public void crearDepartamento(Departamento departamento) {  
        String sql = "INSERT INTO departamentos (nombre,nombre_responsable,telefono) " +
                        "VALUES (" + 
                            departamento.getNombre() + ", " +
                            departamento.getResponsable() + ", " +
                            departamento.getTelefono() + ")";
       
        db.ejecutarUpdate(sql);
    }
    
    public boolean actualizarDepartamento(Departamento departamento) { return true; }
    
    public boolean borrarDepartamento(Departamento departamento) { return true; }
    
    public List<Departamento> obtenerDepartamentos() {
        List<Departamento> departamentos = new ArrayList<>();
        try {
            ResultSet rs = db.ejecutarConsulta("SELECT nombre, nombre_responsable, telefono  FROM departamentos");
        
            while ( rs.next() ) {
                departamentos.add(new Departamento(
                        rs.getString("nombre"), 
                        rs.getString("nombre_responsable"), 
                        rs.getString("telefono")
                    )
                );
            }
            rs.close();
            
            for(Departamento dpt : departamentos) {
                rs = db.ejecutarConsulta("SELECT nombre, telefono, email, cubiculo, departamento FROM personas WHERE departamento='" + dpt.getNombre() + "'");
                
                while ( rs.next() ) {
                    dpt.agregarPersona(new Persona(
                            rs.getString("nombre"), 
                            rs.getString("telefono"), 
                            rs.getString("email"),
                            rs.getString("cubiculo")
                        )
                    );
                }
            }
            rs.close();
            
        } catch(Exception ex) {
            System.out.println("Error: " + ex);
        }
        return departamentos;
    }
    
}
