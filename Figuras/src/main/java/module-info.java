module com.mycompany.figuras {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.figuras to javafx.fxml;
    exports com.mycompany.figuras;
}
