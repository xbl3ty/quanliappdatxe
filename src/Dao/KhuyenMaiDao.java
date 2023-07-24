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
public class KhuyenMaiDao {
    sql sql=new sql();
    List list= new ArrayList<>();
    List data=new ArrayList();
    public KhuyenMaiDao(){
        data.add("String");
        data.add("String");
        data.add("String");
        data.add("int");
        data.add("date");
        data.add("date");
        data.add("int");
        data.add("String");
    }
    public  List select(){
        list=sql.select("khuyenmai", data);
        return list;
    }
    public int size(){
        return list.size();
    }

    
}
