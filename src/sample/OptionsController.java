package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class OptionsController {

    @FXML public TextField txtValue;
    @FXML public ListView lstValues;

    public void cmdAddClick() {
        String enteredValue = txtValue.getText().trim();
        txtValue.clear();
        if (!enteredValue.equals("")) {
            lstValues.getItems().add(enteredValue);
        }
    }
}
