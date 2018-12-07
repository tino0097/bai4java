
package Nhadat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Quanly {
    ArrayList<giaodichdat> listgdd=new ArrayList();
    ArrayList<giaodichnha> listgdn=new ArrayList();
    Scanner sc =new Scanner(System.in);
    
    public giaodichdat Giaodichdat(){
        String magd=sc.nextLine();
        String ngay=sc.nextLine();
        int dongia=sc.nextInt();
        sc.nextLine();
        String loaidat=sc.nextLine();
        int dientich =sc.nextInt();
        
        giaodichdat gdd=new giaodichdat( loaidat, magd, ngay,  dongia,  dientich);
        return gdd;
    }
    
    public void nhapgdd(){
        String traloi;
        do{
            this.listgdd.add(this.Giaodichdat());
            System.out.println("MOI BAN NHAP TIEP");
            traloi=sc.next();
        }while(traloi.equals("c"));
    }

    
    public giaodichnha Giaodichnha(){
        String magd=sc.nextLine();
        String ngay=sc.nextLine();
        int dongia=sc.nextInt();
        sc.nextLine();
        String loainha=sc.next();
        int dientich =sc.nextInt();
        sc.nextLine();
        String diachi=sc.next();
        
        giaodichnha gdn=new giaodichnha(loainha, diachi,magd,  ngay, dongia, dientich);
        return gdn;
    }
    
    public void nhapgdn(){
        String traloi;
        do{
            this.listgdn.add(this.Giaodichnha());
            System.out.println("MOI BAN NHAP TIEP");
            traloi=sc.next();
        }while(traloi.equals("c"));
    }

public double tbthanhtien(){
    double b;
    double a;
    int c=0;
    double d=0;
    for(int i=0;i<listgdd.size();i++){
        if("b".equals(listgdd.get(i).getLoaidat())||"c".equals(listgdd.get(i).getLoaidat())){
          a=listgdd.get(i).getDientich()*listgdd.get(i).getDongia();
          c+=a;
        }
        else if("a".equals(listgdd.get(i).getLoaidat())){
        b=listgdd.get(i).getDientich()*listgdd.get(i).getDongia()*15;
        d+=(double) b/10;
        }
        else
            return 0;
    }
    return (double)(c+d)/listgdd.size();
}

public  void giaodichnhadatthang9(){
    SimpleDateFormat sp=new SimpleDateFormat("MM-yyyy");
    Calendar cal= Calendar.getInstance();
    Date date1;
    Date date2;
    
   for(int i=0;i<listgdd.size();i++){
    
     try {
         String ngaynhap="09-2013";
         String ngaygdd=listgdd.get(i).getNgay();
            date1=sp.parse(ngaygdd);
            date2=sp.parse(ngaynhap);
            long get=date1.compareTo(date2);
            
            if(get==0)
            {
                System.out.println(listgdd.get(i).toString());
            }
      } catch (Exception e){      
    }  
   } 
}


public void soluongnd(){
    int b=0;
    int count=0;

    for(int i=0;i<listgdd.size();i++)
        {
            if("b".equals(listgdd.get(i).getLoaidat())||"c".equals(listgdd.get(i).getLoaidat()))
            {
                count++;
                count=count-(count-1);
                b+=count;
                
            }
        }
    System.out.println("TONG SO GIAO DICH LOAI B VA C: "+b);
    }

public void soluongnda(){
    int b=0;
     int count=0; 
    for(int i=1;i<listgdd.size();i++)
        {
            if("a".equals(listgdd.get(i).getLoaidat()))
            {
                count++;
                count=count-(count-1);
                b+=count;
            }
        }
    System.out.println("TONG SO GIAO DICH LOAI A: "+b);
    }


public void thanhtiengdn(){
    double b;
    double a=0;
    double d=0;
    for(int i=0;i<listgdn.size();i++){
        if("caocap".equals(listgdn.get(i).getLoainha())){
        a=listgdd.get(i).getDientich()*listgdn.get(i).getDongia();
        }
        else if("thuong".equals(listgdn.get(i).getLoainha())){
        b=listgdn.get(i).getDientich()*listgdn.get(i).getDongia()*90;
        d=(double)b/100;
        }
        else
            System.out.println("");
                    
    }
    System.out.println("TIEN NHA CAO CAP:"+a);
    System.out.println("TIEN NHA THUONG:"+d);
}


public void soluonggdncc(){
    int b=0;
     int count=0; 
    for(int i=1;i<listgdn.size();i++)
        {
            if("caocap".equals(listgdn.get(i).getLoainha()))
            {
                count++;
                count=count-(count-1);
                b+=count;
            }
        }
    System.out.println("TONG SO GIAO DICH NHA CAO CAP: "+b);
    }

public void soluonggdnt(){
    int b=0;
     int count=0; 
    for(int i=1;i<listgdn.size();i++)
        {
            if("thuong".equals(listgdn.get(i).getLoainha()))
            {
                count++;
                count=count-(count-1);
                b+=count;
            }
        }
    System.out.println("TONG SO GIAO DICH NH THUONG: "+b);
    }

}