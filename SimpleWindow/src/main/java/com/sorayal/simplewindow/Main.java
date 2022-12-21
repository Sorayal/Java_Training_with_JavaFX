package com.sorayal.simplewindow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

  // Stage is the root to build on the elements. It´s the top level container
  @Override
  public void start(Stage stage) throws IOException {

    // using XML-Style to create a scene, the "hello-view.fxml" is the URL for the Loader
    FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }

  // Application starts here
  public static void main(String[] args) {
    launch();
  }
}