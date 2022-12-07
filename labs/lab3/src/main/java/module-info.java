module com.labs.lab3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.labs.lab3 to javafx.fxml;
    exports com.labs.lab3;
}