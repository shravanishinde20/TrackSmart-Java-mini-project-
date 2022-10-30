
package com.example.javamini;

import java.sql.Connection;
import java.sql.DriverManager;


    public class DatabaseConnection {
        public Connection databaseLink;

        public Connection getConnection() {
            String databaseName = "tracksmart";
            String databaseUser = "root";
            String databasePassword = "Shinde/1220@";

            String url = "jdbc:mysql://localhost:3306/" +databaseName;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
                System.out.println("DB Connection done !");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("DB Connection Failures !");
            }

            return databaseLink;
        }
    }
