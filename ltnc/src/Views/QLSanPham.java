/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controllers.LoaiSanPhamController;
import Controllers.SanPhamController;
import Extentions.Check;
import Models.LoaiSanPham;
import Models.SanPham;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author DuyNguyen
 */
public class QLSanPham extends javax.swing.JFrame {

    /**
     * Creates new form QLSanPham
     */
    private List<SanPham> listSanPham;
    private List<LoaiSanPham> listLoaiSanPham;
    private DefaultTableModel modelSP;  //Tạo model cho JTable
    private DefaultComboBoxModel modelLSP;
    int selectedIndex;

    public QLSanPham() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelSP = (DefaultTableModel) TableResultSP.getModel();
        showTableSP();

        listLoaiSanPham = new LoaiSanPhamController().getlistSP();
        modelLSP = new DefaultComboBoxModel();
        for (LoaiSanPham lsp : listLoaiSanPham) {
            modelLSP.addElement(lsp);
        }
        cmbType.setModel(modelLSP);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefesh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableResultSP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý sản phẩm");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Log out.png"))); // NOI18N
        jButton1.setText("THOÁT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Mã sản phẩm:");

        jLabel3.setText("Tên sản phẩm:");

        jLabel4.setText("Loại:");

        jLabel5.setText("Số lượng:");

        jLabel6.setText("Giá:");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefesh.setText("Refesh");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(30, 30, 30)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnRefesh)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefesh)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit)
                    .addComponent(btnAdd))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(32, 32, 32))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(49, 49, 49)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice)
                            .addComponent(txtSoLuong)
                            .addComponent(txtTenSP)
                            .addComponent(txtMaSP)
                            .addComponent(cmbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableResultSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã sản phẩm", "Tên sản phẩm", "Loại", "Số lượng", "Giá"
            }
        ));
        TableResultSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableResultSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableResultSP);
        if (TableResultSP.getColumnModel().getColumnCount() > 0) {
            TableResultSP.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_shopping-bag.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");

        txtFind.setToolTipText("Nhập tên hoặc mã sản phẩm để tìm kiếm\n");

        btnFind.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search.png"))); // NOI18N
        btnFind.setText("Tìm kiếm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFind))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFind)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        var check = new Check();
        if (check.isNullOrEmpty(txtMaSP.getText()) || check.isNullOrEmpty(txtTenSP.getText()) || check.isNullOrEmpty(txtSoLuong.getText()) || check.isNullOrEmpty(txtPrice.getText())) {
            JOptionPane.showMessageDialog(this, "Cần nhập đầy đủ các thông tin cần thiết!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        } else {
            SanPham sp = new SanPham();
            sp.setMaSanPham(txtMaSP.getText());
            sp.setTenSanPham(txtTenSP.getText());
            LoaiSanPham lsp = (LoaiSanPham) cmbType.getSelectedItem();
            sp.setIDLoaiSanPham(lsp.getID());
            sp.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
            if (check.isDigit(txtPrice.getText())) {
                sp.setGia(Integer.parseInt(txtPrice.getText()));
                new SanPhamController().AddSP(sp);
                showTableSP();
                JOptionPane.showMessageDialog(this, "Thêm thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                refesh();
            } else {
                JOptionPane.showMessageDialog(this, "Giá phải là số!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        selectedIndex = TableResultSP.getSelectedRow();
        if (listSanPham.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để sửa!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        } else if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn 1 dòng rồi sửa", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            var check = new Check();
            if (check.isNullOrEmpty(txtMaSP.getText()) || check.isNullOrEmpty(txtTenSP.getText()) || check.isNullOrEmpty(txtSoLuong.getText()) || check.isNullOrEmpty(txtPrice.getText())) {
                JOptionPane.showMessageDialog(this, "Cần nhập đầy đủ các thông tin cần thiết!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            } else {
                SanPham sp = listSanPham.get(selectedIndex);
                sp.setMaSanPham(txtMaSP.getText());
                sp.setTenSanPham(txtTenSP.getText());
                LoaiSanPham lsp = (LoaiSanPham) cmbType.getSelectedItem();
                sp.setIDLoaiSanPham(lsp.getID());
                sp.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
                if (check.isDigit(txtPrice.getText())) {
                    sp.setGia(Integer.parseInt(txtPrice.getText()));
                    new SanPhamController().Update(sp);
                    showTableSP();
                    JOptionPane.showMessageDialog(this, "Sửa thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                    refesh();
                } else {
                    JOptionPane.showMessageDialog(this, "Giá phải là số!", "Lỗi", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        selectedIndex = TableResultSP.getSelectedRow();
        if (listSanPham.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để xóa!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        } else if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn 1 dòng rồi xóa", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            SanPham sp = listSanPham.get(selectedIndex);
            new SanPhamController().DeleteSP(sp.getID());
            JOptionPane.showMessageDialog(this, "Xóa thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            showTableSP();
            refesh();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        // TODO add your handling code here:
        refesh();
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void TableResultSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableResultSPMouseClicked
        // TODO add your handling code here:
        selectedIndex = TableResultSP.getSelectedRow();
        SanPham sp = listSanPham.get(selectedIndex);
        txtMaSP.setText(sp.getMaSanPham());
        txtTenSP.setText(sp.getTenSanPham());

        LoaiSanPham lsp = new LoaiSanPhamController().GetById(sp.getIDLoaiSanPham());
        int index = 0;
        int size = listLoaiSanPham.size();
        for (int i = 0; i < size; i++) {
            if (listLoaiSanPham.get(i).getID() == lsp.getID()) {
                index = i;
            }
        }
        cmbType.setSelectedIndex(index);
        txtSoLuong.setText(sp.getSoLuong() + "");
        txtPrice.setText(sp.getGia() + "");
    }//GEN-LAST:event_TableResultSPMouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String kyTu = txtFind.getText();
        //Phương thức trim() được sử dụng để xóa khoảng trẳng ở đầu và cuối chuỗi
        if (!(kyTu.isBlank())) {
            listSanPham = new SanPhamController().findByChar(kyTu);
            modelSP.setRowCount(0);
            for (SanPham sp : listSanPham) {
                LoaiSanPham lsp = new LoaiSanPhamController().GetById(sp.getIDLoaiSanPham());
                cmbType.setSelectedItem(lsp);
                modelSP.addRow(new Object[]{
                    TableResultSP.getRowCount() + 1,
                    sp.getMaSanPham(),
                    sp.getTenSanPham(),
                    lsp.getTenLoaiSanPham(),
                    sp.getSoLuong(),
                    sp.getGia()
                });
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hãy nhập thông tin cần tìm kiếm!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnFindActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableResultSP;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables

    private void showTableSP() {
        listSanPham = new SanPhamController().getlistSP();
        //Đặt số hàng trong mô hình. Nếu kích thước mới lớn hơn kích thước hiện tại, các hàng mới sẽ được thêm vào cuối mô hình 
        //Nếu kích thước mới nhỏ hơn kích thước hiện tại, tất cả các hàng tại chỉ mục rowCount và lớn hơn sẽ bị loại bỏ .
        //set bảng rỗng để render dữ liệu mới
        modelSP.setRowCount(0);
        //for (kieuDuLieu bienDaiDien : tenMang)
        for (SanPham sp : listSanPham) {
            LoaiSanPham lsp = new LoaiSanPhamController().GetById(sp.getIDLoaiSanPham());
            modelSP.addRow(new Object[]{
                //TableHoadon.getRowCount()+1,hd.getDateOrder(),hd.getThanhTien()
                TableResultSP.getRowCount() + 1, sp.getMaSanPham(), sp.getTenSanPham(), lsp.getTenLoaiSanPham(), sp.getSoLuong(), sp.getGia()
            });
        }
    }

    private void refesh() {
        txtMaSP.setText("");
        txtTenSP.setText("");
        cmbType.setSelectedIndex(0);
        txtSoLuong.setText("");
        txtPrice.setText("");
        txtFind.setText("");
        showTableSP();
    }
}
