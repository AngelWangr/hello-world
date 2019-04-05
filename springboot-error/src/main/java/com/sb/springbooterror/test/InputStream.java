/**
 * 
 */
package com.sb.springbooterror.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 王锐
 * @date 2018年11月27日下午8:28:26
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class InputStream {
	public static void main(String[] args) {
        try {
            //准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66
            File f =new File("C:/Users/DF/Desktop/lol.txt");
            //创建基于文件的输入流
            FileInputStream fis =new FileInputStream(f);
            //创建字节数组，其长度就是文件的长度
            byte[] all =new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for (byte b : all) {
                //打印出来是65 66
                System.out.println(b);
            }
             
            //每次使用完流，都应该进行关闭
            fis.close();
              
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }       
    }
}
