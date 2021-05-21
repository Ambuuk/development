package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.application.HostServices;
import javafx.stage.Stage;

public class javaController extends Application{

    @FXML
    private Button JdkDownload;

    @FXML
    private Button JreDownload;

    @FXML
    private Button installationGuide;

    @FXML
    void downloadJdk(ActionEvent event) {
        getHostServices().showDocument("https://www.oracle.com/java/technologies/javase-jdk16-downloads.html");
    }

    @FXML
    void downloadJre(ActionEvent event) {
        getHostServices().showDocument("https://www.java.com/en/download/");
    }

    @FXML
    void javaInstallGuide(ActionEvent event){
    getHostServices().showDocument("https://youtu.be/DIx7ZSQG76g");
    }

    @FXML
    private Button MavenDownload;

    @FXML
    void downloadMaven(ActionEvent event) {
        getHostServices().showDocument("https://maven.apache.org/download.cgi");
    }

    @FXML
    private Button EclipseDownload;

    @FXML
    void downloadEclipse(ActionEvent event) {
        getHostServices().showDocument("https://www.eclipse.org/downloads/");
    }

    @FXML
    private Button DevcDownload;

    @FXML
    void downloadDevc(ActionEvent event) {
        getHostServices().showDocument("https://sourceforge.net/projects/orwelldevcpp/");
    }

    @FXML
    private Button CodeBlocksDownload;

    @FXML
    void downloadCodeBlocks(ActionEvent event) {
        getHostServices().showDocument("https://sourceforge.net/projects/codeblocks/");
    }

    @FXML
    private Button IntellijDownload;

    @FXML
    void downloadIntellij(ActionEvent event) {
        getHostServices().showDocument("https://www.jetbrains.com/idea/download/#section=windows");
    }
    @FXML
    private Button TeamsDownload;

    @FXML
    void downloadTeams(ActionEvent event) {
        getHostServices().showDocument("https://www.microsoft.com/en-us/microsoft-teams/download-app#desktopAppDownloadregion");
    }

    @FXML
    private Button AndroidDownload;

    @FXML
    void downloadAndroidStudio(ActionEvent event) {
        getHostServices().showDocument("https://developer.android.com/studio");
    }

    @FXML
    private Button OfficeDownload;

    @FXML
    void downloadOffice(ActionEvent event) {
        getHostServices().showDocument("https://drive.google.com/file/d/1TeVrSd4ak4HAFq7bNxAWyPKnqarD7oh9/view");
    }
    @FXML

    @Override
    public void start(Stage stage) throws Exception {

    }
}
