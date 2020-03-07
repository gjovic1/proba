package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button btnBtn;
    public Button clsBtn;
    public Label chgLabel;
    public void changeLabelDescription(ActionEvent actionEvent) {
        chgLabel.setText("Dobar dan!");
    }

    public void closeWindow(ActionEvent actionEvent) {
        System.exit(0);
    }
}
