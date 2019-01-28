import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class controllerSecond implements Initializable {

    @FXML
    public Button createSource;
    @FXML
    public Button createMember;
    @FXML
    public Button lendingRegistration;
    @FXML
    public Button registerBack;
    @FXML
    public Button search;
    @FXML
    public Button viewViolations;

    @FXML
    private void createSourceclick(ActionEvent event) throws IOException {
        SceneManager.getInstance().loadScene("sourcePage");
    }
    @FXML
    private void createMemberclick(ActionEvent event) throws IOException {
        SceneManager.getInstance().loadScene("memberPage");
    }
    @FXML
    private void lendingRegistrationclick(ActionEvent event) throws IOException {
        SceneManager.getInstance().loadScene("lendingRegistrationPage");
    }
    @FXML
    private void registerBackclick(ActionEvent event) throws IOException {
        SceneManager.getInstance().loadScene("registerBackPage");
    }
    @FXML
    private void searchclick(ActionEvent event) throws IOException {
        SceneManager.getInstance().loadScene("searchPage");
    }
    @FXML
    private void viewViolationsclick(ActionEvent event) throws IOException {
        SceneManager.getInstance().loadScene("violationsPage");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }



}
