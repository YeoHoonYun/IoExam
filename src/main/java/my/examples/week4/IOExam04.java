package my.examples.week4;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-27
 * Github : https://github.com/YeoHoonYun
 */
public class IOExam04 {
    public static void main(String[] args) {
        // 1의 보수 / 1의 보수 + 1 = 2의 보수
        // 양수를 반전시켜서 +1을 해라.

        //크기가 20인 byte[]을 선언한다. 값은 임의의 값을 준다.
        byte[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //byte 배열로 부터 정보를 읽어 들여 파일에 써라.
        ByteArrayInputStream in = null;
        FileOutputStream out = null;
        try{// try ~ catch 에서 자동으로 클로즈안해줘도 자동으로 클로즈를 해줌.
            in = new ByteArrayInputStream(array);
            out = new FileOutputStream("bytearray.dat");
            int readData = 0;
            // 배열의 끝을 표현 해주기위해서(바이트는 항상 양수값이 나온다.)
            readData = in.read(); // 하나하나씩 읽어들이고 마지막은 -1을 호출(끝을 표현하기 위하여 호출)
            while((readData = in.read()) != -1){ // 한개씩 읽어서 저장
                out.write(readData); // 4바이트에서 1바이트만 저장
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally{ // 반드시 처리되어야 되는 부분
            try{in.close();}catch(Exception ignore){}
            try{out.close();}catch (Exception ingnore){}
        }// finally

//        byte[] byteData = new byte[20];
//        byteData[0] = 1;
//        byteData[1] = 2;
//        System.out.println(byteData[0]);
    }
}
/*
    항상 열려있는 System.in / System.out / System.err
    위의 3개를 제외하고 처리를 해주는 경우 사용하고 나서 항상 close을 해줘야함.
 */