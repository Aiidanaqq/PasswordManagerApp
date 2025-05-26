module com.example.passwordmanagerapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.sql;


    opens com.example.passwordmanagerapp to javafx.fxml;
    exports com.example.passwordmanagerapp;
}