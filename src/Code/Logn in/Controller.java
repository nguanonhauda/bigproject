
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.scene.control.CheckBox;
import java.time.LocalDate;



public class Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

   
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField name;
    @FXML
    private DatePicker birthDate;
    @FXML
    private CheckBox maleCheckbox;
    @FXML
    private CheckBox femaleCheckbox;
    @FXML
    private TextField address;
    @FXML
    private TextField idCard;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private PasswordField confirmPassword;

    @FXML // Truy cập vào giao diện đăng nhập
    public void Enter(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Login/EmployeeLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML // Thoát khỏi giao diện đăng nhập
    public void Exit(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Login/login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML 
    public void LoginRequirement(ActionEvent event) throws IOException {
    String username = usernameField.getText();
    String password = passwordField.getText();

    if (validateUser(username, password)) {
        // Thao tác khi người dùng xác thực thành công
        root = FXMLLoader.load(getClass().getResource("/giaodien/giaodien.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } else {
        // Thao tác khi người dùng xác thực thất bại
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Tài khoản hoặc mật khẩu không chính xác!");
        alert.showAndWait();
    }
}

private boolean validateUser(String username, String password) {
    // Thực hiện kiểm tra xác thực người dùng
    // Trả về true nếu xác thực thành công, ngược lại trả về false
    // Ví dụ: Kiểm tra trong cơ sở dữ liệu hoặc file cấu hình
    return username.equals("admin") && password.equals("123456");
}
    @FXML // Sau khi đăng nhập thành công, truy cập vào phần mềm chính
    public void SceneLogin(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        if (username.equals("admin") && password.equals("123456")) {
            root = FXMLLoader.load(getClass().getResource("/giaodien/giaodien.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show(); 
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Tài khoản hoặc mật khẩu không chính xác!");
        alert.showAndWait();
        }
    }
    
    @FXML // Trở về trang chủ chính.
    public void ExitSceneLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Login/Login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML // Truy cập vào giao diện đăng kí
    public void EnterSignIn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Login/SignUp.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML // Thoát giao diện đăng kí
    public void ExitSignIn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Login/login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void Register(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        UserFileHandler.saveUser(username, password); 
    }

    @FXML
    public void SignUpSave(ActionEvent event) {
        String fullName = name.getText();
        LocalDate birth = birthDate.getValue();
        String gender = maleCheckbox.isSelected() ? "Nam" : "Nữ";
        String addr = address.getText();
        String id = idCard.getText();
        String user = username.getText();
        String pass = password.getText();
        String confirmPass = confirmPassword.getText();

        // Kiểm tra xem thông tin đã nhập đầy đủ chưa
        if (fullName.isEmpty() || birth == null || (!maleCheckbox.isSelected() && !femaleCheckbox.isSelected()) || addr.isEmpty() || id.isEmpty() || user.isEmpty() || pass.isEmpty() || confirmPass.isEmpty()) {

            return;
        }

        // Kiểm tra mật khẩu và xác nhận mật khẩu
        if (!pass.equals(confirmPass)) {
            return;
        }
        
        // Kiểm tra giới tính
        if (maleCheckbox.isSelected()) {
            gender = "Nam";
        } else if (femaleCheckbox.isSelected()) {
            gender = "Nữ";
        } else {
            
            return;
        }

        // Lưu thông tin đăng ký vào tệp tin hoặc cơ sở dữ liệu
        UserFileHandler.saveUser(fullName, birth, gender, addr, id, user, pass);
    }
}




