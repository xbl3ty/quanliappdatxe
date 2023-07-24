/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package da1.ui;

import Dao.KhuyenMaiDao;
import Dao.XeDao;
import Dao.chitietchuyenxeDao;
import Dao.nguoidungDao;
import Dao.sql;
import Xe.Car;
import Xe.KhuyenMai;
import Xe.Nguoidung;
import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ui.time;


/**
 *
 * @author BAO
 */
public class DatVe extends javax.swing.JFrame {
    XeDao xd=new XeDao();
            
    time tm = new time();
    String name="";
    String maxe2="";
    String mgg="";
    int gia1=0;
    String qd1="";
    String time1="";
 String vedamua1;
String mave1="";
String mv="";
int sove=0;
   nguoidungDao nddao = new nguoidungDao();
    KhuyenMaiDao daoKM = new KhuyenMaiDao();
    chitietchuyenxeDao ctcxdao = new chitietchuyenxeDao();
    sql sql=new sql();
    /**
     * Creates new form DatVe
     *
     * @param qd
     * @param time
     * @param gia
     * @param magiamgia
     * @param hoten
     * @param maxe
     * @param mave
     * @param vedamua
     * @param sv
     */
    public DatVe(String qd, String time, int gia, String magiamgia, String hoten, String maxe,String mave, String vedamua,int sv) {
        initComponents();
        mv=mave;
        System.out.println(mave);
                System.out.println(maxe);
        setLocationRelativeTo(null);
        nddao.select();
        xd.select();
        daoKM.select();
        vedamua1=vedamua;
        gia1 = gia;
        time1=time;
        sove=sv;
        int t=gia*sove;
        txtGIa.setText(String.valueOf(t));
        txtQd.setText(qd);
        qd1=qd;
        mgg=magiamgia;
        txtTime.setText(time);
        
        name = hoten;
        maxe2 = maxe;
        setThongTinKhachHang();

        soveee.setText("Giường chọn: "+vedamua);
    }

    public List getModel() {
        List list = new ArrayList();
        list.add("NULL");
        list.add(sove);
        list.add(diemdon.getText());
        list.add(diemden.getText());
        list.add(kigui.getText());
        list.add(ccb2.getSelectedItem().toString());
        list.add(magiamgia.getText());
        list.add(searchND(name).get(0).toString());
        list.add(maxe2);
        list.add(txtGIa.getText());
        list.add("0");
        
        return list;

    }

    public void insert() {
        ctcxdao.insert(getModel());
        System.err.println(maxe2);
         List a = (List) searchXE(maxe2);
         System.out.println(a.get(4).toString());
         int b=Integer.parseInt( a.get(4).toString());
                    a.set(4, b-sove);
                    String c=a.get(8).toString()+" "+vedamua1;
                    a.set(8, c);
                    System.err.println(a);
                    sql.SQLupdatedata("xe", a);
                
    }

    public List loadkm(int ran) {
        List<KhuyenMai> listt = new ArrayList<>();
        listt = (List<KhuyenMai>) daoKM.select().get(ran);
        return listt;
    }

    public List searchKM(String uu) {
        for (int i = 0; i < daoKM.size(); i++) {
            if (loadkm(i).get(0).equals(uu)) {
                return loadkm(i);
            }
        }
        return null;
    }
    
    public List loadXE(int ran) {
        List<Car> listt = new ArrayList<>();
        listt = (List<Car>) xd.select().get(ran);
        return listt;
    }

    public List searchXE(String uu) {
        for (int i = 0; i < xd.size(); i++) {
            if (loadXE(i).get(0).equals(uu)) {
                return loadXE(i);
            }
        }
        return null;
    }

    public List searchND(String uu) {
        for (int i = 0; i < nddao.size(); i++) {
            if (loadnguoidung(i).get(0).equals(uu)) {
                return loadnguoidung(i);
            }
        }
        return null;
    }

    public void setThongTinKhachHang() {

        try {

            List nd = searchND(name);
            txtName.setText(nd.get(1).toString());
            txtPhone.setText(nd.get(2).toString());
            txtEmail.setText(nd.get(3).toString());

        } catch (Exception e) {

        }
    }

    public List loadnguoidung(int ran) {
        List<Nguoidung> listt = new ArrayList<>();
        listt = (List<Nguoidung>) nddao.select().get(ran);
        return listt;
    }

    public int checkgiamgia() throws ParseException {
        String magg = magiamgia.getText();
        tm.times(searchKM(magg).get(5).toString(), code);
        if (Integer.parseInt(searchKM(magg).get(3).toString()) == 0) {
            return 0;
        }
        if (code.getText().equals("Đã hết")) {
            return 0;
        }
        return 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtQd = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGIa = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ccb2 = new javax.swing.JComboBox<>();
        diemden = new javax.swing.JTextField();
        magiamgia = new javax.swing.JTextField();
        diemdon = new javax.swing.JTextField();
        kigui = new javax.swing.JTextField();
        code = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        soveee = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin vé");

        jLabel2.setText("Điểm đón");
        jLabel2.setPreferredSize(new java.awt.Dimension(53, 22));

        jLabel3.setText("Thời gian");
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 22));

        jLabel4.setText("Chọn vé");

        jLabel8.setText("Điểm đến");
        jLabel8.setPreferredSize(new java.awt.Dimension(52, 22));

        txtTime.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel13.setText("Quãng đường");
        jLabel13.setPreferredSize(new java.awt.Dimension(74, 22));

        txtQd.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Thông tin khách hàng");

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel18.setText("Điện thoại");
        jLabel18.setPreferredSize(new java.awt.Dimension(55, 22));

        jLabel19.setText("Họ tên");
        jLabel19.setPreferredSize(new java.awt.Dimension(36, 22));

        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel21.setText("Email");
        jLabel21.setPreferredSize(new java.awt.Dimension(30, 22));

        txtPhone.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel23.setForeground(new java.awt.Color(0, 51, 255));
        jLabel23.setText("Chỉnh sửa");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jButton1.setText("Thanh toán");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel25.setText("Giá vé");
        jLabel25.setPreferredSize(new java.awt.Dimension(33, 22));

        jLabel9.setText("Ký gửi");
        jLabel9.setPreferredSize(new java.awt.Dimension(34, 22));

        txtGIa.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel12.setText("Mã giảm giá");
        jLabel12.setPreferredSize(new java.awt.Dimension(52, 22));

        jLabel15.setForeground(new java.awt.Color(0, 51, 255));
        jLabel15.setText("Xác nhận");
        jLabel15.setPreferredSize(new java.awt.Dimension(46, 22));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel5.setText("Phương thức ");

        ccb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banking", "Momo", "Thanh toán khi nhận vé" }));
        ccb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccb2ActionPerformed(evt);
            }
        });

        code.setForeground(new java.awt.Color(153, 0, 51));

        jButton2.setText("Chọn vé");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        soveee.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(magiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtGIa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ccb2, javax.swing.GroupLayout.Alignment.LEADING, 0, 232, Short.MAX_VALUE)))
                                        .addComponent(diemden, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtQd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(diemdon, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(kigui, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(soveee, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                                .addComponent(jLabel23))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(soveee))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(diemdon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diemden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kigui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(magiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ccb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGIa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            insert();
            JOptionPane.showMessageDialog(this, "Đặt vé thành công");
        
        new TaiKhoan(name).setVisible(true);
        }catch(Exception ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ccb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccb2ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if (searchKM(magiamgia.getText()) == null) {
            JOptionPane.showMessageDialog(this, "Không có mã giảm giá này");
        } else try {
            if (checkgiamgia() == 0) {
                JOptionPane.showMessageDialog(this, "Mã giảm giá này đã hết hạn hoặc đã sử dụng hết");
                code.setForeground(Color.RED);
                code.setText("Không thể sử dụng mã khuyến mại này");
            } else {
                code.setForeground(Color.BLUE);
                code.setText("Áp dụng mã khuyến mãi thành công");
     

            }
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this, "Lỗi mã giảm giá");
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        try {
            new DangKyTK(name).setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(DatVe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    new Datcho(qd1,time1,gia1,mgg,name,maxe2,mv).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DatVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatVe("", "", 0, "", "", "","","",0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ccb2;
    private javax.swing.JLabel code;
    private javax.swing.JTextField diemden;
    private javax.swing.JTextField diemdon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kigui;
    private javax.swing.JTextField magiamgia;
    private javax.swing.JLabel soveee;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtGIa;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPhone;
    private javax.swing.JLabel txtQd;
    private javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables
}
