/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package da1.ui;

import Dao.KhuyenMaiDao;
import Dao.XeDao;
import Dao.chitietchuyenxeDao;
import Dao.nguoidungDao;
import Xe.Car;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import ui.time;

/**
 *
 * @author BAO
 */
public class Datcho extends javax.swing.JFrame {
String vedamua="";
//String qd, String time, int gia, String magiamgia, String hoten, String maxe,String ve
    XeDao daoXe = new XeDao();
    String qd1="";
    String time1="";
    int gia1=0;
    String mmg="";
    String hoten1="";
    String ve1="";
    String name="";
    String maxe1="";
    String maxeee="";
String o="";
int sove=0;
    /**
    /**
     * Creates new form DatCho
     *
     * @param uu
     * @param ve
     * @return 
     */
    public List search(String uu) {
        for (int i = 0; i < daoXe.size(); i++) {
            if (loadx(i).get(0).equals(uu)) {
                return loadx(i);
            }
        }
        return null;

    }

    public List loadx(int ran) {
        List<Car> listt = new ArrayList<>();
        listt = (List<Car>) daoXe.select().get(ran);
        return listt;
    }

    public Datcho(String qd, String time, int gia, String magiamgia, String hoten, String maxe,String mave) {
        
       initComponents();
       setLocationRelativeTo(null);
       qd1=qd;
        time1=time;
        gia1=gia;
        mmg=magiamgia;
        hoten1=hoten;
        maxeee=maxe;
        daoXe.select();
        maxe1=mave;
        loadccb();
         
        
        
       
    }

    public void loadccb() {
        List xe = search(maxe1);
        String xedadat = xe.get(8).toString();
        String f ="";
        for (int i = 0; i < xedadat.length(); i++) {
            if (xedadat.charAt(i) == ' ') {
                f="";
                continue;
            } else {
                        f+= xedadat.charAt(i);
                int g=Integer.parseInt(f);
                if(i!=xedadat.length()-1){
                     if(xedadat.charAt(i+1)!=' '){
                    continue;
                }
                }
               
                switch (g) {
                    case 1 -> {
                        n1.setSelected(true);
                        n1.setEnabled(false);n1.setForeground(Color.red);
                        break;
                    }
                    case 2 -> {
                        n2.setSelected(true);
                        n2.setEnabled(false);n2.setForeground(Color.red);
                        break;
                    }
                    case 3 -> {
                        n3.setSelected(true);
                        n3.setEnabled(false);n3.setForeground(Color.red);
                        break;
                    }
                    case 4 -> {
                        n4.setSelected(true);
                        n4.setEnabled(false);n4.setForeground(Color.red);
                        break;
                    }
                    case 5 -> {
                        n5.setSelected(true);
                        n5.setEnabled(false);n5.setForeground(Color.red);
                        break;
                    }
                    case 6 -> {
                        n6.setSelected(true);
                        n6.setEnabled(false);n6.setForeground(Color.red);
                        break;
                    }
                    case 7 -> {
                        n7.setSelected(true);
                        n7.setEnabled(false);n7.setForeground(Color.red);
                        break;
                    }
                    case 8 -> {
                        n8.setSelected(true);
                        n8.setEnabled(false);n8.setForeground(Color.red);
                        
                        break;
                    }
                    case 9 -> {
                        n9.setSelected(true);
                        n9.setEnabled(false);n9.setForeground(Color.red);
                        
                        break;
                    }
                    case 10 -> {
                        n10.setSelected(true);
                        n10.setEnabled(false);n10.setForeground(Color.red);
                        break;
                    }
                    case 11 -> {
                        n11.setSelected(true);
                        n11.setEnabled(false);n11.setForeground(Color.red);
                        break;
                    }
                    case 12 -> {
                        n12.setSelected(true);
                        n12.setEnabled(false);n12.setForeground(Color.red);
                        break;
                    }
                    case 13 -> {
                        n13.setSelected(true);
                        n13.setEnabled(false);n13.setForeground(Color.red);
                        break;
                    }
                    case 14 -> {
                        n14.setSelected(true);
                        n14.setEnabled(false);n14.setForeground(Color.red);
                        break;
                    }
                    case 15 -> {
                        n15.setSelected(true);
                        n15.setEnabled(false);n15.setForeground(Color.red);
                        break;
                    }
                    case 16 -> {
                        n16.setSelected(true);
                        n16.setEnabled(false);n16.setForeground(Color.red);
                        break;
                    }
                    case 17 -> {
                        n17.setSelected(true);
                        n17.setEnabled(false);n17.setForeground(Color.red);
                        break;
                    }
                    case 18 -> {
                        n18.setSelected(true);
                        n18.setEnabled(false);n18.setForeground(Color.red);
                        break;
                    }
                    case 19 -> {
                        n19.setSelected(true);
                        n19.setEnabled(false);n19.setForeground(Color.red);
                        break;
                    }
                    case 20 -> {
                        n20.setSelected(true);
                        n20.setEnabled(false);n20.setForeground(Color.red);
                        break;
                    }
                    case 21 -> {
                        n21.setSelected(true);
                        n21.setEnabled(false);n21.setForeground(Color.red);
                        break;
                    }
                    case 22 -> {
                        n22.setSelected(true);
                        n22.setEnabled(false);n22.setForeground(Color.red);
                        break;
                    }
                    case 23 -> {
                        n23.setSelected(true);
                        n23.setEnabled(false);n23.setForeground(Color.red);
                        break;
                    }
                    case 24 -> {
                        n24.setSelected(true);
                        n24.setEnabled(false);n24.setForeground(Color.red);
                        break;
                    }
                    default -> {
                            break;
                    }
                    
                }
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

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        n1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        n2 = new javax.swing.JCheckBox();
        n3 = new javax.swing.JCheckBox();
        n4 = new javax.swing.JCheckBox();
        n5 = new javax.swing.JCheckBox();
        n6 = new javax.swing.JCheckBox();
        n7 = new javax.swing.JCheckBox();
        n8 = new javax.swing.JCheckBox();
        n9 = new javax.swing.JCheckBox();
        n10 = new javax.swing.JCheckBox();
        n11 = new javax.swing.JCheckBox();
        n12 = new javax.swing.JCheckBox();
        n13 = new javax.swing.JCheckBox();
        n14 = new javax.swing.JCheckBox();
        n15 = new javax.swing.JCheckBox();
        n16 = new javax.swing.JCheckBox();
        n17 = new javax.swing.JCheckBox();
        n18 = new javax.swing.JCheckBox();
        n19 = new javax.swing.JCheckBox();
        n20 = new javax.swing.JCheckBox();
        n21 = new javax.swing.JCheckBox();
        n22 = new javax.swing.JCheckBox();
        n23 = new javax.swing.JCheckBox();
        n24 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setBackground(new java.awt.Color(0, 153, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   Đặt chỗ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Giảm ngay 50% từ 12:00 ngày 25/11/2022");
        jLabel1.setPreferredSize(new java.awt.Dimension(244, 22));

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(20, 20));
        jPanel1.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51)));
        jPanel2.setForeground(new java.awt.Color(0, 204, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(20, 20));
        jPanel2.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setText("Còn chỗ");

        jLabel4.setText("Hết chỗ");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        n1.setText("n1");
        n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n1MouseClicked(evt);
            }
        });
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel7.setText("Tài xế");

        n2.setText("n2");
        n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n2MouseClicked(evt);
            }
        });
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n3.setText("n3");
        n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n3MousePressed(evt);
            }
        });
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        n4.setText("n4");
        n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n4MouseClicked(evt);
            }
        });

        n5.setText("n5");
        n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n5MouseClicked(evt);
            }
        });

        n6.setText("n6");
        n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n6MouseClicked(evt);
            }
        });

        n7.setText("n7");
        n7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n7MouseClicked(evt);
            }
        });

        n8.setText("n8");
        n8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n8MouseClicked(evt);
            }
        });

        n9.setText("n9");
        n9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n9MouseClicked(evt);
            }
        });

        n10.setText("n10");
        n10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n10MouseClicked(evt);
            }
        });

        n11.setText("n11");
        n11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n11MouseClicked(evt);
            }
        });

        n12.setText("n12");
        n12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n12MouseClicked(evt);
            }
        });

        n13.setText("n13");
        n13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n13MouseClicked(evt);
            }
        });
        n13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n13ActionPerformed(evt);
            }
        });

        n14.setText("n14");
        n14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n14MouseClicked(evt);
            }
        });

        n15.setText("n15");
        n15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n15MouseClicked(evt);
            }
        });

        n16.setText("n16");
        n16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n16MouseClicked(evt);
            }
        });

        n17.setText("n17");
        n17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n17MouseClicked(evt);
            }
        });

        n18.setText("n18");
        n18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n18MouseClicked(evt);
            }
        });

        n19.setText("n19");
        n19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n19MouseClicked(evt);
            }
        });

        n20.setText("n20");
        n20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n20MouseClicked(evt);
            }
        });

        n21.setText("n21");
        n21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n21MouseClicked(evt);
            }
        });

        n22.setText("n22");
        n22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n22MouseClicked(evt);
            }
        });

        n23.setText("n23");
        n23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n23MouseClicked(evt);
            }
        });

        n24.setText("n24");
        n24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n22, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n13, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(n4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(n1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(n10, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(n23, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(n24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(n11)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(n12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(n14, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(n15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(n17, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(n18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(n20, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(n21, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addComponent(n16, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {n1, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n2, n20, n21, n22, n23, n24, n3, n4, n5, n6, n7, n8, n9});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(n1)
                        .addGap(22, 22, 22)
                        .addComponent(n4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(n2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(n5)
                            .addComponent(n6))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(n9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(n8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(n10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(n13))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(n14)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(n16)
                                .addGap(18, 18, 18)
                                .addComponent(n19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(n18)
                                    .addComponent(n17))
                                .addGap(18, 18, 18)
                                .addComponent(n20))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n12)
                            .addComponent(n11))
                        .addGap(18, 18, 18)
                        .addComponent(n15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(n21)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n22)
                    .addComponent(n23)
                    .addComponent(n24))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {n1, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n2, n20, n21, n22, n23, n24, n3, n4, n5, n6, n7, n8, n9});

        jButton1.setText("Xong");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(106, 106, 106))))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n3MouseClicked

        if(n3.isSelected()){
            xoachu("3",1);
          sove++;
        }else{
             xoachu("3",0); 
             sove--;
        }
    }//GEN-LAST:event_n3MouseClicked

    private void n2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n2MouseClicked
              if(n2.isSelected()){
            xoachu("2",1);
          sove++;
        }else{
             xoachu("2",0); 
             sove--;
        }
    }//GEN-LAST:event_n2MouseClicked

    private void n1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseClicked
              if(n1.isSelected()){
            xoachu("1",1);
          sove++;
        }else{
             xoachu("1",0); 
             sove--;
        }
    }//GEN-LAST:event_n1MouseClicked

    private void n4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n4MouseClicked
            if(n4.isSelected()){
            xoachu("4",1);
          sove++;
        }else{
             xoachu("4",0); ;
             sove--;
        }
    }//GEN-LAST:event_n4MouseClicked

    private void n5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n5MouseClicked
            if(n5.isSelected()){
            xoachu("5",1);
          sove++;
        }else{
             xoachu("5",0); ;
             sove--;
        }
    }//GEN-LAST:event_n5MouseClicked

    private void n6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n6MouseClicked
            if(n6.isSelected()){
            xoachu("6",1);
          sove++;
        }else{
             xoachu("6",0); 
             sove--;
        }
    }//GEN-LAST:event_n6MouseClicked

    private void n7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n7MouseClicked
            if(n7.isSelected()){
            xoachu("7",1);
          sove++;
        }else{
             xoachu("7",0); ;
             sove--;
        }
    }//GEN-LAST:event_n7MouseClicked

    private void n8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n8MouseClicked
            if(n8.isSelected()){
            xoachu("8",1);
          sove++;
        }else{
             xoachu("8",0); ;
             sove--;
        }
    }//GEN-LAST:event_n8MouseClicked

    private void n10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n10MouseClicked
            if(n10.isSelected()){
            xoachu("10",1);
          sove++;
        }else{
             xoachu("10",0); ;
             sove--;
        }
    }//GEN-LAST:event_n10MouseClicked

    private void n11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n11MouseClicked
            if(n11.isSelected()){
            xoachu("11",1);
          sove++;
        }else{
             xoachu("11",0); ;
             sove--;
        }
    }//GEN-LAST:event_n11MouseClicked

    private void n12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n12MouseClicked
            if(n12.isSelected()){
            xoachu("12",1);
          sove++;
        }else{
             xoachu("12",0); ;
             sove--;
        }
    }//GEN-LAST:event_n12MouseClicked

    private void n13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n13MouseClicked
            if(n13.isSelected()){
            xoachu("13",1);
          sove++;
        }else{
             xoachu("13",0); ;
             sove--;
        }
    }//GEN-LAST:event_n13MouseClicked

    private void n14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n14MouseClicked
            if(n14.isSelected()){
            xoachu("14",1);
          sove++;
        }else{
             xoachu("14",0); ;
             sove--;
        }
    }//GEN-LAST:event_n14MouseClicked

    private void n15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n15MouseClicked
            if(n15.isSelected()){
            xoachu("15",1);
          sove++;
        }else{
             xoachu("15",0); ;
             sove--;
        }
    }//GEN-LAST:event_n15MouseClicked

    private void n16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n16MouseClicked
            if(n16.isSelected()){
            xoachu("16",1);
          sove++;
        }else{
             xoachu("16",0); 
             sove--;
        }
    }//GEN-LAST:event_n16MouseClicked

    private void n17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n17MouseClicked
            if(n17.isSelected()){
            xoachu("17",1);
          sove++;
        }else{
             xoachu("17",0); ;
             sove--;
        }
    }//GEN-LAST:event_n17MouseClicked

    private void n18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n18MouseClicked
            if(n18.isSelected()){
            xoachu("18",1);
          sove++;
        }else{
             xoachu("18",0); ;
             sove--;
        }
    }//GEN-LAST:event_n18MouseClicked

    private void n19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n19MouseClicked
             if(n19.isSelected()){
            xoachu("19",1);
          sove++;
        }else{
             xoachu("19",0); ;
             sove--;
        }
    }//GEN-LAST:event_n19MouseClicked

    private void n20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n20MouseClicked
             if(n20.isSelected()){
            xoachu("20",1);
          sove++;
        }else{
             xoachu("20",0); ;
             sove--;
        }
    }//GEN-LAST:event_n20MouseClicked

    private void n21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n21MouseClicked
             if(n21.isSelected()){
            xoachu("21",1);
          sove++;
        }else{
             xoachu("21",0); ;
             sove--;
        }
    }//GEN-LAST:event_n21MouseClicked

    private void n22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n22MouseClicked
             if(n22.isSelected()){
            xoachu("22",1);
          sove++;
        }else{
             xoachu("22",0); ;
             sove--;
        }
    }//GEN-LAST:event_n22MouseClicked

    private void n23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n23MouseClicked
            if(n23.isSelected()){
            xoachu("23",1);
          sove++;
        }else{
             xoachu("23",0); ;
             sove--;
        }
    }//GEN-LAST:event_n23MouseClicked

    private void n24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n24MouseClicked
            if(n24.isSelected()){
            xoachu("24",1);
          sove++;
        }else{
             xoachu("24",0); ;
             sove--;
        }
    }//GEN-LAST:event_n24MouseClicked

    private void n13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n13ActionPerformed
          if(n3.isSelected()){
            xoachu("3",1);
          sove++;
        }else{
             xoachu("3",0); 
             sove--;
        }
    }//GEN-LAST:event_n13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.err.println(sove);
        new DatVe(qd1,time1,gia1,mmg,hoten1,maxeee,maxe1,o,sove).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        
       
    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
   
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        
    }//GEN-LAST:event_n3ActionPerformed

    private void n3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_n3MousePressed

    private void n9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n9MouseClicked
        if(n9.isSelected()){
            xoachu("9",1);
            sove++;
        }else{
            xoachu("9",0); ;
            sove--;
        }
    }//GEN-LAST:event_n9MouseClicked
public String xoachu(String chu,int a){
        if(a==0){
           o= o.replace(chu+" ", "");
        }else{
            o+=chu+" ";
        
    }
    return o;
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
            java.util.logging.Logger.getLogger(Datcho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datcho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datcho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datcho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datcho("","",0,"","","","CX01").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JCheckBox n1;
    private javax.swing.JCheckBox n10;
    private javax.swing.JCheckBox n11;
    private javax.swing.JCheckBox n12;
    private javax.swing.JCheckBox n13;
    private javax.swing.JCheckBox n14;
    private javax.swing.JCheckBox n15;
    private javax.swing.JCheckBox n16;
    private javax.swing.JCheckBox n17;
    private javax.swing.JCheckBox n18;
    private javax.swing.JCheckBox n19;
    private javax.swing.JCheckBox n2;
    private javax.swing.JCheckBox n20;
    private javax.swing.JCheckBox n21;
    private javax.swing.JCheckBox n22;
    private javax.swing.JCheckBox n23;
    private javax.swing.JCheckBox n24;
    private javax.swing.JCheckBox n3;
    private javax.swing.JCheckBox n4;
    private javax.swing.JCheckBox n5;
    private javax.swing.JCheckBox n6;
    private javax.swing.JCheckBox n7;
    private javax.swing.JCheckBox n8;
    private javax.swing.JCheckBox n9;
    // End of variables declaration//GEN-END:variables
}
