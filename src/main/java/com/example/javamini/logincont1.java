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
import java.sql.*;

import static com.example.javamini.HelloController.setEmail;

public class logincont1 extends Application {
    @FXML
    private Label Labelloginmsg;

    @FXML
    private TextField TextField_EnterEmailAddress;
    @FXML
    private PasswordField PasswordField_EnterPassword;
//    public static void main(String[] args) { launch(args); }

    @FXML
    public void onlogin(ActionEvent e) throws IOException {

//             DatabaseConnection connectnow=new DatabaseConnection();
//            Connection connectdb=connectnow.getConnection();
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI2.fxml"));
//            ((Node) (e.getSource())).getScene().getWindow().hide();
//            Parent root1 = fxmlLoader.load(getClass().getResource("GUI2.fxml"));
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root1));
//            stage.show();
        if (!TextField_EnterEmailAddress.getText().isBlank() && !PasswordField_EnterPassword.getText().isBlank() ){

            validatelogin(e);

        } else {
            Labelloginmsg.setText("Both Username & Password Needed!");
        }


    }

    public void onsignup(ActionEvent e) throws IOException {

         {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("su2final.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("su2final.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }
    public void validatelogin(ActionEvent e) {
        DatabaseConnection connectnow = new DatabaseConnection();
        Connection connectdb = connectnow.getConnection();
        String verifylogin = "select count(1) from teacher where TeacherEmail='" + TextField_EnterEmailAddress.getText() + "' and Password='" + PasswordField_EnterPassword.getText() + "'";
        try {
            Statement statement = connectdb.createStatement();
            ResultSet queryResult = statement.executeQuery(verifylogin);
            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    try {
                        setEmail(TextField_EnterEmailAddress.getText());
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI2.fxml"));
                        ((Node)(e.getSource())).getScene().getWindow().hide();
                        Parent root1 = fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root1));
                        stage.show();
                    } catch (Exception ep)
                    {
                        ep.printStackTrace();
                    }
                } else {
                    Labelloginmsg.setText("Wrong Credentials! Please try again.");
                }
            }
        } catch (Exception ep) {
            ep.printStackTrace();
        }

    }
    public void start(Stage stage) throws Exception {

    }

}