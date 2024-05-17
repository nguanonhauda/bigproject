package Code;

public class QLNV {
    private String tenNV; 
    private String sdtNV; 
    private int maNV; 
    private String chucVu; 

    public QLNV(String tenNV, String sdtNV, int maNV, String chucVu) {
        this.tenNV = tenNV;
        this.sdtNV = sdtNV; 
        this.maNV = maNV;
        this.chucVu = chucVu; 
    }

    public String getTenNV() {
        return this.tenNV; 
    }

    public String getSdtNV() {
        return this.sdtNV;
    }

    public int getMaNV() {
        return this.maNV; 
    }

    public String getChucVu() {
        return this.chucVu; 
    }
}