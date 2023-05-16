/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Phong  implements Serializable{
    private int idPhong;
    private String tenPhong;
    private int idRap;

    public Phong() {
    }

    public Phong(int idPhong, String tenPhong, int idRap) {
        this.idPhong = idPhong;
        this.tenPhong = tenPhong;
        this.idRap = idRap;
    }

    public int getIdPhong() {
        return idPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public int getIdRap() {
        return idRap;
    }

    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setIdRap(int idRap) {
        this.idRap = idRap;
    }

}
