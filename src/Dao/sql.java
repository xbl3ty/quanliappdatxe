package Dao;


import Xe.KhuyenMai;
import Xe.Nguoidung;
import Xe.chitietchuyenxe;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;



/**
 *
 * @author DELL'
 */
public class sql {

    

  

    java.sql.Connection cnn = Dao.connToMySQL();

    public List table(String list) {

        if (list == "khuyenmai") {
            List<KhuyenMai> listsanpham = new ArrayList<KhuyenMai>();
            return listsanpham;

        }else if(list=="chitietsanpham"){
              List<chitietchuyenxe> chitietsp = new ArrayList<chitietchuyenxe>();
            return chitietsp;
        }
        else if(list=="chitietnguoidung"){
              List<Nguoidung> chitietnguoidung = new ArrayList<Nguoidung>();
            return chitietnguoidung;
        }
        return null;
    }

    public String values(String table, List list, int pos) {

        String values = "";
        if ("khuyenmai".equals(table)) {
if(pos==0){
     List List = table("khuyenmai");
            if ("khuyenmai".equals(table)) {
                List = table(table);
                values += "tenkm =" + "'" + list.get(1) + "'" + " ,";
                values += "loaiKH = " + "'" + list.get(2) + "'" + " ,";
                values += "soluong = " + "'" + list.get(3) + "'" + " ,";
                values += "batdau = " + "'" + list.get(4) + "'" + " ,";
                values += "ketthuc = " + "'" + list.get(5) + "'" + " ,";
                 values += "phantramkm = " + "'" + list.get(6) + "'" + " ,";
                values += "hinh = " + "'" + list.get(7) + "'" + " ";
                values += "where makm =" + "'" + list.get(0) + ""+"'" ;
            }
} else {
            return values += " where makm =" + "'" + list.get(0) + "'";
        }
           
        }
            
            if("chitietchuyenxe".equals(table)){
                if(pos==0){
                      List List = table("chitietchuyenxe");
                List = table(table);
                values += "sove =" + "'" + list.get(1) + "'" + " ,";
                values += "diemdon = " + "'" + list.get(2) + "'" + " ,";
                values += "diemden = " + "'" + list.get(3) + "'" + " ,";
                values += "kigui = " + "'" + list.get(4) + "'" + " ,";
                values += "phuongthucthanhtoan = " + "'" + list.get(5) + "'" + " ,";
                values += "makm = " + "'" + list.get(6) + "'" + " ,";
                values += "mand = " + "'" + list.get(7) + "'" + " ,";
                 values += "maxe = " + "'" + list.get(8) + "'" + " ,";
                  values += "gia = " + "'" + list.get(9) + "'" + " ,";
                  values += "trangthai = "  + list.get(10)  + " ";
                values += "where mactcx =" + "'" + list.get(0) + "'";
                }
                else{
                 
            return values += " where mactcx =" + "'" + list.get(0) + "'";
        
            }
              
            }
               if("xe".equals(table)){
                if(pos==0){
                      List List = table("xe");
                List = table(table);
                values += "manv =" + "'" + list.get(1) + "'" + " ,";
                values += "diemdon = " + "'" + list.get(2) + "'" + " ,";
                values += "diemden = " + "'" + list.get(3) + "'" + " ,";
                values += "trangthai = " +   list.get(4)  + " ,";
                values += "thoigianxuatphat = " + "'" + list.get(5) + "'" + " ,";
                values += "biensoxe = " + "'" + list.get(6) + "'" + " ,";
                  values += "gia = " + "'" + list.get(7) + "'" +" ,";
                  values += "vedaban = " + "'" + list.get(8) + "'" ;
                values += "where macx =" + "'" + list.get(0) + "'";
                }
                else{
                 
            return values += " where macx =" + "'" + list.get(0) + "'";
        
            }
              
            }
             if("nguoidung".equals(table)){
                if(pos==0){
                      List List = table("nguoidung");
                List = table(table);
                values += "matkhau =" + "'" + list.get(1) + "'" + " ,";
                values += "chucvu = " + "'" + list.get(2) + "'" ;
                values += "where mand =" + "'" + list.get(0) + "'";
                }
                else{
                 
            return values += " where mand =" + "'" + list.get(0) + "'";
        
            }
              
            }
              if("chitietnguoidung".equals(table)){
                if(pos==0){
                      List List = table("chitietnguoidung");
                List = table(table);
                values += "hoten =" + "'" + list.get(1) + "'" + " ,";
                values += "sdt = " + "'" + list.get(2) + "'" +" ,";
                values += "email = " + "'" + list.get(3) + "'" +" ,";
                values += "ngaysinh = " + "'" + list.get(4) + "'" +" ,";
                values += "gioitinh = " + "" + list.get(5) + "" +" ,";
                values += "chucvu = " + "'" + list.get(6) + "'" ;
                values += "where mand =" + "'" + list.get(0) + "'";
                }
                else{
                 
            return values += " where mand =" + "'" + list.get(0) + "'";
        
            }
              
            }
             
            return values;
        

    }

    public String setdata(String sql) {
        try {
            PreparedStatement ps;
            ps = cnn.prepareStatement(sql);

            ps.executeUpdate();
        } catch (Exception ex) {
        }
        return "";

    }

    public void SQLupdatedata(String table, List list) {
        try{
            
        String sql = "update " + table + " set " + values(table, list,0);
        setdata(sql);
        }catch(Exception e){
        }
      
   
    }

    public static List getData(String sql, List data) {
      List e=new ArrayList<>();
        
        try {
             java.sql.Connection cnn = Dao.connToMySQL();
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               List f=new ArrayList();
                for (int i = 1; i <= data.size(); i++) {
                   
                    if (data.get(i - 1) == "String") {
                        f.add(rs.getString(i));
                    } else if (data.get(i - 1) == "boolean") {
                        f.add(rs.getBoolean(i));
                    } else if (data.get(i - 1) == "float") {
                       f.add(rs.getFloat(i));
                       
                    }
                    else if (data.get(i - 1) == "int") {
                       f.add(rs.getInt(i));}
                    else if (data.get(i - 1) == "date") {
                        f.add(String.valueOf(rs.getDate(i))+" "+String.valueOf(rs.getTime(i)));
                    }
                   
                }
                 e.add(f);
            }

            ps.executeQuery();
            
            return e;
        } catch (Exception ex) {
        }
        return e;

    }

    public List select(String database, List data) {
        List select = new ArrayList<>();
        try {
            String sql = "select* from " + database;
            select = getData(sql, data);
        } catch (Exception ex) {
        }

        return select;
    }

    public void SQLinsertData(String table, List list) throws SQLException {
        int index = list.size();
        String values = "";
        for (int i = 0; i < index; i++) {
            if(list.get(i).toString()=="NULL" &&i==0){
                values+="NULL,";
                continue;
            }
            if(table=="chitietnguoidung" &&i==5){
                 values +=  list.get(i)+"," ;
                 continue;
            }
            if(table=="xe" &&i==4){
                 values +=  list.get(i)+"," ;
                 continue;
            }
            if (i == index - 1) {
                values += "'" + list.get(i) + "'";
            } else {
                values += "'" + list.get(i) + "'" + ",";
            }
        }
        String sql = "insert into " + table + " values(" + values + ")";
        setdata(sql);
    }

    public void SQLDelData(String table,List list) {
        String sql = "delete from " + table  + values(table, list,1);
        setdata(sql);
    }

}
