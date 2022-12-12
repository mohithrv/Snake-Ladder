package com.example.snakeLadder;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StartGameController {

    @FXML
    public void start(MouseEvent event) throws IOException {
        AnchorPane start;
        start = FXMLLoader.load(getClass().getResource("GamePage.fxml"));

        Main.root.getChildren().setAll(start);
    }
}
