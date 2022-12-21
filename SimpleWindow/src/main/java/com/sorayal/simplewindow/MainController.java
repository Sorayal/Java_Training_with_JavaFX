package com.sorayal.simplewindow;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

  @FXML
  public Label byeText;
  @FXML
  private Label welcomeText;

  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
    byeText.setText("Thank you for using JavaFX!");
  }
}