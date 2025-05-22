package menu;

import java.util.ArrayList;
import java.util.List;

public class UsuariosRegistrados {
    private String nombre;
    private String apellido;
    private int cedula;
    private int claveNumerica;

    

    public UsuariosRegistrados() {
    }

    public UsuariosRegistrados(String nombre, String apellido, int cedula, int claveNumerica) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.claveNumerica = claveNumerica;
        
    }

    public void add(UsuariosRegistrados usuariosRegistrados) {
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getClaveNumerica() {
        return claveNumerica;
    }

    public void setClaveNumerica(int claveNumerica) {
        this.claveNumerica = claveNumerica;
    }
}
