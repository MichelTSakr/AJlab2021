/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Mark
 */
public class Hw2Login extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label name = new Label("Name:");
        Label email = new Label("Email:");
        Label phone = new Label("Phone:");
        Label password = new Label("Password:");
        Label confirm = new Label("Confirm:");
        Label country = new Label("Country:");
        Label gender = new Label("Gender:");
        Label language = new Label("Language:");
        Label about = new Label("About you:");
        
       // Label [] labels = {new Label("Name"), new Label("Email"), new Label("Phone"), new Label("Password"),new Label("Confirm"), new Label("Country"), new Label("Gender"), new Label("Language"), new Label("About you")};
     
        
        VBox vBox0 = new VBox();
        vBox0.getChildren().addAll(name, email,phone,password,confirm,country,gender,language,about);
        vBox0.setMargin(about, new Insets(130,0, 0,0));
        vBox0.setMargin(name, new Insets(15,0, 0,0));
        vBox0.setMargin(email, new Insets(33,0, 0,0));
        vBox0.setMargin(phone, new Insets(30,0, 0,0));
        vBox0.setMargin(password, new Insets(30,0, 0,0));
        vBox0.setMargin(confirm, new Insets(28,0, 0,0));
        vBox0.setMargin(country, new Insets(30,0, 0,0));
        vBox0.setMargin(gender, new Insets(25,0, 0,0));
        vBox0.setMargin(language, new Insets(40,0, 0,0));
        
        
        
        
        TextField nametxt = new TextField();
        TextField emailtxt = new TextField();
        TextField phonetxt = new TextField();
        PasswordField pf = new PasswordField();
        PasswordField pfc = new PasswordField();
        ComboBox cmb = new ComboBox();
        
        
        
        RadioButton rbm = new RadioButton("Male");
        RadioButton rbf = new RadioButton("Female");
        HBox hBox0 = new HBox();
        hBox0.getChildren().addAll(rbm,rbf);
        hBox0.setMargin(rbm, new Insets(0, 20, 20, 20));
        
         CheckBox checka = new CheckBox("Arabic");
         CheckBox checke = new CheckBox("English");
         CheckBox checks = new CheckBox("Spanish");
         HBox hBox1 = new HBox();
        hBox1.getChildren().addAll(checka,checke,checks);
        hBox1.setMargin(checka, new Insets(0, 20, 20, 20));
        hBox1.setMargin(checke, new Insets(0, 20, 20, 20));
        
        TextArea txtArea = new TextArea();
        txtArea.setPromptText("Your Biography...");
        
        VBox vBox1 = new VBox();
        vBox1.getChildren().addAll(nametxt,emailtxt,phonetxt,pf,pfc,cmb,hBox0,hBox1,txtArea);
        vBox1.setMargin(nametxt, new Insets(10, 20, 20, 20));
        vBox1.setMargin(emailtxt, new Insets(0, 20, 20, 20));
        vBox1.setMargin(phonetxt, new Insets(0, 20, 20, 20));
        vBox1.setMargin(pf, new Insets(0, 20, 20, 20));
        vBox1.setMargin(pfc, new Insets(0, 20, 20, 20));
        vBox1.setMargin(cmb, new Insets(0, 20, 20, 20));
        vBox1.setMargin(hBox0, new Insets(0, 20, 20, 20));
        vBox1.setMargin(hBox1, new Insets(0, 20, 20, 20));
        vBox1.setMargin(txtArea, new Insets(0, 20, 20, 20));
        
        
        
        
        Button register = new Button("Register");
        register.setPrefSize(700, 20);
        register.setAlignment(Pos.CENTER);
        HBox hBox2 = new HBox();
        hBox2.getChildren().add(register);
        hBox2.setAlignment(Pos.CENTER);
   
        
        HBox hBox3 = new HBox();
        hBox3.getChildren().addAll(vBox0,vBox1);
        hBox3.setAlignment(Pos.CENTER);
        
        Label nodigit = new Label("");
        Label invemail = new Label("");
        Label phone8 = new Label("");
        Label phonech = new Label("");
        Label cntry = new Label("");
        
         VBox error = new VBox();
         error.getChildren().addAll(nodigit,invemail,phone8,phonech,cntry);
         error.setMargin(nodigit, new Insets(20, 0, 0, 0));
         
        
        VBox p = new VBox(hBox3,hBox2,error);
        p.setPadding(new Insets(20));
        
        
         
        

        Scene scene = new Scene(p, 800, 900);
        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();

   
    }
   /* public static boolean TextCheck(TextField nametxt, Label nodigit, String validText) {
        boolean isAlphabet = true;
        String validString = null;

        if (!nametxt.getText().matches("[a-z A-Z]+")) {
            isAlphabet = false;
            validString = validText;

        }
        nodigit.setText(validString);

        System.out.println(nametxt.getText().matches("[a-z A-Z]+"));
        return isAlphabet;
    }

    nametxt.setOnKeyReleased (e 

    -> TextCheck(nametxt, labelA, "Name must not have digits"));*/

  
    

    public static void main(String[] args) {
        launch(args);
        
        
    }
    
    

}
