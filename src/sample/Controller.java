package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private TextField searchField;

    @FXML
    private Button HomeBut;

    @FXML
    private Button HelpBut;

    @FXML
    private Button ExitBut;

    @FXML
    private FlowPane flow;

    @FXML
    private Button officeBut;

    @FXML
    private Button JavaBut;

    @FXML
    private Button MavenBut;

    @FXML
    private Button EclipseBut;

    @FXML
    private Button devCBut;

    @FXML
    private Button codeBlocksBut;

    @FXML
    private Button intelliJBut;

    @FXML
    private Button teamsBut;

    @FXML
    private Button andrStudBut;

    @FXML
    void HomeBut(ActionEvent event) {

    }
    @FXML
    void exitButton(ActionEvent event) {
        Stage stage = (Stage) ExitBut.getScene().getWindow();
        stage.close();
    }

    @FXML
    void helpButton(ActionEvent event) {

    }

    @FXML
    void homeButton(ActionEvent event) {

    }
    @FXML
    void openAndroidStudio(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AndroidStudio.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Android Studio");
        stage.show();
    }

    @FXML
    void openCodeBlocks(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CodeBlocks.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Code Blocks");
        stage.show();
    }

    @FXML
    void openDevC(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DevC.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("DevC++");
        stage.show();
    }

    @FXML
    void openEclipse(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Eclipse.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Eclipse");
        stage.show();
    }

    @FXML
    void openIntelliJ(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("IntelliJ.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("IntelliJ");
        stage.show();
    }

    @FXML
    void openJava(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Java.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Java");
        stage.show();
    }

    @FXML
    void openMaven(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Maven.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Maven");
        stage.show();
    }

    @FXML
    void openOffice(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Office.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Office");
        stage.show();
    }

    @FXML
    void openTeams(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Teams.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Teams");
        stage.show();
    }

}
