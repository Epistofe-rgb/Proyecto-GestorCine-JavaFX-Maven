package model.Persona.Admin;

import model.Persona.Persona;

public class Administrador extends Persona {
    private int id;
    private String username;
    private String password;

    public Administrador(int id ,String nombres, String apellidos, String username, String password) {
        super(nombres, apellidos);
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Administrador() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
