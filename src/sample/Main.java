package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Main extends Application {

    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Mod 8 HW");

        // 14.1 - flags
        Button button1 = new Button("go to 14.3 hw");
        button1.setOnAction(event -> primaryStage.setScene(scene2));

        Pane pane = new GridPane();
        pane.setMinSize(400, 400);
        pane.setPadding(new Insets(5, 5, 5, 5));
        ((GridPane) pane).setVgap(5);
        ((GridPane) pane).setHgap(5);
        ((GridPane) pane).setAlignment(Pos.CENTER);

        ImageView us = new ImageView("image/us.gif");
        ImageView uk = new ImageView("image/uk.gif");
        ImageView ca = new ImageView("image/ca.gif");
        ImageView china = new ImageView("image/china.gif");

        ((GridPane) pane).add(ca, 0, 0);
        ((GridPane) pane).add(uk, 0, 1);
        ((GridPane) pane).add(china, 1, 0);
        ((GridPane) pane).add(us, 1, 1);
        ((GridPane) pane).add(button1, 0, 2);

        scene1 = new Scene(pane);

        // 14.3 - cards
        Label label2 = new Label("14.3 - cards");
        Button button2 = new Button("go to 14.1 hw");
        button2.setOnAction(event -> primaryStage.setScene(scene1));

        Pane box = new HBox(10);
        box.setPadding(new Insets(5, 5, 5, 5));

        Card card1 = new Card();
        int num1 = card1.getNum(99, 99);
        Card card2 = new Card();
        int num2 = card2.getNum(num1, 99);
        Card card3 = new Card();
        int num3 = card3.getNum(num1, num2);

        String url1 = card1.getURL(num1);
        String url2 = card2.getURL(num2);
        String url3 = card3.getURL(num3);

        ImageView cardy1 = new ImageView(url1);
        ImageView cardy2 = new ImageView(url2);
        ImageView cardy3 = new ImageView(url3);

        box.getChildren().add(cardy1);
        box.getChildren().add(cardy2);
        box.getChildren().add(cardy3);
        box.getChildren().addAll(label2, button2);

        scene2 = new Scene(box);

        // show scenes
        primaryStage.setScene(scene1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
