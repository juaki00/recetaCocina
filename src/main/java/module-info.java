module com.example.recetacocina {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.recetacocina to javafx.fxml;
    exports com.example.recetacocina;
}