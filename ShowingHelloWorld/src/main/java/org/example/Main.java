package org.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * To start it with Maven, use:
 * mvn clean javafx:run -e
 *
 * IntelliJ complains about a missing runtime , so it won´t work starting directly from
 * there.
 * The solution is under "Edit configurations" to add the VM options for adding the modules
 * like:
 * "--module-path C:\X1_Development\JDK\javafx-sdk-19\lib --add-modules=javafx.controls,javafx.fxml"
 *
 * This will add the necessary modules to JavaFX.
 * See @link https://stackoverflow.com/questions/52467561/intellij-cant-recognize-javafx-11-with-openjdk-11
 * See @link https://stackoverflow.com/questions/52906773/intellij-idea-error-javafx-runtime-components-are-missing-and-are-required-t
 */
public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  // Setting up stage
  @Override
  public void start(Stage primaryStage) {
    // setting stage title
    primaryStage.setTitle("Hello Universe!");

    // adding new component button
    Button btn = new Button();
    btn.setText("Click on me!");

    // setting up eventhandler for the button
    btn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        System.out.println("Ähmmm oki, hello universe!");
      }
    });

    // adding another component

    // acts like a stack building components from bottom to top.
    StackPane pane = new StackPane();
    pane.getChildren().add(btn);

    // setting up the scene
    primaryStage.setScene(new Scene(pane, 300, 300));
    primaryStage.show();
  }
}