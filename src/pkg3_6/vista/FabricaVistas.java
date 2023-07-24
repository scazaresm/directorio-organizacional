/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_6.vista;

import javax.swing.JFrame;

/**
 * Fabrica abstracta oara crear distintos tipos de vistas
 * 
 * @author Sergio Cazares
 */
public class FabricaVistas {
    
    public enum TipoVista {
        APLICACION_CLIENTE,
        APLICACION_MAESTRA,
        EDITOR_DEPARTAMENTOS,
        EDITOR_PERSONAL,
        EXPLORADOR_DEPARTAMENTOS
    }
    
    public static JFrame crearVista(TipoVista tipoVista) {
        switch (tipoVista) {
            case APLICACION_CLIENTE:
                return new VistaAplicacionCliente();
            case APLICACION_MAESTRA:
                return new VistaAplicacionMaestra();
        }
        return null;
    }
}
