/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class Randomm {
//    public boolean check(){
//        
//    }

    public List numberTrangChu(int length, int poss) {
        List list = new ArrayList<>();
        int c = 0;
        Random rd = new Random();
        boolean a = true;
        boolean dk = true;
        System.err.println(length);
        int dem = 0;
        int y = rd.nextInt(length);
        if (list.isEmpty()) {
            list.add(y);
            dem++;
        }

        if (poss == 1) {
            return list;
        }

        while (a) {
            dk = true;
            int x = rd.nextInt(length);
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).equals(x)) {

                    dk = false;
                    break;
                }
            }
            if (dk == true) {
                c = x;
                dem++;

                a = false;
            }

            if (length < poss) {
                list.add(c);
                a = true;
                if (dem >= length) {
                    a = false;
                }
            } else {
                if (dk) {
                    list.add(c);
                    a = true;
                    if (dem >= poss) {
                        a = false;
                    }
                }
            }
        }

        return list;
    }
}
