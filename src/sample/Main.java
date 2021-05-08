package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        int sWidth = 700;
        int sHeight = 500;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        Parent root2 = FXMLLoader.load(getClass().getResource("temp.fxml"));
        primaryStage.setTitle("AUSoft");
        Scene primaryScene = new Scene(root, sWidth, sHeight);
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
