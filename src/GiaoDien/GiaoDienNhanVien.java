/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import ClassDoiTuong.TaiKhoan;
import ChucNang.Client; /*import vào Class Client có chứa các thuộc tính lưu dữ liệu bao gồm danh sách taiKhoan, danh sách thietBi, danh sách baoCao*/

import ClassDoiTuong.ThietBi;
import java.net.Socket;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class GiaoDienNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    ThietBi tb;
    TaiKhoan tk;
    static Socket s;
    DefaultTableModel model;

    public GiaoDienNhanVien() {
        initComponents();
        model = (DefaultTableModel) tbtb.getModel();
        String[] columnNames = {};
        model.setColumnIdentifiers(new Object[]{
            "Mã Thiết Bị", "Tên", "Vị Trí", "Tình Trạng"
        });
        napThongTinThietBi();
    }

    /**
     * Nap danh sach thiet bi vao bang
     */
    public final void napThongTinThietBi() {
        for (ThietBi thietBi : Client.danhSachThietBi) {
            model.addRow(new Object[]{
                thietBi.getId(), thietBi.getTen(), thietBi.getViTri(), thietBi.getTrangThai()
            });
        }
    }

    /* Hàm xử lý sự kiên tìm kiếm */
    public void napThongTinThietBi(String vitri, String trangthai) {
        for (ThietBi thietBi : Client.danhSachThietBi) { /*danhSachThietBi Lấy trực tiếp từ Client*/

            if (vitri.equals(thietBi.getViTri()) && trangthai.equals(thietBi.getTrangThai())) {
                model.addRow(new Object[]{
                    thietBi.getId(), thietBi.getTen(), thietBi.getViTri(), thietBi.getTrangThai()
                });
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtb = new javax.swing.JTable();
        comboBoxTrangThai = new javax.swing.JComboBox<String>();
        comboBoxViTri = new javax.swing.JComboBox<String>();
        btnSearch = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbtb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbtb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbtb.setEditingColumn(25);
        tbtb.setRowHeight(25);
        jScrollPane2.setViewportView(tbtb);

        comboBoxTrangThai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hư hỏng", "Đang sửa", "Tốt" }));
        comboBoxTrangThai.setToolTipText("");

        comboBoxViTri.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tầng 1", "Tầng 2", "Tầng 3" }));

        btnSearch.setText("Tìm Kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReport.setText("Báo cáo lỗi mới");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(comboBoxTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBoxViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(361, 361, 361))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Người Dùng", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Người Dùng");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Xu ly tim kiem (chuc nang nay ko can thiet)
     *
     * @param evt
     */
    /*Tìm Kiếm */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String vitri = (String) comboBoxTrangThai.getSelectedItem();
        String tinhtrang = (String) comboBoxViTri.getSelectedItem();

        /* Clear du lieu bang */
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        napThongTinThietBi(vitri, tinhtrang);
        System.out.print(vitri + " " + tinhtrang);
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * Xu ly button tao bao cao moi
     *
     * @param evt
     */
    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        GiaoDienTaoBaoCao form = new GiaoDienTaoBaoCao();
        form.setVisible(true);
    }//GEN-LAST:event_btnReportActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboBoxTrangThai;
    private javax.swing.JComboBox<String> comboBoxViTri;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbtb;
    // End of variables declaration//GEN-END:variables
}
