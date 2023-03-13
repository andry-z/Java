package com.example.javafxtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.IOException;

public class CalcolatriceApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalcolatriceApplication.class.getResource("calcolatrice-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 500);
        scene.getStylesheets().add(CalcolatriceApplication.class.getResource("style.css").toExternalForm());
        Image icon = new Image(getClass().getResource("calculator.png").toExternalForm());
        stage.getIcons().add(icon);
        stage.setTitle("Calcolatrice");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}