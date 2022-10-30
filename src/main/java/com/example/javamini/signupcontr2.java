package com.example.javamini;
import javafx.scene.Node;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import static com.example.javamini.HelloController.setEmail;

public class signupcontr2 extends NullPointerException {
    @FXML
    private Label Labelsignmsg;
    @FXML
    private TextField tf_name;
    @FXML
    private TextField tf_email;
    @FXML
    private PasswordField tf_pass;
    @FXML
    private PasswordField tf_cpass;
//    public static void main(String[] args) { launch(args); }

    @FXML
    public void onlogin(ActionEvent e) throws IOException {

        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LOGINPAGEfinal01.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("LOGINPAGEfinal01.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }



    private void validatesigup2(ActionEvent e) {
    }


    @FXML
    public void onsignup2(ActionEvent event) throws IOException, SQLException {

        if (tf_name.getText().equals("") && tf_email.getText().equals("") && tf_pass.getText().equals("") && tf_cpass.getText().equals((""))) {
//
//
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI2.fxml"));
//            ((Node) (e.getSource())).getScene().getWindow().hide();
//            Parent root1 = fxmlLoader.load(getClass().getResource("GUI2.fxml"));
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root1));
//            stage.show();

            Labelsignmsg.setText("Please enter all required details!");
        }
        /*else {
            String name=tf_name.getText();
            String email=tf_email.getText();
            String pass=tf_pass.getText();
            String cpass=tf_cpass.getText();
            DatabaseConnection connectnow=new DatabaseConnection();
            Connection connectdb=connectnow.getConnection();
            PreparedStatement psinsert = null;
            if (tf_cpass.getText().equals(tf_pass.getText())) {


                psinsert = connectdb.prepareStatement("insert into teacher VALUES (?,?,?);\n");
                psinsert.setString(1, String.valueOf(tf_name));
                psinsert.setString(2, String.valueOf(tf_email));
                psinsert.setString(3, String.valueOf(tf_pass));;

                psinsert.executeUpdate();
            }
*/          else {
            DatabaseConnection connectnow = new DatabaseConnection();
            Connection connectdb = connectnow.getConnection();
            Statement statement = connectdb.createStatement();
            String insertDetails =  "INSERT INTO tracksmart.teacher VALUES ('"+tf_name.getText()+"', '"+tf_email.getText()+"', '"+tf_pass.getText()+"') ";
            statement = connectdb.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a>0){
                System.out.println("Inserted data!");
                setEmail(tf_email.getText());
                Labelsignmsg.setText("Account created successfully!");
                Parent root = FXMLLoader.load(getClass().getResource("GUI2.fxml")); //pas   s scene name here
                Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else {
                System.out.println("Insertion failed!");
            }
        }
    }


    public void start(Stage stage) throws Exception {

    }

}