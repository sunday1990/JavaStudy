/*
Java流的分类：
按照流向区分：
1、outputStream和write作为基类
2、inputStream和reader作为基类


按照处理数据单元划分：
1、字节流：字节输入流inputStream基类和字节数出流OutputStream基类
2、字符流：字符输入流Reader基类和字符输出流Write基类
*/

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
// import java.io.FileInputStream;
import java.util.*;
import java.io.*;
public class FileStreamStudy{
	public static void main(String[] args) {
		// readTest();
		writeTest();
	}

	//读取文件
	public static void readTest(){
		File file = new File("hello.txt");
		try{
			//创建文件输入流对象，指定要读取的文件对象
			FileInputStream fls = new FileInputStream(file);
			//方法一：将输入流的数据传递个给字节数组
			byte[] b = new byte[fls.available()];
			//将字节流中的数据传递给字节数组
			fls.read(b);
			//将字节数组转为字符串
			String s = new String(b);
			System.out.println(s);
		}catch(IOException e){
			e.printStackTrace();
		}		
	}

	//写入文件
	public static void writeTest(){
		File file = new File("hello.txt");
		try{
		 //创建文件字节输出流对象,准备向hello.doc文件中写入数据，true标识在原有的基础上增加内容
		 FileOutputStream fout = new FileOutputStream(file,true);
		 Scanner sc = new Scanner(System.in);
		 System.out.println("请写出一段字符串（非中文）");
		 String msg = sc.next() + "\r\n";
		 //1、按照字节数组写入
		 byte []bytes = msg.getBytes();
		 fout.write(bytes);
		 fout.close();//写完后一定要关闭
         System.out.println("写入完成！");

		 //2、逐字节写入
		   // byte[] bytes = msg.getBytes();
	    //     for (int i = 0; i < bytes.length; i++) {
	    //         fout.write(bytes[i]);//逐字节写文件
	    //     }
	    //     fout.flush();//强制刷新输出流
	    //     fout.close();//关闭输出流
	    //     System.out.println("写入完成！");////写完后一定要关闭
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}

/*
一、case1 使用FileInputStream读文本文件
1、引入相关的类
2、构造文件输入流FileInputStream对象
3、读取文本文件的数据
4、关闭文件流对象
*/