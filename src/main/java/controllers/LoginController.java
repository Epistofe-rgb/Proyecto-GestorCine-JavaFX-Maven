package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Persona.Admin.Administrador;
import model.Persona.Admin.AdministradorDAO;

public class LoginController {
    @FXML
    private Button btn_login;
    @FXML
    private TextField txt_password;
    @FXML
    private TextField txt_username;

    private AdministradorDAO administradorDAO = new AdministradorDAO();

    @FXML
    void login_Administrador(ActionEvent event) {
        validarLogin();
    }

    private void validarLogin(){
        String user = txt_username.getText();
        String pass = txt_password.getText();
        Administrador admin = administradorDAO.validarLogin(user, pass);
        if (admin != null){
            System.out.println("Bienvenido" + admin.getNombres());
        }else {
            System.out.println("Credenciales incorrectas");
            limpiarCampos();
        }
    }

    private void limpiarCampos(){
        txt_username.setText("");
        txt_password.setText("");
    }

}
