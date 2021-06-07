package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;


public class LAB_5_1_2_19BCE2186 extends Application {
    @Override
    public void start(Stage primaryStage) {

        Button btn = new Button();
        btn.setText("Red");
        Button btn1 = new Button();
        btn1.setText("Green");
        Button btn2 = new Button();
        btn2.setText("Blue");
        Button btn3 = new Button();
        btn3.setText("Pink");
        Button btn4 = new Button();
        btn4.setText("Black");
        btn.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("color is " + btn.getText());
                btn.setStyle("-fx-background-color: red");
            }
        });
        btn1.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("color is " + btn1.getText());
                btn1.setStyle("-fx-background-color: green");
            }
        });
        btn2.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("color is " + btn2.getText());
                btn2.setStyle("-fx-background-color: blue");
            }
        });
        btn3.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("color is " + btn3.getText());
                btn3.setStyle("-fx-background-color: pink");
            }
        });
        btn4.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("color is " + btn4.getText());
                btn4.setStyle("-fx-background-color: black");
            }
        });
        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btn1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btn2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btn3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btn4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        TilePane tileButtons = new TilePane(Orientation.HORIZONTAL);
        tileButtons.setPadding(new Insets(20, 10, 20, 0));
        tileButtons.setHgap(10.0);
        tileButtons.setVgap(8.0);
        tileButtons.getChildren().addAll(btn, btn1, btn2 , btn3 , btn4);

        Scene scene = new Scene(tileButtons, 400, 300);
        primaryStage.setTitle("Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
