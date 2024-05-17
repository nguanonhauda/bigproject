package Code;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainSceneController {

    @FXML
    private TextField trTitle;

    @FXML
    void btnOKClicked(ActionEvent event) {
        Stage mainWindow = (Stage) trTitle.getScene().getWindow();
        String title = trTitle.getText();
        mainWindow.setTitle(title);
    }

}
