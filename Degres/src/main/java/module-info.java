module com.example.degres {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.degres to javafx.fxml;
    exports com.example.degres;
}