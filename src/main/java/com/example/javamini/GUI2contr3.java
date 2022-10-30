package com.example.javamini;
import javafx.scene.Node;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

import java.io.IOException;

public class GUI2contr3 extends Application {
    @FXML
    private Label label;
    @FXML
    private TextField TextField_EnterEmailAddress;
    @FXML
    private PasswordField PasswordField_EnterPassword;
    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    public void onCourse(ActionEvent e) throws IOException {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI4.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI4.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

    }
    public void onLogout(ActionEvent e) throws IOException {

        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LOGINPAGEfinal01.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("LOGINPAGEfinal01.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }
    public void onstudent(ActionEvent e) throws IOException {

        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI6.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI6.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }    public void onprofile(ActionEvent e) throws IOException {

        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI8.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI8.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }
    @Override
    public void start(Stage stage) throws Exception {

    }

//    @Override
//    public void start(Stage stage) throws Exception {
//
}

