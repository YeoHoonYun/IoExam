package my.examples.week4.목;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-27
 * Github : https://github.com/YeoHoonYun
 */
public class IOExam07 {
    public static void main(String[] args) {
        // 파일을 읽어서 다른 파일로 전달하는 소스 코드
        InputStream in = null;
        OutputStream out = null;

        try{
            URL url = new URL("https://www.naver.com");
            in = url.openStream();
            out = new FileOutputStream("naver.html");

            int readData = 0;
            while((readData = in.read()) != -1){
                out.write(readData);
            }

        }catch (Exception e){

        }finally {
            try{in.close();}catch (Exception ignore){}
            try{out.close();}catch (Exception ignore){}
        }
    }
}

