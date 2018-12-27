package my.examples.week4.test;

import java.io.*;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-27
 * Github : https://github.com/YeoHoonYun
 */
public class textFileOutput {
    public static void main(String[] args) {
        BufferedReader in = null; //장식, readLine() 한줄을 읽어들인다.
        PrintWriter out = null; //장식, println() 한줄 쓴다.
        try{
            //절대경로, 상대경로.
            //절대경로는 C:/로 시작하거나 /로 시작하는 경로
            // 상대경로는 프로그램이 실행되는 곳을 기준.
            in = new BufferedReader(new FileReader("pom.xml"));
            out = new PrintWriter(new FileWriter("source.txt"));

            String line = null;
            int count = 1;

            while((line = in.readLine()) != null){
                out.println(count + " : " + line);
                count++;
            }

        }catch (Exception e){

        }
        finally{
            try{ in.close(); }catch(Exception ignore){}
            try{ out.close(); }catch(Exception ignore){}
        }
    }
}
