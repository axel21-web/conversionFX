module uni.edeu.ni.programacion.conversionfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens uni.edeu.ni.programacion.conversionfx to javafx.fxml;
    exports uni.edeu.ni.programacion.conversionfx;
    exports ni.edu.uni.programacion;
}
