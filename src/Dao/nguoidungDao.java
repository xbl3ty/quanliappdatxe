/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class nguoidungDao {
     sql sql=new sql();
    List list= new ArrayList<>();
    List data=new ArrayList();
    public nguoidungDao(){
        data.add("String");
        data.add("String");
        data.add("String");
        data.add("String");
        data.add("date");
        data.add("boolean");
        data.add("String");
    }
    public  List select(){
        list=sql.select("chitietnguoidung", data);
        return list;
    }
    public int size(){
        return list.size();
    }

}
