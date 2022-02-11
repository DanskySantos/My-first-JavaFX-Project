package com.example.interface_grafica_com_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectAPerson extends Application {

        @Override
        public void start(Stage stage) {
            try {
                Parent parent = FXMLLoader.load(getClass().getResource("PersonView.fxml"));
                Scene scene = new Scene(parent);
                stage.setScene(scene);
                stage.show();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            launch();
        }
    }
