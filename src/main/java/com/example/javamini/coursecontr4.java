 package com.example.javamini;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;



public class coursecontr4 extends NullPointerException {
    @FXML
    private Label label;

//    public static void main(String[] args) { launch(args); }


    public void oncourse(ActionEvent e) throws IOException {
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI4.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI4.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }

    public void onsessions(ActionEvent e) throws IOException {

        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI4.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI4.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
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
    }

    public void onprofile(ActionEvent e) throws IOException {

        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI8.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI8.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }
    public void start(Stage stage) throws Exception {

    }

}