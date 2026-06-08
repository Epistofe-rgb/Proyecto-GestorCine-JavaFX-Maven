package model;

public class Cliente extends  Persona {
    private String telefono;
    private String cedula;
    private String direccion;
    private String correo;

    public Cliente(String nombres, String apellidos, String telefono, String cedula, String direccion, String correo) {
        super(nombres, apellidos);
        this.telefono = telefono;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correo = correo;
    }

    public Cliente() {
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
