package my.examples.week4.목;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-27
 * Github : https://github.com/YeoHoonYun
 */
public class IOExam10 {
    //키보드로 한줄씩 입력받아서, 화면에 한줄씩 출력하시오.
    // System.in = InputStream
    //bufferedReader
    public static void main(String[] args) {
        BufferedReader in = null;
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            in = new BufferedReader(isr); // 장식

            // https://docs.oracle.com/javase/8/docs/api/
            // java.io => BufferedReader => 생성자(Reader) = 하지만, System.in을 입력 받아야 되기 때문에, InputStream형식을 받아오는
            // 한줄씩 출력 buffered
            String line = null;
            while((line = in.readLine()) != null){
                System.out.println(line);
            }
        //컨트롤 D

        }catch (Exception e){

        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
