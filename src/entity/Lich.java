/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

///**
// *
// * @author DELL
// */
public class Lich  implements Serializable{
    private int idLich;
    private String ngay;
    private String gio;
    private int giaVe;
    private int idPhong;

    public Lich() {
    }

    public Lich(int idLich, String ngay, String gio, int giaVe, int idPhong) {
        this.idLich = idLich;
        this.ngay = ngay;
        this.gio = gio;
        this.giaVe = giaVe;
        this.idPhong = idPhong;
    }

    public int getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }

    public int getIdLich() {
        return idLich;
    }

    public void setIdLich(int idLich) {
        this.idLich = idLich;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }


}
