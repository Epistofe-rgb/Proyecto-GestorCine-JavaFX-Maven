package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Persona.Admin.Administrador;
import model.Persona.Admin.AdministradorDAO;
import utils.Paths;

import java.io.IOException;

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
        validarLogin(event);
    }

    private void validarLogin(ActionEvent event){
        String user = txt_username.getText();
        String pass = txt_password.getText();
        Administrador admin = administradorDAO.validarLogin(user, pass);
        if (admin != null){
            System.out.println("Bienvenido" + admin.getNombres());
            try {
                // Cargar el menú principal
                FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.MAIN_MENU));
                Parent root = loader.load();

                // Obtener el Stage actual desde el botón
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                // Cambiar la escena
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }catch (IOException e){
                e.printStackTrace();
            }
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
