
package Nhadat;

public class giaodichdat extends giaodich {
    private String loaidat;

    public giaodichdat(String loaidat,String magd, String ngay, int dongia, int dientich) {
        super(magd, ngay, dongia, dientich);
        this.loaidat = loaidat;
    }
        public giaodichdat() {
        super();
        this.loaidat = "";
    }

    public String getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }
    
    @Override
    public String toString(){
        String st="";
        st+=super.toString();
        st+=this.loaidat+"\t\t";
        return st;
    }
      
}
