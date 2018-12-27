package my.examples.week4;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

//hex data

/**
 * Created by cjswo9207u@gmail.com on 2018-12-27
 * Github : https://github.com/YeoHoonYun
 */
public class IOExam05 {
    public static void main(String[] args) {
        FileInputStream in = null;
        ByteArrayOutputStream out = null;
        byte[] bytearray = null;

        try{
            out = new ByteArrayOutputStream();
            in = new FileInputStream("bytearray.dat");
            int readDate = 0;
            while((readDate = in.read()) != -1){
                out.write(readDate);
            }

            bytearray = out.toByteArray();
            for(byte b : bytearray){
                System.out.println(b);
            }
        }catch (Exception e){

        }finally {
            try {
                in.close();
            } catch (Exception ignore) { }
            try {
                out.close();
            } catch (Exception ignore) { }
        }
    }
}
