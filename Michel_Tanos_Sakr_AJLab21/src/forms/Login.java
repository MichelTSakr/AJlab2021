/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Mark
 */
public class Login extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label user = new Label("USERNAME");
        Label Pass = new Label("PASSWORD");
        TextField usertxt = new TextField();
        PasswordField passtxt = new PasswordField();
        Button signin = new Button("Sign in ");
        String imageURL = "https://picsum.photos/200";

        VBox vBox0 = new VBox();
        vBox0.getChildren().addAll(user, Pass);

        vBox0.setMargin(user, new Insets(0, 20, 20, 20));
        vBox0.setMargin(Pass, new Insets(20, 20, 20, 20));

        VBox vBox1 = new VBox();
        vBox1.getChildren().addAll(usertxt, passtxt, signin);
        user.setFont(Font.font("Times new roman", FontWeight.BOLD, 20));
        Pass.setFont(Font.font("Times new roman", FontWeight.BOLD, 20));

        vBox1.setMargin(usertxt, new Insets(0, 20, 20, 20));
        vBox1.setMargin(passtxt, new Insets(10, 20, 20, 20));
        vBox1.setMargin(signin, new Insets(0, 20, 20, 20));
        HBox hbox0 = new HBox();

        hbox0.getChildren().addAll(vBox0, vBox1);

        HBox hBox1 = new HBox();
        hBox1.getChildren().add(createImageViewFromURL(imageURL));
        hBox1.setAlignment(Pos.CENTER);

        VBox vBox2 = new VBox();
        vBox2.getChildren().addAll(hBox1, hbox0);
        vBox2.setMargin(hBox1, new Insets(20, 20, 20, 20));
        vBox2.setAlignment(Pos.CENTER);
        vBox2.setStyle("-fx-Background-color: white ; -fx-Border-color: black;");

        Scene scene = new Scene(vBox2, 500, 500);
        primaryStage.setTitle("LOGIN_INTERFACE");
        primaryStage.setScene(scene);
        primaryStage.show();

   
    }

    ImageView createImageViewFromURL(String imageURL) {
        Image image = new Image(imageURL, 200, 200, false, false);
        ImageView imageView = new ImageView(image);
        return imageView;

    }

    public static void main(String[] args) {
        launch(args);
    }
}
