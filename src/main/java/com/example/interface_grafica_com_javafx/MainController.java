package com.example.interface_grafica_com_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label LabelText;

    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction(){
        Alerts.showAlert("Alert title", null, "Hello!", Alert.AlertType.INFORMATION);
    }
    @FXML
    protected void LabelTextButton() {
        LabelText.setText("Welcome to JavaFX Application!");
    }

}