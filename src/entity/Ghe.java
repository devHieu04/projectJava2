/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

// /**
//  *
//  * @author DELL
//  */
public class Ghe implements Serializable{
    private int idGhe;
    private String tenGhe;
    private int hang;
    private int cot;
    private int idPhong;

    public Ghe() {
    }

    public Ghe(int idGhe, String tenGhe, int hang, int cot, int idPhong) {
        this.idGhe = idGhe;
        this.tenGhe = tenGhe;
        this.hang = hang;
        this.cot = cot;
        this.idPhong = idPhong;
    }

    public int getIdGhe() {
        return idGhe;
    }

    public String getTenGhe() {
        return tenGhe;
    }

    public int getHang() {
        return hang;
    }

    public int getCot() {
        return cot;
    }

    public int getIdPhong() {
        return idPhong;
    }

    public void setIdGhe(int idGhe) {
        this.idGhe = idGhe;
    }

    public void setTenGhe(String tenGhe) {
        this.tenGhe = tenGhe;
    }

    public void setHang(int hang) {
        this.hang = hang;
    }

    public void setCot(int cot) {
        this.cot = cot;
    }

    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }


}

