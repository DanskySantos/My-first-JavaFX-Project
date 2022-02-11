package com.example.interface_grafica_com_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label LabelText;

    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction(){
        System.out.println("Click!");
    }
    @FXML
    protected void LabelTextButton() {
        LabelText.setText("Welcome to JavaFX Application!");
    }
}