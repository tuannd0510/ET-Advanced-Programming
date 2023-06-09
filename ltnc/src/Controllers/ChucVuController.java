/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Config.ConnectDB;
import Models.ChucVu;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author DuyNguyen
 */
public class ChucVuController {
    ConnectDB conn1 = new ConnectDB();

    public ChucVuController() {
        conn1.getConnection();
    }

    public ArrayList<ChucVu> getlistCV() {
        ArrayList<ChucVu> list = new ArrayList<>();
        String sql = "SELECT * FROM ltnc_add.chucvu";
        try {
            //PreparedStatement trong java là một sub-interface của Statement. Nó được sử dụng để thực hiện truy vấn tham số.
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            //Đối tượng của ResultSet duy trì một con trỏ trỏ đến một hàng của một bảng. Ban đầu, con trỏ trỏ đến hàng đầu tiên.
            //ResultSet executeQuery (String SQL): Trả về một đối tượng ResultSet khi bạn thực thi câu lệnh SELECT.
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVu cv = new ChucVu();
                cv.setID(rs.getInt("ID"));
                cv.setTenChucVu(rs.getString("TenChucVu"));
                list.add(cv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ChucVu GetById(int id) {
        ChucVu cv = new ChucVu();
        String sql = "SELECT * FROM ltnc_add.chucvu WHERE ID = ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cv.setID(rs.getInt("ID"));
                cv.setTenChucVu(rs.getString("TenChucVu"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cv;
    }

    public void Add(ChucVu cv) {
        String sql = "INSERT INTO ltnc_add.chucvu(TenChucVu)  VALUES (?)";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            //setString(int paramIndex, String value)->đặt giá trị String cho chỉ số tham số đã cho.
            ps.setString(1, cv.getTenChucVu());
            //executeUpdate: thực hiện truy vấn. Nó được sử dụng để create, drop, insert, update, delete, vv.
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Delete(int id) {
        String sql = "DELETE FROM ltnc_add.chucvu WHERE ID = ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Update(ChucVu cv) {
        String sql = "UPDATE ltnc_add.chucvu SET TenChucVu = ? WHERE ID = ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            //setString(int paramIndex, String value)->đặt giá trị String cho chỉ số tham số đã cho.
            ps.setString(1, cv.getTenChucVu());
            ps.setInt(2, cv.getID());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ChucVu> findByChar(String kyTu) {
        ArrayList<ChucVu> list = new ArrayList<>();
        String sql = "SELECT * FROM ltnc_add.chucvu WHERE TenChucVu like ? OR MaLoaiSanPham like ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + kyTu + "%");
            ps.setString(2, "%" + kyTu + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVu lsp = new ChucVu();
                lsp.setID(rs.getInt("ID"));
                lsp.setTenChucVu(rs.getString("TenChucVu"));
                list.add(lsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        new LoaiSanPhamController();
    }
}
