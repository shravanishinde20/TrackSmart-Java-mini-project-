package com.example.javamini;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.lang.module.ResolvedModule;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class tableviewcontr implements Initializable {

    @FXML
    private TableView<tableview> studenttableview;
    @FXML
    private TableColumn<tableview, String> snametablecolumn;
    @FXML
    private TableColumn<tableview, String> semailtablecolumn;

    ObservableList<tableview> tableviewSearchModelObservableList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resource){

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String studentViewQuery = "SELECT StudentName, StudentEmail FROM student limit 0,5";

        try{

            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(studentViewQuery);

            while (queryOutput.next()){

                String queryStudentName = queryOutput.getString("StudentName");
                String queryStudentEmail = queryOutput.getString("StudentEmail");


                tableviewSearchModelObservableList.add(new tableview(queryStudentName, queryStudentEmail));
            }

            snametablecolumn.setCellValueFactory(new PropertyValueFactory<>("StudentName"));
            semailtablecolumn.setCellValueFactory(new PropertyValueFactory<>("StudentEmail"));

            studenttableview.setItems(tableviewSearchModelObservableList);

        } catch (SQLException e) {
            Logger.getLogger(tableviewcontr.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
    }
}
