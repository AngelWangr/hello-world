/**
 * 
 */
package com.sb.springbooterror.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import com.sb.springbooterror.lol.Hero;

import lombok.val;

/**
 * @author 王锐
 * @date 2018年11月24日下午2:19:15
 * @package_name com.sb.springbooterror.test
 * @project_name springboot-error
 */
public class OutputStream {

	public static void main(String[] args) {
        try {
            // 准备文件lol2.txt其中的内容是空的
            File f = new File("C:/Users/DF/Desktop/lol.txt");
            // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
            byte data[] = { 88, 89 };
 
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            // 把数据写入到输出流
            fos.write(data);
            // 关闭输出流
            fos.close();
             
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}