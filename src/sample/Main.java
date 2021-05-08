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

        FXMLLoader firstPaneLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent firstPane = firstPaneLoader.load();
        Scene firstScene = new Scene(firstPane, sWidth, sHeight);

        // getting loader and a pane for the second scene
        FXMLLoader secondPageLoader = new FXMLLoader(getClass().getResource("temp.fxml"));
        Parent tutoPane = secondPageLoader.load();
        Scene tutoScene = new Scene(tutoPane, sWidth, sHeight);

        // injecting second scene into the controller of the first scene
        Controller firstPaneController = (Controller) firstPaneLoader.getController();
        firstPaneController.setSecondScene(tutoScene);

        // injecting first scene into the controller of the second scene
        Temp secondPaneController = (Temp) secondPageLoader.getController();
        secondPaneController.setFirstScene(firstScene);

        primaryStage.setTitle("AUSoft");
        primaryStage.setScene(firstScene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
