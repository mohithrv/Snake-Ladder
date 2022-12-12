package com.example.snakeLadder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class Main extends Application {
    public static Group root;
    @Override
    public void start(Stage stage) throws Exception {
        root = new Group();
        startGame start = new startGame();
        root.getChildren().add(start.root);

        stage.setTitle("Snake And Ladder");
        stage.setScene(new Scene(root, 800, 500));
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}