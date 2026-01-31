package com.maintenance;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label titre = new Label("Application de Gestion de Maintenance");
        titre.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Button btnTest = new Button("Cliquez pour tester !");
        btnTest.setOnAction(e -> {
            System.out.println("JavaFX fonctionne !");
            titre.setText("Interface JavaFX fonctionne");
        });

        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(titre, btnTest);
        root.setStyle("-fx-padding: 50; -fx-background-color: #f0f0f0;");

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Maintenance App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}