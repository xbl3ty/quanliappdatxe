/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package da1.ui;

import Dao.XeDao;
import Dao.chitietchuyenxeDao;
import Dao.nguoidungDao;
import Dao.sql;
import Xe.Car;
import Xe.Nguoidung;
import Xe.chitietchuyenxe;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ui.time;

/**
 *
 * @author BAO
 */
public class TaiKhoan extends javax.swing.JFrame {

    String nameTK = "";
    String bienso = "";
    chitietchuyenxeDao dao = new chitietchuyenxeDao();
    nguoidungDao nddao = new nguoidungDao();
    XeDao xeDao = new XeDao();
    time tm = new time();
    String thoigian = "";
    sql sql = new sql();
    String maxe = "";
    int tms;

    /**
     * Creates new form TaiKhoan
     */
    public TaiKhoan(String ten) throws ParseException {
        try {
            nddao.select();
            nameTK = ten;

            dao.select();
            xeDao.select();
            initComponents();
            setLocationRelativeTo(null);
            maxe = search(nameTK).get(8).toString();
            System.err.println(maxe);
            try {
                time();
                data();
            } catch (Exception exx) {
                System.err.println(exx);
            }
            loadccb();

        } catch (Exception ex) {
            System.err.println(ex);
        }

    }

    public void data() {
        name.setText("Xin chào: " + searchnd(nameTK).get(1).toString());
        bsx.setText(bienso);
    }

    public int time1() throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date timenew = sf.parse(thoigian);
        Date date = new Date();
        // hơn một ngày cho trả vé bình thường
        if (((date.getMonth() - timenew.getMonth()) * 30) + (date.getDate() - timenew.getDate()) < 0) {
            return 1;
        } else if (date.getDay() - timenew.getDay() == 0) {
            //hơn 6h trả 60% vé
            if (date.getHours() - timenew.getHours() > -6) {
                return 2;
            } else {
                //hơn 2h cho trả 10% vé
                if (date.getHours() - timenew.getHours() > -2) {
                    return 3;
                } else {
                    //dưới 15 phút hiện xe sắp đến chỗ bạnnd
                    if (date.getHours() - timenew.getHours() == 0 && date.getMinutes() - timenew.getMinutes() < -15) {
                        return 4;
                    } else {
                        //xe đg đi đến chỗ bạn 
                        return 5;
                    }
                }
            }

        }
        {

        }
        return 6;
    }

    public void time() throws ParseException {

        thoigian = searchXE(maxe).get(5).toString();
        bienso = searchXE(maxe).get(6).toString();
        tm.times(thoigian, time);
        if (time.getText() == "Đã hết") {
            time.setText("");
            thongtin.setText("Xe đã xuất phát");
        } else if (time1() == 5) {
            thongtin.setText("Xe đang đi tới địa điểm đón bạn");
        } else if (time1() == 4) {
            thongtin.setText("check lại hành lí xe sắp tới chỗ bạn");
        } else {
            thongtin.setText("Xe đang chuẩn bị và đi tới chỗ bạn");
        }
        ;

    }

    public List load(int ran) {
        List<chitietchuyenxe> listt = new ArrayList<>();
        listt = (List<chitietchuyenxe>) dao.select().get(ran);
        return listt;
    }

    public List searche(String uu) {
        List e = new ArrayList();
        for (int i = 0; i < dao.size(); i++) {
            if (load(i).get(7).equals(uu)) {
                e.add(load(i));
            }
        }

        return e;
    }

    public List search(String uu) {

        for (int i = 0; i < dao.size(); i++) {
            if (load(i).get(7).equals(uu)) {
                return load(i);
            }
        }
        return null;
    }

    public List search2(String uu, String maxe) {
        for (int i = 0; i < dao.size(); i++) {
            if (load(i).get(7).equals(uu) && load(i).get(8).equals(maxe)) {
                return load(i);
            }
        }
        return null;
    }

    public List searchXE(String uu) {
        for (int i = 0; i < xeDao.size(); i++) {
            if (loadXE(i).get(0).equals(uu)) {
                return loadXE(i);
            }
        }
        return null;

    }

    public List loadXE(int ran) {
        List<Car> listt = new ArrayList<>();
        listt = (List<Car>) xeDao.select().get(ran);
        return listt;
    }
//    public List searchXEE(String uu){
//        List xe = new ArrayList();
//       for(int i=0;i<xeDao.size();i++){
//           if(loadXE(i).get(0).equals(uu)){
//              xe.add(loadXE(i));
//           }
//       }
//        return xe;
//    
//   }

    public List loadnd(int ran) {
        List<Nguoidung> listt = new ArrayList<>();
        listt = (List<Nguoidung>) nddao.select().get(ran);
        return listt;
    }

    public List searchnd(String uu) {

        for (int i = 0; i < nddao.size(); i++) {
            if (loadnd(i).get(0).equals(uu)) {
                return loadnd(i);
            }
        }
        return null;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        thongtin = new javax.swing.JTextField();
        time = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bsx = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ccb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setBackground(new java.awt.Color(0, 153, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Xin chào ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Online.png"))); // NOI18N
        jButton1.setText("Chỉnh sửa  tài khoản");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Trạng thái vé");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Friends.png"))); // NOI18N
        jButton2.setText("Trung tâm hỗ trợ");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Open door.png"))); // NOI18N
        jButton6.setText(" Đăng xuất ");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gear.png"))); // NOI18N
        jButton7.setText("Cài đặt                                                   ");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setText("Thành viên");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        jButton3.setText("HỦY VÉ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Trạng thái vé");

        jLabel5.setText("Thường");

        time.setText("thời gian");

        jLabel7.setText("Biển số xe");

        bsx.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bsx.setForeground(new java.awt.Color(255, 0, 51));
        bsx.setText("biển số xe");

        jLabel8.setText("Xuất phát sau");

        ccb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ccb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ccbItemStateChanged(evt);
            }
        });
        ccb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ccbMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thongtin)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ccb, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bsx, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(time1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(ccb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bsx, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addComponent(thongtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            List a = (List) search2(nameTK, maxe);
            if (time1() == 1) {
                int t = t = JOptionPane.showConfirmDialog(null, "Nếu bạn hủy vé bây giờ bạn sẽ nhận lại 90% tiền vé", "Hủy vé?", JOptionPane.YES_NO_OPTION);
                if (t == 0) {
                    a.set(10, 9);

                    sql.SQLupdatedata("chitietchuyenxe", a);
                }
            } else if (time1() == 2) {
                int t = t = JOptionPane.showConfirmDialog(null, "Nếu bạn hủy vé bây giờ bạn sẽ nhận lại 50% tiền vé", "Hủy vé?", JOptionPane.YES_NO_OPTION);
                if (t == 0) {
                    a.set(10, 5);

                    sql.SQLupdatedata("chitietchuyenxe", a);
                }
            } else if (time1() == 3) {
                int t = t = JOptionPane.showConfirmDialog(null, "Nếu bạn hủy vé bây giờ bạn sẽ nhận lại 20% tiền vé", "Hủy vé?", JOptionPane.YES_NO_OPTION);
                if (t == 0) {
                    a.set(10, 2);

                    sql.SQLupdatedata("chitietchuyenxe", a);
                }
            } else if (time1() == 6) {
                int t = t = JOptionPane.showConfirmDialog(null, "Bạn đã quá thời gian hủy vé bạn sẽ không nhận được tiền khi hủy vé", "Hủy vé?", JOptionPane.YES_NO_OPTION);
                if (t == 0) {
                    a.set(10, 1);

                    sql.SQLupdatedata("chitietchuyenxe", a);
                }
            } else {
                int t = t = JOptionPane.showConfirmDialog(null, "Bạn đã quá thời gian hủy vé bạn sẽ không nhận được tiền khi hủy vé ", "Hủy vé?", JOptionPane.YES_NO_OPTION);
                if (t == 0) {
                    a.set(10, 1);

                    sql.SQLupdatedata("chitietchuyenxe", a);
                }

            }

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi không thể hủy vé");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ccbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccbMousePressed

    }//GEN-LAST:event_ccbMousePressed

    private void ccbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ccbItemStateChanged
        try {
            maxe = ccb.getSelectedItem().toString();
            tms = 0;
            time();
            data();
            for (int i = 0; i < ccb.getSelectedIndex(); i++) {
                if (ccb.getSelectedItem().toString().equals(ccb.getItemAt(i)));
                tms++;
            }
        } catch (Exception exx) {
            System.err.println(exx);
        }
    }//GEN-LAST:event_ccbItemStateChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new CaiDat(nameTK).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new TrangChao().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new DangKyTK(nameTK).setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void loadccb() {
        ccb.removeAllItems();

        for (int i = 0; i < searche(nameTK).size(); i++) {
            List a = (List) searche(nameTK).get(i);
            ccb.addItem(a.get(8).toString());
        }

    }

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
            java.util.logging.Logger.getLogger(TaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TaiKhoan("nd1").setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bsx;
    private javax.swing.JComboBox<String> ccb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel name;
    private javax.swing.JTextField thongtin;
    private javax.swing.JLabel time;
    private javax.swing.JLabel time1;
    // End of variables declaration//GEN-END:variables
}
