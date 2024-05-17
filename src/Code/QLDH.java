package Code;


public class QLDH {
   private String maSP ; 
   private String tenSP;
   private int soLuong; 
   private double donGia ; 
   private double thanhTien ;

   public QLDH ( String maSP, String tenSP, int soLuong , double donGia ){
    this.maSP = maSP ; 
    this.tenSP = tenSP ; 
    this.soLuong = soLuong ;
    this.donGia = donGia ;
    this.thanhTien = tinhThanhTien(soLuong,donGia);
   }

   public String getMaSP(){
    return maSP ;
   }
   public void setMaSP(String maSP){
    this.maSP = maSP ;
   }
   public String getTenSP(){
    return tenSP ;
   }
   public void setTenSP(String tenSP){
    this.tenSP = tenSP;
   }
   public int getSoLuong(){
    return soLuong ;
   }
   public void setSoLuong(int soLuong){
    this.soLuong = soLuong ;
    this.thanhTien = tinhThanhTien(soLuong, donGia);
   }
   public double getDonGia(){
    return donGia ;
   }
   public void setDonGia(double donGia ){
    this.donGia = donGia ;
    this.thanhTien = tinhThanhTien(soLuong, donGia);
   }
   public double getThanhTien(){
    return thanhTien ; 
   }
   private double tinhThanhTien(int soLuong, double donGia) {
    return soLuong * donGia;
}

}
    