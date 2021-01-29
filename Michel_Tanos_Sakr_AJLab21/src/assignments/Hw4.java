package assignments;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.*;

public class Hw4 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Images imagep0 = new Images();
        imagep0.setOpacity(5);
        Images imagep1 = new Images();
        imagep1.setOpacity(5);
        Images imagep2 = new Images();
        imagep2.setOpacity(5);

        Stage signins = new Stage();
        Stage signups = new Stage();

        GridPane signupp = new GridPane();
        signupp.setHgap(5);
        signupp.setVgap(5);
        signupp.setPadding(new Insets(8));

        signupp.add(new Text("Name:"), 0, 0);
        TextField name = new TextField();

        Label wrongname = new Label("X");
        wrongname.setTextFill(Color.RED);
        name.setOnAction(e -> CheckText(name, wrongname, "X"));
        name.setOnKeyReleased(e -> CheckText(name, wrongname, "X"));
        signupp.add(wrongname, 2, 0);

        signupp.add(name, 1, 0);

        signupp.add(new Text("Email:"), 0, 1);
        TextField email = new TextField();

        Label wrongEmail = new Label("X");
        wrongEmail.setTextFill(Color.RED);
        email.setOnAction(e -> CheckEmail(email, wrongEmail, "X"));
        email.setOnKeyReleased(e -> CheckEmail(email, wrongEmail, "X"));
        signupp.add(wrongEmail, 2, 1);

        signupp.add(email, 1, 1);

        signupp.add(new Text("Phone:"), 0, 2);
        TextField phone = new TextField();

        Label wrongPhone = new Label("X");
        wrongPhone.setTextFill(Color.RED);
        phone.setOnAction(e -> CheckPN(phone, wrongPhone, "X"));
        phone.setOnKeyReleased(e -> CheckPN(phone, wrongPhone, "X"));
        signupp.add(wrongPhone, 2, 2);

        signupp.add(phone, 1, 2);

        signupp.add(new Text("Password: "), 0, 3);
        PasswordField password = new PasswordField();

        signupp.add(password, 1, 3);

        signupp.add(new Text("confirm: "), 0, 4);
        PasswordField pf = new PasswordField();

        Label wrongCPassword = new Label("X");
        wrongCPassword.setTextFill(Color.RED);
        pf.setOnAction(e -> CheckPass(password, pf, wrongCPassword, "X"));
        pf.setOnKeyReleased(e -> CheckPass(password, pf, wrongCPassword, "X"));
        signupp.add(wrongCPassword, 2, 4);

        signupp.add(pf, 1, 4);

        signupp.add(new Text("country:"), 0, 5);
        ComboBox<String> combobox = new ComboBox<String>();
        combobox.getItems().addAll("france", "lebanon", "syria", "tailand");
        combobox.getSelectionModel().select(0);
        signupp.add(combobox, 1, 5);

        signupp.add(new Text("Gender"), 0, 6);
        RadioButton rb0 = new RadioButton("Male");
        RadioButton rb1 = new RadioButton("Female");
        final ToggleGroup toggle = new ToggleGroup();
        rb0.setToggleGroup(toggle);
        rb1.setToggleGroup(toggle);
        HBox rb = new HBox();
        rb.setPadding(new Insets(5));
        rb.getChildren().addAll(rb0, rb1);
        signupp.add(rb, 1, 6);

        signupp.add(new Text("Language"), 0, 7);
        CheckBox cb0 = new CheckBox();
        CheckBox cb1 = new CheckBox();
        CheckBox cb2 = new CheckBox();
        cb0.setText("Arabic");
        cb1.setText("English");
        cb2.setText("Spanish");
        HBox hboxcb = new HBox(20);
        hboxcb.getChildren().addAll(cb0, cb1, cb2);
        hboxcb.setPadding(new Insets(20));
        signupp.add(hboxcb, 1, 7);

        signupp.add(new Text("About you"), 0, 8);
        TextArea textarea = new TextArea();
        textarea.setPromptText("Your Biography...");
        signupp.add(textarea, 1, 8);

        Button signinbt = new Button();
        signinbt.setText("Sign In");

        signinbt.setPrefSize(300, 10);
        signinbt.setAlignment(Pos.CENTER);
        signinbt.setOnAction(e -> {
            signups.hide();
            signins.show();
        });

        Button signupbt = new Button();
        signupbt.setText("Sign Up");
        signupbt.setPrefSize(300, 10);
        signupbt.setAlignment(Pos.CENTER);

        signupbt.setOnAction(e -> CheckOverall(signupbt, wrongname, wrongEmail, wrongPhone, wrongCPassword));

        HBox hboxbutton = new HBox();
        hboxbutton.getChildren().addAll(signupbt, signinbt);
        hboxbutton.setAlignment(Pos.CENTER);
        signupp.add(hboxbutton, 0, 9, 5, 5);
        signupp.setAlignment(Pos.CENTER);

        StackPane p0 = new StackPane();
        p0.getChildren().add(imagep0);
        p0.getChildren().add(signupp);

        Scene signupsc = new Scene(p0, 600, 600);
        signups.setScene(signupsc);

        GridPane signinp = new GridPane();
        signinp.setAlignment(Pos.CENTER);
        signinp.setPadding(new Insets(10));
        signinp.setHgap(20);
        signinp.setVgap(20);

        signinp.add(new Label("username"), 0, 0);
        TextField usertext = new TextField();
        signinp.add(usertext, 1, 0);
        Label wrongusername = new Label("X");
        wrongusername.setTextFill(Color.RED);
        usertext.setOnAction(e -> CheckUsername(usertext, wrongusername, "X"));
        usertext.setOnKeyReleased(e -> CheckUsername(usertext, wrongusername, "X"));
        signinp.add(wrongusername, 2, 0);

        signinp.add(new Label("password"), 0, 1);
        PasswordField userpass = new PasswordField();
        signinp.add(userpass, 1, 1);
        Label wrongpass = new Label("X");
        wrongpass.setTextFill(Color.RED);
        userpass.setOnAction(e -> CheckPassword(userpass, wrongpass, "X"));
        userpass.setOnKeyReleased(e -> CheckPassword(userpass, wrongpass, "X"));
        signinp.add(wrongpass, 2, 1);

        Button si = new Button("Sign In");

        si.setOnAction(e -> CheckUP(usertext, userpass));

        Button su = new Button("Sign Up");
        su.setOnAction(e -> {
            signins.hide();
            signups.show();
        });
        signinp.add(si, 1, 2);
        signinp.add(su, 0, 2);

        StackPane p1 = new StackPane();
        p1.getChildren().add(imagep1);
        p1.getChildren().addAll(signinp);

        Scene signinp1 = new Scene(p1, 600, 600);

        signins.setScene(signinp1);

        Button Signin = new Button("Sign In");
        Signin.setOnAction(e -> {
            primaryStage.hide();
            signins.show();
        });

        Button Signup = new Button("Sign UP");
        Signup.setOnAction(e -> {
            primaryStage.hide();
            signups.show();
        });

        HBox bt = new HBox();
        bt.getChildren().addAll(Signin, Signup);
        bt.setAlignment(Pos.CENTER);
        bt.setPadding(new Insets(5));
        bt.setSpacing(10);
        StackPane btp = new StackPane();
        btp.getChildren().add(imagep2);
        btp.getChildren().add(bt);
        btp.setAlignment(Pos.CENTER);
        Scene scene = new Scene(btp, 600, 600);

        primaryStage.setTitle("Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

    public static boolean CheckText(TextField textfield, Label label, String text) {
        boolean input = true;
        String valid = null;

        if (!textfield.getText().matches("[a-z A-Z]+")) {
            input = false;
            valid = text;

        }
        label.setText(valid);

        return input;
    }

    public static boolean CheckPN(TextField textfield, Label label, String text) {
        boolean input = true;
        String valid = null;

        if (!textfield.getText().matches("[0-9]{8}")) {
            input = false;
            valid = text;

        }
        label.setText(valid);
        return input;
    }

    public static boolean CheckEmail(TextField textfield, Label label, String text) {
        boolean input = true;
        String valid = null;

        if (!textfield.getText().matches("^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            input = false;
            valid = text;

        }
        label.setText(valid);
        return input;
    }

    public static boolean CheckPass(PasswordField pass1, PasswordField pass2, Label label, String text) {
        boolean input = true;
        String valid = null;

        if (pass1.getText().compareTo(pass2.getText()) != 0) {
            input = false;
            valid = text;
        }
        label.setText(valid);
        return input;
    }

    public static boolean CheckOverall(Button button, Label label1, Label label2, Label label3, Label label4) {
        boolean input = true;

        if (label1.getText() != null || label2.getText() != null || label3.getText() != null || label4.getText() != null) {

            Alert alerterror = new Alert(Alert.AlertType.ERROR, "", new ButtonType("OK"));
            alerterror.setTitle("Error!");
            alerterror.setHeaderText("Account Not Valid");
            alerterror.showAndWait();
            input = false;

        } else {

            Alert alertcorrect = new Alert(Alert.AlertType.INFORMATION, "", new ButtonType("OK"));
            alertcorrect.setTitle("Done!");
            alertcorrect.setHeaderText("Succesfully Registered");
            alertcorrect.showAndWait();
        }
        return input;

    }

    public static boolean CheckUsername(TextField textfield, Label label, String text) {
        boolean input = true;
        String valid = null;

        if (!textfield.getText().matches("snoopy") && !textfield.getText().matches("scooby") && !textfield.getText().matches("scrappy")
                && !textfield.getText().matches("snowy") && !textfield.getText().matches("charlie") && !textfield.getText().matches("lucy")) {
            input = false;

            valid = text;

        }
        label.setText(valid);
        return input;
    }

    public static boolean CheckPassword(PasswordField passfield, Label label, String text) {
        boolean input = true;
        String valid = null;

        if (!passfield.getText().matches("123456") && !passfield.getText().matches("a1b2c3") && !passfield.getText().matches("q1w2e3")
                && !passfield.getText().matches("000000") && !passfield.getText().matches("abcdefg") && !passfield.getText().matches("pass123")) {
            input = false;

            valid = text;

        }
        label.setText(valid);
        return input;
    }

    public static void CheckUP(TextField textfield, PasswordField passfield) {
        boolean exist = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("D:\\users.txt")))) {

            String st;

            while ((st = reader.readLine()) != null) {
                String[] splitted = st.split("		");
                if (textfield.getText().equals(splitted[0]) && passfield.getText().equals(splitted[1])) {
                    exist = true;

                } else {
                }
            }

            if (exist == true) {
                Alert alertcorrect = new Alert(Alert.AlertType.INFORMATION, "", new ButtonType("OK"));
                alertcorrect.setTitle("Done!");
                alertcorrect.setHeaderText("Successfully logged in");
                alertcorrect.showAndWait();

            } else {
                Alert alerterror = new Alert(Alert.AlertType.ERROR, "", new ButtonType("OK"));
                alerterror.setTitle("Error!");
                alerterror.setHeaderText("Wrong Username Or Password");
                alerterror.showAndWait();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
