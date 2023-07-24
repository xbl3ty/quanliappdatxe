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
public class chitietchuyenxeDao {


    sql sql=new sql();
    List list= new ArrayList<>();
    List data=new ArrayList();
      

        
    
    public chitietchuyenxeDao(){
        data.add("int");
        data.add("int");
        data.add("String");
        data.add("String");
        data.add("String");
        data.add("String");
        data.add("String");
        data.add("String");
        data.add("String");
     data.add("int");
      data.add("int");
  
    }
    public void insert(List list1){
        try{
            sql.SQLinsertData("chitietchuyenxe", list1);
        }catch(Exception ex){
            System.err.println(ex);
        }
    
    }
      public  List select(){
        list=sql.select("chitietchuyenxe", data);
        return list;
    }
    public int size(){
        return list.size();
}
   



}
