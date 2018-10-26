/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static logica.Utils.sdf;

/**
 *
 * @author inaki
 */
public class Corredor {
    
    private String dni;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String direccion;
    private int telefono;
    private ArrayList<Resultado> HistorialResultados = new ArrayList<>();
    
    
    public Corredor() {
    }

    
    
    public Corredor(String dni, String nombre, String apellido, Date fechaNacimiento, String direccion, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String toStringCSV() {
        
        return dni + "," + nombre + "," + apellido + "," + sdf.format(fechaNacimiento) + "," + direccion + "," + telefono;
    }
    
    
    
    @Override
    public String toString() {
        
        return dni + "," + nombre + "," + apellido + "," + sdf.format(fechaNacimiento) + "," + direccion + "," + telefono;
    }
    
    
    
}
