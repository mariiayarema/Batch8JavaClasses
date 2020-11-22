package Applications;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;

public class GUIAppPart2 extends Application implements EventHandler<ActionEvent> {
    TextField text;
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button=new Button("Click Button");
        Label label=new Label("Enter your name");
        text=new TextField();
        VBox vBoxlayout=new VBox();
        vBoxlayout.getChildren().add(label);
        vBoxlayout.getChildren().add(text);
        vBoxlayout.getChildren().add(button);
        Scene scene=new Scene(vBoxlayout,600,600);
        primaryStage.setTitle("Next Billion Dollar App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println(text.getCharacters());
    }
}
