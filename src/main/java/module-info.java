module com.example.lab14 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.lab14 to javafx.fxml;
    exports com.example.lab14;

    opens com.example.lab14.model to javafx.fxml;
    exports com.example.lab14.model;

    opens com.example.lab14.dataBase to javafx.fxml;
    exports com.example.lab14.dataBase to javafx.fxml;
}