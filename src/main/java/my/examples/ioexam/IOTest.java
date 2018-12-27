package my.examples.ioexam;

import java.io.File;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-21
 * Github : https://github.com/YeoHoonYun
 */
public interface IOTest {
    static File file = new File("D:\\10. java_web_programming\\testDir");
    static File[] fileList = file.listFiles();
}
