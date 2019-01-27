import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class controllerSource implements Initializable {

    @FXML
    public Button sync;
    @FXML
    public RadioButton Book;
    @FXML
    public RadioButton Magazine;
    @FXML
    public RadioButton Thesis;
    @FXML
    public TextField SourceName;

    @FXML
    public void  backButtonclick(){
        SceneManager.getInstance().loadScene("secondPage");
    }


    @FXML
    private void syncClick(ActionEvent event) throws IOException {
        //SceneManager.getInstance().loadScene("sourcePage");
        Dialog dialog = new Dialog();
        dialog.setContentText("منبع شما با موفقیت ثبت گردید!");
        dialog.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }



}

