package com.xuexiang.SpeechAl.activity;

import android.os.Environment;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileSpeech {

//      保存日志到本地存储根目录下
//      保存的信息
//      保存的文件名称
//      保存的信息标题

    public static void saveSpeech(String messageTitle,String message, String fileName) {
        String path = Environment.getExternalStorageDirectory() + "/MySpeech";
        File files = new File(path);
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd HH:mm:ss,EE", Locale.CHINA);
        String formatDate = dateFormat.format(date);
        if (!files.exists()) {
            files.mkdirs();
        }
        if (files.exists()) {
            try {
                FileWriter fw = new FileWriter(path + File.separator
                        + fileName + ".txt");
                fw.write(formatDate + " " + messageTitle + "\n");
                fw.write(message + "\n");
                fw.write("\n");
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
