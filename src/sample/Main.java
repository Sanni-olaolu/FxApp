package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() {
        System.out.println("Application is initialising");
    }

    @Override
    public void stop() {
        System.out.println("Application is stopped.");
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setScene(new Scene(root, 300, 275));

        System.out.println("Showing the primary stage");
        primaryStage.setTitle("Hello World");
        primaryStage.show();
        System.out.println("Primary stage is now visible");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
