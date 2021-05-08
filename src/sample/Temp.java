package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Temp {

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
    private ImageView installIcon;

    @FXML
    private Button installBut;

    @FXML
    private TextArea textArea;

    @FXML
    void RecentBut(ActionEvent event) {

    }

    private Scene firstScene;

    public void setFirstScene(Scene scene) {
        firstScene = scene;
    }

    @FXML
    public void openFirstScene(ActionEvent actionEvent) {
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(firstScene);
    }

}
