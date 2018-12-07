
package Nhadat;

public class giaodich {
    private String magd;
    private String ngay;
    private int dongia;
    private int dientich;

    public giaodich(String magd, String ngay, int dongia, int dientich) {
        this.magd = magd;
        this.ngay = ngay;
        this.dongia = dongia;
        this.dientich = dientich;
    }
    
        public giaodich() {
        this.magd = "";
        this.ngay = "";
        this.dongia = 0;
        this.dientich = 0;
    }
    
    

    public String getMagd() {
        return magd;
    }

    public void setMagd(String magd) {
        this.magd = magd;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getDientich() {
        return dientich;
    }

    public void setDientich(int dientich) {
        this.dientich = dientich;
    }
    
    @Override
    public String toString(){
        String st="";
        st+=this.magd+"\t\t";
        st+=this.ngay+"\t\t";
        st+=this.dongia+"\t\t";
        st+=this.dientich+"\t\t";
        return st;
    }
    
}
