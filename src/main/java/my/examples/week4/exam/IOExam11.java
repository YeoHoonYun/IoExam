package my.examples.week4.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-27
 * Github : https://github.com/YeoHoonYun
 */
public class IOExam11 {
    public static void main(String[] args){
        BufferedReader in = null; // 장식, readLine() 한줄 읽어들인다.
        PrintWriter out = null; // 장식, println() 한줄 쓴다.
        try{
            // 절대경로, 상대경로.
            // 절대경로는 c:/ 로 시작하거나 / 로 시작하는 경로
            // 상대경로는 프로그램이 실행되는 곳을 기준.
            in = new BufferedReader(new FileReader("pom.xml"));
//            out = new PrintWriter(new FileWriter("source.txt"));
            out = new PrintWriter("source2.txt");

            String line = null;
            int count = 1;
            while( (line = in.readLine()) != null){
                out.println(count + " : " + line);
                count++;
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{ in.close(); }catch(Exception ignore){}
            try{ out.close(); }catch(Exception ignore){}
        }
    }
}
/*
    API 확인 : 일단 파일을 읽고 써서 라인 단위로 입력 하는 것을 찾는다.
    // 입력 : 텍스트 한줄을 받아들려야 하므로 ButteredReader으로 작성한다.
    // 출력 : 한 줄씩 읽어 들여서 파일형태로 떨어뜨려야된다.
 */