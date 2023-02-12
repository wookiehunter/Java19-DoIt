module com.stevengodson.java19doit {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.stevengodson.java19doit to javafx.fxml;
    exports com.stevengodson.java19doit;
}