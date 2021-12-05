/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationtest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author didik
 */
public class JavaFXApplicationTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button buttonRegister = new Button("Register");

        Label labelFirstName = new Label("First Name ");
        Label labelLastName = new Label("Last Name ");
        Label labelEmail = new Label("E-Mail Address ");
        Label labelContact = new Label("Contact No ");
        Label labelPassword = new Label("Password ");
        Label labelConfirmPassword = new Label("Confirm Password ");

        TextField tfFirstName = new TextField();
        TextField tfLastName = new TextField();
        TextField tfEmail = new TextField();
        TextField tfContact = new TextField();
        TextField tfPassword = new TextField();
        TextField tfConfirmPassword = new TextField();

        HBox hboxFirstName = new HBox();
        HBox hboxLastName = new HBox();
        HBox hboxEmail = new HBox();
        HBox hboxContact = new HBox();
        HBox hboxPassword = new HBox();
        HBox hboxConfirmPassword = new HBox();
        
        VBox vboxField = new VBox();

        hboxFirstName.getChildren().addAll(labelFirstName, tfFirstName);
        hboxFirstName.setSpacing(50);
        
        hboxLastName.getChildren().addAll(labelLastName, tfLastName);
        hboxLastName.setSpacing(51);

        hboxEmail.getChildren().addAll(labelEmail, tfEmail);
        hboxEmail.setSpacing(29);

        hboxContact.getChildren().addAll(labelContact, tfContact);
        hboxContact.setSpacing(49);

        hboxPassword.getChildren().addAll(labelPassword, tfPassword);
        hboxPassword.setSpacing(59);
        
        hboxConfirmPassword.getChildren().addAll(labelConfirmPassword, tfConfirmPassword);
        hboxConfirmPassword.setSpacing(14);

        vboxField.getChildren().addAll(hboxFirstName, hboxLastName, hboxEmail, hboxContact, hboxPassword, hboxConfirmPassword);
        vboxField.setSpacing(10);

        vboxField.setLayoutX(30);
        vboxField.setLayoutY(30);

        Group group = new Group();
        TilePane tpPane = new TilePane();
        
        tpPane.getChildren().addAll(buttonRegister);
        buttonRegister.setStyle("-fx-background-color: #3d85c6; ");
        
        tpPane.setLayoutX(150);
        tpPane.setLayoutY(250);
        
        group.getChildren().addAll(vboxField, tpPane);
        
        Scene scene = new Scene(group, 350, 300);
        scene.setFill(Color.WHITE);

        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
