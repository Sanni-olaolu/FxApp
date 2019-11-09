package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    public TextField txtValue;

    @FXML
    public Label lblValue;

    public void cmdDisplayClick() {
        String enteredValue = txtValue.getText();
        txtValue.clear();
        lblValue.setText(enteredValue);
    }

    public void cmdOpenOptions() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("options.fxml"));
        Stage mystage = new Stage();
        mystage.setScene(new Scene(root, 300, 275));
        mystage.show();
    }
}
