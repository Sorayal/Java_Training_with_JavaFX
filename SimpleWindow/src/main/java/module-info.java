module com.sorayal.simplewindow {
  requires javafx.controls;
  requires javafx.fxml;

  opens com.sorayal.simplewindow to javafx.fxml;
  exports com.sorayal.simplewindow;
}