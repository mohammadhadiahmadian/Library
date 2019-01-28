import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class controllerSource implements Initializable {

    @FXML
    public Button UploadFile;

    @FXML
    public File file;
    @FXML
    public TextField path;


    @FXML
    public void  backButtonclick(){
        SceneManager.getInstance().loadScene("secondPage");
    }



    @FXML
    public void UploadFileClick() {
        FileChooser filechooser = new FileChooser();
        filechooser.setTitle("choose your file");
        Stage s = new Stage();
        file = filechooser.showOpenDialog(s);
        path.setText(file.getAbsolutePath());
        Main.addSource(file);
        Dialog dialog = new Dialog();
        dialog.setContentText("منبع شما با موفقیت ثبت گردید!");
        dialog.showAndWait();
        dialog.close();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }



}

