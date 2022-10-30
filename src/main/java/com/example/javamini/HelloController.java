package com.example.javamini;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    public  static  String email =null;

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        HelloController.email = email;
    }
}