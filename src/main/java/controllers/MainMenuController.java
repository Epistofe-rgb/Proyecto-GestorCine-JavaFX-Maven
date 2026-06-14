package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import utils.Paths;

import java.io.IOException;

public class MainMenuController {
    @FXML
    private Pane contenedorCentral;
//756 x 661
    @FXML
    void cerrar_sesion(ActionEvent event) {

    }

    @FXML
    void ventana_boleteria(ActionEvent event) throws IOException {
        Parent vistaBoleteria = FXMLLoader.load(getClass().getResource(Paths.BOLETERIA_MENU));
        contenedorCentral.getChildren().setAll(vistaBoleteria);
    }

    @FXML
    void ventana_cliente(ActionEvent event) throws IOException {
        Parent vistaCliente = FXMLLoader.load(getClass().getResource(Paths.CLIENTE_MENU));
        contenedorCentral.getChildren().setAll(vistaCliente);
    }

    @FXML
    void ventana_facturas(ActionEvent event) {

    }

    public void cambioScene(String path) throws IOException {
        Parent vistaCargada = FXMLLoader.load(getClass().getResource(path));
        contenedorCentral.getChildren().setAll(vistaCargada);
    }
}
