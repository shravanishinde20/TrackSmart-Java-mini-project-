package com.example.javamini;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.util.ResourceBundle;
public class tvnew implements Initializable{
    @FXML
    public TableView<tableviewname> table;
    @FXML
    public TableView<tbv2> table1;
    @FXML
    public TableColumn<tableviewname, String> sname;
//    @FXML
//    public TableView<tbv2> tableView;
    @FXML
    public TableColumn<tbv2,Integer> cid;
    @FXML
    public TableColumn<tbv2,Integer> date;
    @FXML
    public TextField courseidtf;
    @FXML
    public DatePicker datepicker;
    @FXML
    public TextField tf1;
    @FXML
    public TextField tf2;
    @FXML
    public TextField tf3;
    @FXML
    public TextField tf4;
    @FXML
    public TextField tf5;

    final ObservableList<tableviewname> listview= FXCollections.observableArrayList();
    final ObservableList<tbv2> listview1= FXCollections.observableArrayList();


    public void onadd(ActionEvent event) throws IOException, SQLException {
        DatabaseConnection connectnow = new DatabaseConnection();
        Connection connectdb = connectnow.getConnection();
        Statement statement = connectdb.createStatement();
        String insertDetails = "INSERT INTO tracksmart.session VALUES ('" + courseidtf.getText() + "', '" + datepicker.getValue() + "') ";
        statement = connectdb.createStatement();
        statement.executeUpdate(insertDetails);
        cid.setCellValueFactory(new PropertyValueFactory<>("CourseId"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        try {
            PreparedStatement ps = connectdb.prepareStatement("SELECT CourseId,date From session where CourseId="+courseidtf.getText()+";");

            ResultSet r= ps.executeQuery();


            while(r.next())
            {
                listview1.add(new tbv2(r.getString("CourseId"), r.getString("date")));

            }


            table1.setItems(listview1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public void onprofile(ActionEvent e) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI8.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI8.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void onstudent(ActionEvent e) throws IOException {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI6.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI6.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void onLogout(ActionEvent e) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LOGINPAGEfinal01.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("LOGINPAGEfinal01.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

//    public void onaddsess(ActionEvent event) throws IOException {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI3.fxml"));
//            ((Node) (event.getSource())).getScene().getWindow().hide();
//            Parent root1 = fxmlLoader.load(getClass().getResource("GUI3.fxml"));
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root1));
//            stage.show();
//        } finally {
//
//        }
//    }

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

    public void onsave(ActionEvent e) throws IOException{
        try {
            DatabaseConnection connectnow = new DatabaseConnection();
            Connection connectdb = connectnow.getConnection();
            PreparedStatement ps1 = connectdb.prepareStatement("UPDATE student set CourseId="+courseidtf.getText()+",state='"+tf1.getText()+"' where StudentId=1 AND course="+courseidtf.getText()+";");
            PreparedStatement ps2 = connectdb.prepareStatement("UPDATE student set CourseId="+courseidtf.getText()+",state='"+tf2.getText()+"' where StudentId=2 AND course="+courseidtf.getText()+";");
            PreparedStatement ps3 = connectdb.prepareStatement("UPDATE student set CourseId="+courseidtf.getText()+",state='"+tf3.getText()+"' where StudentId=3 AND course="+courseidtf.getText()+";");
            PreparedStatement ps4 = connectdb.prepareStatement("UPDATE student set CourseId="+courseidtf.getText()+",state='"+tf4.getText()+"' where StudentId=4 AND course="+courseidtf.getText()+";");
            PreparedStatement ps5 = connectdb.prepareStatement("UPDATE student set CourseId="+courseidtf.getText()+",state='"+tf5.getText()+"' where StudentId=5 AND course="+courseidtf.getText()+";");

            ps1.executeUpdate();
            ps2.executeUpdate();
            ps3.executeUpdate();
            ps4.executeUpdate();
            ps5.executeUpdate();

        } catch (SQLException e1) {
            throw new RuntimeException(e1);
        }
    }

    //

    //    ObservableList<tableviewname> tableviewSearchModelObservableList = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        sname.setCellValueFactory(new PropertyValueFactory<>("StudentName"));
        try {
            DatabaseConnection connectnow = new DatabaseConnection();
            Connection connectdb = connectnow.getConnection();
            PreparedStatement ps = connectdb.prepareStatement("SELECT StudentName From student limit 0,5;");
            ResultSet r= ps.executeQuery();


            while(r.next())
            {
                listview.add(new tableviewname(r.getString("StudentName")));
            }


            table.setItems(listview);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public void onaddbutton(ActionEvent actionEvent) {
//
//        Date newValue;
//        tvnew tvnew=new tvnew(courseidtf.getText(),datepicker.getValue());
//        tableView.getItems().add(tvnew);
//    }
//
//    public tvnew(String text, LocalDate text1) {
//    }
//
//
//
//    public void initialize(URL location, ResourceBundle resources) {
//        cid.setCellValueFactory(new PropertyValueFactory<>("CourseId"));
//        date.setCellValueFactory(new PropertyValueFactory<>("date"));
//
//
//    }

    }










//        public void onaddbutton(ActionEvent actionEvent) {
//            Date newValue;
//            com.example.javamini.tvnew tvnew=new com.example.javamini.tvnew(courseidtf.getText(),datepicker.getText());
//            tableView.getItems().add(tvnew);
//        }
//    }


