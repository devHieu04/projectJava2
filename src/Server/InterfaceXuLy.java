/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import entity.Ghe;
import entity.Lich;
import entity.Loai;
import entity.Phim;
import entity.Phong;
import entity.Rap;
import entity.TaiKhoan;
import entity.Ve;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface InterfaceXuLy extends Remote {
    //TaiKhoan
    public  boolean DangNhap(String user, String pass) throws RemoteException;
    public int DangKy(String taikhoan, String ten, String matkhau) throws RemoteException;
    public int CapNhat(String taikhoan, String ten, String matkhau) throws RemoteException;
    public TaiKhoan ThongTin(String taikhoan) throws RemoteException;
    
    //Rap
    public List<Rap> DanhSachRap() throws RemoteException;
    public boolean ThemRap() throws RemoteException;
    public boolean XoaRap() throws RemoteException;
    public boolean SuaRap() throws RemoteException;

    //Phong
    public List<Phong> DanhSachPhong() throws RemoteException;
    public boolean ThemPhong() throws RemoteException;
    public boolean XoaPhong() throws RemoteException;
    public boolean SuaPhong() throws RemoteException;

    //Phim
    public List<Phim> DanhSachPhim() throws RemoteException;
    public boolean ThemPhim(Phim p) throws RemoteException;
    public boolean XoaPhim() throws RemoteException;
    public boolean SuaPhim() throws RemoteException;

    //Ghe
    public List<Ghe> DanhSachGhe(int idPhong) throws RemoteException;
    public ArrayList<Integer> DanhSachGheDaDat(int idPhong) throws RemoteException;
    public int soHang(int idPhong) throws RemoteException;
    public int soCot(int idPhong) throws RemoteException;
    
    //Lịch
    public List<Lich> DanhSachLich(int idPhim, int idPhong) throws RemoteException;

    //Vé
    public List<Ve> DanhSachVe(String idKH) throws RemoteException;
    public void DatVe(String idKH, int idLich, int idGhe) throws RemoteException;
    
    //Loại
    public List<Loai> DanhSachTheLoai() throws RemoteException;
    
}