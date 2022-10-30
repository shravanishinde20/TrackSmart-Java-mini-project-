module com.example.javamini {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javamini to javafx.fxml;
    exports com.example.javamini;
}