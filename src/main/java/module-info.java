module com.example.practica1_fis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practica1_fis to javafx.fxml;
    exports com.example.practica1_fis;
}