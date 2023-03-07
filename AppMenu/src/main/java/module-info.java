module com.example.appmenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appmenu to javafx.fxml;
    exports com.example.appmenu;
}