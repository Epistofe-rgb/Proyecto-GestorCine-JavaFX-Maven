package model;

public class Administrador extends Persona {
    private String username;
    private String password;

    public Administrador(String nombres, String apellidos, String username, String password) {
        super(nombres, apellidos);
        this.username = username;
        this.password = password;
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
