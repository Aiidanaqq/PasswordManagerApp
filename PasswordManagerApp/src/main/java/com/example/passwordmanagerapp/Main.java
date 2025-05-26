package com.example.passwordmanagerapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login-view.fxml"));
            Scene scene = new Scene(loader.load());
            stage.setTitle("Password Manager");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке FXML файла:");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Общая ошибка при запуске приложения:");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
