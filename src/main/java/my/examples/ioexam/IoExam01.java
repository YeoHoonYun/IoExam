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
        // 2. 해당 경로가 파일인지, 폴더인지 검사한다. 파일이면 파일, 폴더면 폴더 출력
        // 3. 해당 경로에 어떤 파일과 폴더들이 있는지 정보를 출력한다.
        // IOExam02을 만들다. PATH를 지정하면 폴더일 경우, 해당 폴더아래의 모든 파일과 폴더정보를 출력
        String filePath = "D:\\10. java_web_programming\\testDir";
        File f = new File(filePath);
        if(f.exists()){
            System.out.println(f.getName()+" 해당 경로에 디렉토리가 존재합니다.");
            if(f.isDirectory()){
                System.out.println("directory");
                File[] fileList = f.listFiles();
                for(File s: fileList){
                    System.out.println(f.getName() + " , " +
                            (f.isDirectory() ? "[DIR]" : "FILE]") +
                            f.length());
                }
            }
            else if(f.isFile()){
                System.out.println("file");
            }
            else {

            }
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
        System.out.println("-----------------------------------------------");
        fileOutput(f);
        System.out.println("-----------------------------------------------");
        if(f.exists()){
            if(f.isFile()){
                printFile("",f);
            }
            else{
                printDir("", f);
            }
        }
    }

    public static void fileOutput(File f) {
//         static한 메소드는 사용이 가능하다.
//         this를 사용하기 위해서는 인스턴스가 참조가 되어야 한다.
        if(f.isFile()){
            System.out.println(f.getName());
        }
        else if(f.isDirectory()){
            System.out.println(f.getName());
            for (File f2 : f.listFiles()){
                System.out.print(f.getName()+"\\");
                fileOutput(f2);
            }
        }
    }

    public static void printFile(String space, File file){
        System.out.println(space + file.getName());
    }
    public static void printDir(String space, File file){
        System.out.println(space + file.getName() + "[DIR]");
        space = space + "---";
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isFile()){
                printFile(space, f);
            }else{
                printDir(space, f);
            }
        }

    }

}
