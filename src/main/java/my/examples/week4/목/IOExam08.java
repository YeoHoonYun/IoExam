package my.examples.week4.목;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-27
 * Github : https://github.com/YeoHoonYun
 */
public class IOExam08 {
    public static void main(String[] args){
        // 크기가 20인 byte[] 을 선언한다. 값은 임의의 값을 준다.
        byte[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,-1,19,20};
        // byte배열로 부터 정보를 읽어들여 파일에 써라.
        ByteArrayInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new ByteArrayInputStream(array);
            out = new FileOutputStream("bytearray.dat");
            byte[] buffer = new byte[7]; // 파일로 넣기에는 1024가 좋음.

            int readData = 0;
            while((readData = in.read(buffer)) != -1){ // 최대 7개씩 읽어들인다.
                out.write(buffer,0,readData);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{ in.close(); }catch(Exception ignore){}
            try{ out.close(); }catch(Exception ignore){}
        } // finally
    }
}
