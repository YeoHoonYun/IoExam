package my.examples.ioexam;

import java.io.*;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-21
 * Github : https://github.com/YeoHoonYun
 */
public class IoExam01 {
    public static void main(String[] args) {
        // D:\10. java_web_programming\testDir
        // 1. 위의 폴더가 있는지 없는지 검사한다. 있으면 있다. 없으면 없다.
        // 2. 해당 결로가 파일인지, 폴더인지 검사한다. 파일이면 파일, 폴더면 폴더 출력
        // 3. 해당 경로에 어떤 파일과 폴더들이 있는지 정보를 출력한다.
        String filePath = "D:\\10. java_web_programming\\testDir";
        File f = new File(filePath);
        if(f.isDirectory()){
            System.out.println(f.getName()+" 해당 경로에 디렉토리가 존재합니다.");
        }
        else{
            System.out.println("파일이 없습니다.");
        }

        File[] files = f.listFiles();
        System.out.println(f.getName()+"의 하위 폴더 정보");
        for(int i=0; i<files.length; i++){
            File file = files[i];
            if(file.isFile()){
                System.out.println(file.getName() + "은 파일입니다.");
            }
            else if(file.isDirectory()){
                System.out.println(file.getName() + "은 디렉토리입니다.");
            }


        }


    }
}
