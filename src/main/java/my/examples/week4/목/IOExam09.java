package my.examples.week4.목;

import java.io.*;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-27
 * Github : https://github.com/YeoHoonYun
 */
public class IOExam09 {
    InputStream in = null;
    OutputStream out = null;
    byte[] buffer = null;

    public static void main(String[] args) {
        // 파일을 1바이트씩 읽어서 복사를 하고 걸린시간
        // 파일을 1024바이트씩 읽어서 복사를 하고 걸린시간
        String path = "naver.html";
        IOExam09 ioExam09 = new IOExam09();

        // 걸린 시간을 구하는 함수
        long startTime = System.currentTimeMillis();
        ioExam09.byte1(path);
        long endTime = System.currentTimeMillis();
        System.out.println("1byte : " + (endTime - startTime)/1000.0 + "초");

        long startTime2 = System.currentTimeMillis();
        ioExam09.byte1024(path);
        long endTime2 = System.currentTimeMillis();
        System.out.println("1024byte : " + (endTime2 - startTime2)/1000.0 + "초");
    }
    void byte1(String string) {
        try {
            in = new FileInputStream(string);
            out = new FileOutputStream(string + "2");

            int readData = 0;
            while ((readData = in.read()) != -1) {
                out.write(readData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    void byte1024(String string){
        try {
            in = new FileInputStream(string);
            out = new FileOutputStream(string + "3");
            buffer = new byte[1024*1024];

            int readData = 0;
            while((readData = in.read(buffer)) != -1){
                out.write(buffer, 0, readData);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
