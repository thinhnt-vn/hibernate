package entities;
// Generated Jul 29, 2017 11:37:41 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Hoadon generated by hbm2java
 */
public class Hoadon  implements java.io.Serializable {


     private int mahd;
     private Bophan bophan;
     private int sodien;
     private int giatien;
     private int thang;
     private Date ngaythu;

    public Hoadon() {
    }

    public Hoadon(int mahd, Bophan bophan, int sodien, int giatien, int thang, Date ngaythu) {
       this.mahd = mahd;
       this.bophan = bophan;
       this.sodien = sodien;
       this.giatien = giatien;
       this.thang = thang;
       this.ngaythu = ngaythu;
    }
   
    public int getMahd() {
        return this.mahd;
    }
    
    public void setMahd(int mahd) {
        this.mahd = mahd;
    }
    public Bophan getBophan() {
        return this.bophan;
    }
    
    public void setBophan(Bophan bophan) {
        this.bophan = bophan;
    }
    public int getSodien() {
        return this.sodien;
    }
    
    public void setSodien(int sodien) {
        this.sodien = sodien;
    }
    public int getGiatien() {
        return this.giatien;
    }
    
    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }
    public int getThang() {
        return this.thang;
    }
    
    public void setThang(int thang) {
        this.thang = thang;
    }
    public Date getNgaythu() {
        return this.ngaythu;
    }
    
    public void setNgaythu(Date ngaythu) {
        this.ngaythu = ngaythu;
    }




}

