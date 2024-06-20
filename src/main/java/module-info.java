module com.example.argus {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.argus to javafx.fxml;
    exports com.example.argus;
}