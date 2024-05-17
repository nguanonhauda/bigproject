package Code;

public class QLSP {
    private String tenSP; 
    private int maSP;     
    private int soLuongSP; 
    private double giaSP; 

    public QLSP(String tenSP, int maSP, int soLuongSP, double giaSP) { 
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.soLuongSP = soLuongSP;
        this.giaSP = giaSP;
    }

    public String getTenSP() { 
        return this.tenSP;
    }

    public int getMaSP() { 
        return this.maSP;
    }

    public int getSoLuongSP() { 
        return this.soLuongSP;
    }

    public double getGiaSp() { 
        return this.giaSP;
    }

    
}