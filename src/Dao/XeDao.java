/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author DELL
 */
import Xe.KhuyenMai;

import java.util.ArrayList;
import java.util.List;
public class XeDao {
    sql sql=new sql();
    List list= new ArrayList<>();
    List data=new ArrayList();
    public XeDao(){
        data.add("String");
        data.add("String");
        data.add("String");
        data.add("String");
        data.add("int");
        data.add("date");
        data.add("String");
        data.add("int");
        data.add("String");
    }
    public  List select(){
        list=sql.select("xe", data);
        return list;
    }
    public int size(){
        return list.size();
    }
    
    
}
