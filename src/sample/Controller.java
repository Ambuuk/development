package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller{

    @FXML
    private TextField searchField;

    @FXML
    private Button HomeBut;

    @FXML
    private Button RecentBut;

    @FXML
    private Button OptionBut;

    @FXML
    private Button HelpBut;

    @FXML
    private Button ExitBut;

    @FXML
    void HomeBut(ActionEvent event) {

    }

    @FXML
    void RecentBut(ActionEvent event) {

    }

    private Scene secondScene;

    public void setSecondScene(Scene scene) {
        secondScene = scene;
    }

    @FXML
    void openTutorial(ActionEvent event) {
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        primaryStage.setScene(secondScene);
    }



}
