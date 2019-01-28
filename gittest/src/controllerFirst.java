
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class controllerFirst implements Initializable {

        @FXML
        public Button welcome;

        @FXML
        private void welcomeclick(ActionEvent event) throws IOException {
            SceneManager.getInstance().loadScene("secondPage");

        }

        @Override
        public void initialize(URL url, ResourceBundle rb) {

        }



    }



