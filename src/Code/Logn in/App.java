<<<<<<< HEAD

import java.io.IOException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
 
public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
  
        Parent root;
        try {
        root = FXMLLoader.load(getClass().getResource("/Login/login.fxml"));
        Scene scene = new Scene(root);
  
        primaryStage.setTitle("Phần Mềm Quản Lí Bán Hàng");
        primaryStage.setScene(scene);
        primaryStage.show();
        } 
        
        catch (IOException e) {
   
        e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        launch(args);
    }
=======
import java.io.IOException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
 
public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
  
        Parent root;
        try {
        root = FXMLLoader.load(getClass().getResource("/Login/login.fxml"));
        Scene scene = new Scene(root);
  
        primaryStage.setTitle("Phần Mềm Quản Lí Bán Hàng");
        primaryStage.setScene(scene);
        primaryStage.show();
        } 
        
        catch (IOException e) {
   
        e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        launch(args);
    }
>>>>>>> 87b736cf36ca43b85959edd3674d9c63a3f52d67
}