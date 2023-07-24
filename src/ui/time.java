package ui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DELL
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;


public class time {

    public void times(String time, JLabel jf) throws ParseException {

        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        try {
            date = sf.parse(time);
        } catch (Exception ex) {

        }
        long diff = ((date.getTime() - d.getTime()));
        if ((date.getTime() - d.getTime() <= 0)) {
            jf.setText("Đã hết");
        } else {
            try {

                jf.setText(((date.getMonth() - d.getMonth()) * 30) + (date.getDate() - d.getDate()) + "days:" + (TimeUnit.MILLISECONDS.toHours(diff) % 24 + "h:") + (TimeUnit.MILLISECONDS.toMinutes(diff) % 60 + "m:") + (TimeUnit.MILLISECONDS.toSeconds(diff) % 60) + "s");

            } catch (Exception ex) {
            }
        }

    }

    public int timesHIeu(String time1, String time2) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date1 = null;
        Date date2 = null;
        try {
            date1 = sf.parse(time1);
            date2 = sf.parse(time2);
        } catch (Exception ex) {
        }
        if ((date1.getTime() - date2.getTime() <= 0)) {
            return 0;
        } else {
            return 1;

        }

    }

    public static String timeNow() {
        Date time = new Date();
        return String.valueOf(time);
    }

}
