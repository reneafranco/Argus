module com.example.argus {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.argus to javafx.fxml;
    exports com.example.argus;
}