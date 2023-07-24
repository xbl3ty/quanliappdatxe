/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package da1.ui;


import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;
import Dao.XeDao;
import Xe.Car;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.time;

/**
 *
 * @author BAO
 */
public class TimVe1 extends javax.swing.JFrame {
        XeDao xd=new XeDao();
time tm=new time();
String name="";
String mave="";
    /**
     * Creates new form NewJFrame
     */
    public TimVe1(String ten) {
        name=ten;
        initComponents();
        setLocationRelativeTo(null);
         xd.select();
           loadccb();
           loadtable();
    }
    public List search(String start,String end ,String thoigian) throws ParseException{
       for(int i=0;i<xd.size();i++){
           if(loadx(i).get(2).equals(start)){
               if(loadx(i).get(3).equals(end)){
               if(tm.timesHIeu((String) loadx(i).get(5), thoigian)==1){
                  
               if(loadx(i).get(4).toString().equals("true")){
                   return loadx(i);
               }
           }
           }
           }
       }
        return null;
    
   }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {  
     
        new TaiKhoan(name).setVisible(true);
    }
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {   
         try{
                SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd ");

            String date = sf.format(jDateChooser1.getDate());
            date+=jTextField1.getText()+":"+jTextField2.getText()+":00";
             List a=search(jComboBox4.getSelectedItem().toString(), jComboBox5.getSelectedItem().toString(), date);
           
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            String b="";
            String qd=a.get(2).toString()+" <=> "+a.get(3).toString();
                         if("true".equals(a.get(4).toString())){
                   b="Còn";
              }else{
                             b="Hết";
                         }
            Object[]row={
                a.get(0),a.get(1),a.get(5),a.get(7),b,qd,"Đặt vé"

            };
            model.addRow(row);
         }catch(Exception ex){
             JOptionPane.showMessageDialog(this, "Không có vé này!!!");
         }
          
    }  

           public List loadx(int index){
        List<Car> listt = new ArrayList<>();
        listt = (List<Car>) xd.select().get(index);
        return listt;
    }
           public void loadtable(){
                 DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            List a=new ArrayList();
            for(int i=0;i<xd.size();i++){
                a=loadx(i);
                 
            String qd=a.get(2).toString()+" <=> "+a.get(3).toString();
                        
                         
            Object[]row={
               a.get(0) ,a.get(1),a.get(5),a.get(7),a.get(4),qd,"Đặt vé"

            };
            model.addRow(row);
            }
          
            
           }
    public void loadccb(){
        jComboBox4.removeAllItems();
        jComboBox5.removeAllItems();
      
        for(int i=0;i<xd.size();i++){
            jComboBox4.addItem(String.valueOf(loadx(i).get(2)) );
            jComboBox5.addItem(String.valueOf(loadx(i).get(3)));
        }
    }

    class ButtonEditor extends DefaultCellEditor
{
	protected JButton btn;
	 private String lbl;
	 private Boolean clicked;
	 
	 public ButtonEditor(JTextField txt) {
		super(txt);
		
		btn=new JButton();
		btn.setOpaque(true);
		
		//WHEN BUTTON IS CLICKED
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fireEditingStopped();
			}
		});
	}
	 
	 //OVERRIDE A COUPLE OF METHODS
	 @Override
	public Component getTableCellEditorComponent(JTable table, Object obj,
			boolean selected, int row, int col) {

			//SET TEXT TO BUTTON,SET CLICKED TO TRUE,THEN RETURN THE BTN OBJECT
		 lbl=(obj==null) ? "":obj.toString();
		 btn.setText("Đặt vé ngay");
		 clicked=true;
		return btn;
	}
	 
	//IF BUTTON CELL VALUE CHNAGES,IF CLICKED THAT IS
	 @Override
	public Object getCellEditorValue() {

		 if(clicked)
			{
                            DefaultTableModel df=(DefaultTableModel) jTable1.getModel();
                            int row=jTable1.getSelectedRow();
                             new DatVe(df.getValueAt(row, 5).toString(), df.getValueAt(row, 2).toString(),Integer.parseInt( df.getValueAt(row, 3).toString()), "", name,df.getValueAt(row, 0).toString(),df.getValueAt(row, 0).toString(),"",0).setVisible(true);
			}
		//SET IT TO FALSE NOW THAT ITS CLICKED
		clicked=false;
	  return new String(lbl);
	}
	
	 @Override
	public boolean stopCellEditing() {

	       //SET CLICKED TO FALSE FIRST
			clicked=false;
		return super.stopCellEditing();
	}
	 
	 @Override
	protected void fireEditingStopped() {
		// TODO Auto-generated method stub
		super.fireEditingStopped();
	}
    }
    class ButtonRenderer extends JButton implements  TableCellRenderer
{

	//CONSTRUCTOR
	public ButtonRenderer() {
		//SET BUTTON PROPERTIES
		setOpaque(true);
	}
	@Override
	public Component getTableCellRendererComponent(JTable table, Object obj,
			boolean selected, boolean focused, int row, int col) {
		
		//SET PASSED OBJECT AS BUTTON TEXT
			setText((obj==null) ? "":obj.toString());
				
		return this;
	}
	
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
   
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("LOGO");
        jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setText("Tài khoản");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setText("Điểm đón");

        jLabel7.setText("Điểm đến");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("      Tìm vé      ");
     jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (ParseException ex) {
                    Logger.getLogger(TimVe1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
         jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (ParseException ex) {
                    Logger.getLogger(TimVe1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jLabel1.setText("Ngày di chuyển");

        jLabel2.setText("Thời gian bắt đầu");

        jLabel3.setText("giờ  :   ");

        jLabel4.setText("phút   GMT+7  ĐỊnh dạng 24h");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(145, 145, 145))
        );

        jButton3.setText("Trang chủ");

        jButton4.setText("Vé của tôi ");


        jButton6.setText("Tài khoản");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null,null,  "Đặt vé"},


            },
            new String [] {
                "Mã chuyến xe", "Người lái", "Thời gian khơi hành ", "Giá vé","vé", "Quảng đường","Đặt vé"
            }
        ));
        jTable1.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());;
	
	//SET CUSTOM EDITOR TO TEAMS COLUMN
	jTable1.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JTextField()));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setRowHeight(32);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
                  jTable1.getColumnModel().getColumn(1).setPreferredWidth(45);
                              jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
                       jTable1.getColumnModel().getColumn(2).setPreferredWidth(110);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(84, 84, 84)))
                .addContainerGap())
        );
      layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                  
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimVe1("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}
