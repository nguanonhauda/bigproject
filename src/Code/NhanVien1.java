package Code;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class NhanVien1 {
    public TableView<QLNV> tableView ; 
    public static ObservableList<QLNV> data = FXCollections.observableArrayList();
    public TextField maNV ; 
    public TextField tenNV;
    public TextField sdtNV ; 
    public TextField chuVu;
   

    public void initialize(){
        tableView.setItems(data);
    }
    public void addVN(ActionEvent actionEvent ){
        String ten = tenNV.getText();
        String sdt = sdtNV.getText();
        int ma = Integer.parseInt(maNV.getText()); // Chuyển đổi chuỗi sang số nguyên
        String chucVu = chuVu.getText();
    
        data.add(new QLNV(ten, sdt, ma, chucVu));
    }
    public void removeNV(ActionEvent actionEvent){
        QLNV  selectedNV = tableView.getSelectionModel().getSelectedItem();
        if (selectedNV != null) {
            data.remove(selectedNV);
        }
    }
}