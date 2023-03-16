package com.example.javafxtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.IOException;

public class CalcolatriceApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalcolatriceApplication.class.getResource("calcolatrice-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 480);
        scene.getStylesheets().add(CalcolatriceApplication.class.getResource("style.css").toExternalForm());
        Image icon = new Image(getClass().getResource("calculator.png").toExternalForm());
        Font.loadFont(getClass().getResourceAsStream("digital-7.ttf"), 12);
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