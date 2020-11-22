package Applications;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import javafx.scene.control.Button;

public class GUIApplication extends Application {
    public static void main(String[] args) {
    launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First GUI Application");

        Button button=new Button("Click Here");
        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        Scene scene=new Scene(layout,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
