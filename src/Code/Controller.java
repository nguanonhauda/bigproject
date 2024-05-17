package Code;

import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public AnchorPane quanLySanPham;
    public AnchorPane quanLyDonHang;
    public AnchorPane quanLyNhanVien;

    public TableView<QLSP> tableViewQuanLySanPham;
    public TableView<QLNV> tableViewQuanLyNhanVien;
    public TableView<QLDH> tableViewQuanLyDonHang;

    public static ObservableList<QLSP> data = FXCollections.observableArrayList();
    public static ObservableList<QLNV> dataNV = FXCollections.observableArrayList();
    public static ObservableList<QLDH> dataQuanLyDonHang = FXCollections.observableArrayList();

    public TextField tenSP;
    public TextField maSP;
    public TextField soLuongSP;
    public TextField giaSP;

    public TextField tenNV;
    public TextField stdNV;
    public TextField maNV;
    public TextField chuVu;

    public void initialize() {
        tableViewQuanLySanPham.setItems(data);
        tableViewQuanLyNhanVien.setItems(dataNV);
        tableViewQuanLyDonHang.setItems(dataQuanLyDonHang);
    }

    private void show(AnchorPane paneToShow) {
        List<AnchorPane> allPanes = Arrays.asList(quanLySanPham, quanLyNhanVien, quanLyDonHang);
        for (AnchorPane pane : allPanes) {
            pane.setVisible(pane == paneToShow);
        }
    }

    public void quanLySanPham(ActionEvent actionEvent) {
        show(quanLySanPham);
    }

    public void quanLyNhanVien(ActionEvent actionEvent) {
        show(quanLyNhanVien);
    }

    public void quanLyDonHang(ActionEvent actionEvent) {
        show(quanLyDonHang);
    }

    public void addSP(ActionEvent actionEvent) {
        String ten = tenSP.getText();
        int ma = Integer.parseInt(maSP.getText());
        int soLuong = Integer.parseInt(soLuongSP.getText());
        double gia = Double.parseDouble(giaSP.getText());
        data.add(new QLSP(ten, ma, soLuong, gia));
    }
    
    }
