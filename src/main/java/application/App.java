package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utils.Paths;

public class App extends Application {
    static void main() {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane load = FXMLLoader.load(getClass().getResource(Paths.LOGIN));
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }
}

