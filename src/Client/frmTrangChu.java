/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;



/**
 *
 * @author DELL
 */
public class frmTrangChu extends javax.swing.JFrame {
    public Config config = new Config();
    private static String idKH;

    /**
     * Creates new form frmTrangChu
     * @param idkh
     */
    public frmTrangChu(String idkh) {
        idKH = idkh;
        initComponents();

    }

    public frmTrangChu() {

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPhim4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVeDaMua = new javax.swing.JButton();
        btnCaNhan = new javax.swing.JButton();
        btnDatVe = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        btnPhim4.setBackground(new java.awt.Color(48, 51, 107));
        btnPhim4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPhim4.setForeground(new java.awt.Color(255, 255, 255));
        btnPhim4.setText("Danh Sách Phim");
        btnPhim4.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Đặt Vé Xem Phim");
        setBackground(new java.awt.Color(19, 15, 64));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(19, 15, 64));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 500));

        jPanel2.setBackground(new java.awt.Color(48, 51, 107));

        jLabel1.setBackground(new java.awt.Color(48, 51, 107));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Đặt Vé Xem Phim");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnVeDaMua.setBackground(new java.awt.Color(48, 51, 107));
        btnVeDaMua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVeDaMua.setForeground(new java.awt.Color(255, 255, 255));
        btnVeDaMua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/movie-ticket.png"))); // NOI18N
        btnVeDaMua.setText("Vé Đã Mua");
        btnVeDaMua.setBorder(null);
        btnVeDaMua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeDaMuaActionPerformed(evt);
            }
        });

        btnCaNhan.setBackground(new java.awt.Color(48, 51, 107));
        btnCaNhan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCaNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnCaNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pirate.png"))); // NOI18N
        btnCaNhan.setText("Cá Nhân");
        btnCaNhan.setBorder(null);
        btnCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaNhanActionPerformed(evt);
            }
        });

        btnDatVe.setBackground(new java.awt.Color(48, 51, 107));
        btnDatVe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDatVe.setForeground(new java.awt.Color(255, 255, 255));
        btnDatVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tickets.png"))); // NOI18N
        btnDatVe.setText("Đặt Vé");
        btnDatVe.setBorder(null);
        btnDatVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatVeActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(48, 51, 107));
        btnDangXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/log-out.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setBorder(null);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Code bởi nhóm 8: Nguyễn Hoàng Kha - Nguyễn Thị Tiểu Lan - Trần Thanh Trúc Nhã (c) 11/2020 - VLUTE      ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDatVe, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVeDaMua, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVeDaMua, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatVe, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        new frmDangNhap().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnDatVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatVeActionPerformed
        frmChonPhim chonPhim = new frmChonPhim(idKH);
        this.setVisible(false);
    }//GEN-LAST:event_btnDatVeActionPerformed

    private void btnVeDaMuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeDaMuaActionPerformed
        frmXemVe xemVe = new frmXemVe(idKH);
        this.setVisible(false);
    }//GEN-LAST:event_btnVeDaMuaActionPerformed

    private void btnCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaNhanActionPerformed
        frmCaNhan caNhan = new frmCaNhan(idKH);
        caNhan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCaNhanActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmTrangChu(idKH).setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaNhan;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDatVe;
    private javax.swing.JButton btnPhim4;
    private javax.swing.JButton btnVeDaMua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
