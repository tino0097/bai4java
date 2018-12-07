
package Nhadat;
public class giaodichnha extends giaodich{
    private String loainha;
    private String diachi;

    public giaodichnha(String loainha, String diachi,String magd, String ngay, int dongia, int dientich) {
        super(magd, ngay, dongia, dientich);
        this.loainha = loainha;
        this.diachi = diachi;
    }
    public giaodichnha() {
        super();
        this.loainha = "";
        this.diachi = "";
    }
    public String getLoainha() {
        return loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }

    public String getDiaachi() {
        return diachi;
    }

    public void setDiaachi(String diaachi) {
        this.diachi = diaachi;
    }


    @Override
    public String toString(){
        String st="";
        st+=super.toString();
        st+=this.loainha+"\t\t";
        st+=this.diachi+"\t\t";
        return st;
    }
      
}
