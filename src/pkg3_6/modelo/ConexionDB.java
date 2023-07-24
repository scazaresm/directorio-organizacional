/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_6.modelo;

import java.sql.*;
import java.util.List;


/**
 * Implementacion de Singleton para conexion con la base de datos.
 * 
 * @author Sergio Cazares
 */
public class ConexionDB {
    
    private static ConexionDB instancia;
    
    private Connection conexionSqlite;

    private ConexionDB() {
    }
    
    public static ConexionDB obtenerInstancia() {
        if(instancia == null) {
            instancia = new ConexionDB();
            instancia.conectar();
        }
        return instancia;
    }
    
    public void conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            conexionSqlite = DriverManager.getConnection("jdbc:sqlite:directorio_organizacional.sqlite");
            System.out.println("Conexion exitosa");
        } catch(Exception ex) {
            System.out.println("La conexión falló: " + ex.getMessage());
        }
    }
    
    public ResultSet ejecutarConsulta(String consulta) { 
        try {
            Statement stmt = conexionSqlite.createStatement();
            ResultSet result = stmt.executeQuery(consulta);
            System.out.println("Consulta OK: " + consulta);
            return result;
        } catch(Exception ex) {
            System.out.println("Falla al ejecutar consulta: " + consulta + "\n" + ex);
        }
        return null;
    }
    
    
    public void ejecutarUpdate(String sql) {
        try {
            Statement stmt = conexionSqlite.createStatement();
            stmt.executeUpdate(sql);   
            stmt.close();
        } catch(Exception ex) {
            System.out.println("Falla al ejecutar SQL:: " + sql + "\n" + ex);
        }
    };
    
}
