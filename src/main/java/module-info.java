module pro.samy.swpjfx2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens pro.samy.swpjfx2 to javafx.fxml;
    exports pro.samy.swpjfx2;
}