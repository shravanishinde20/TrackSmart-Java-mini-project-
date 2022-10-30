package com.example.javamini;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.io.IOException;
import java.util.ResourceBundle;

import static com.example.javamini.HelloController.getEmail;

public class profilecontr implements Initializable{
    @FXML
    private Label email;

    @FXML
    private Label name;


    @FXML
    private Label label;
    public String Email = getEmail();

    @FXML
    private Button buttonprofile;
    @FXML
    private Button buttonback22;
    @FXML
    private TextField TextField_EnterEmailAddress;
    @FXML
    private PasswordField PasswordField_EnterPassword;
//    public static void main(String[] args) { launch(args); }


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

    public void onCourse(ActionEvent e) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI4.fxml"));
        ((Node) (e.getSource())).getScene().getWindow().hide();
        Parent root1 = fxmlLoader.load(getClass().getResource("GUI4.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();

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


    public void start(Stage stage) throws Exception {

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DatabaseConnection connectnow = new DatabaseConnection();
        Connection connectdb = connectnow.getConnection();
        System.out.println(Email);
        String sql = "select TeacherName from teacher where TeacherEmail = '" +Email+ "'\n";
        Statement s = null;
        try {
            System.out.println("Inside try");
            s = connectdb.createStatement();
            ResultSet resultSet = s.executeQuery(sql);
            if (resultSet.next()) {
                System.out.println("Inside if");
                System.out.println(resultSet.getString("TeacherName"));
                String a = resultSet.getString(1);
                System.out.println(a);
                name.setText(a);
                email.setText(Email);
            }


        } catch (SQLException e) {
            System.out.println("Error");;
        }

    }

}