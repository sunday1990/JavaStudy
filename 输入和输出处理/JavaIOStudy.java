/*
目标：
1、File类，操作文件或者目录
2、了解流的概念及分类
3、使用字节流和字符流读写文本文件
4、使用字节流读写二进制文件
5、使用序列化和反序列化保持和恢复对象信息
*/

/*
一、File类:
1、创建文件：creatNewFile创建文件、delete()删除、renameTo重命名文件
2、使用mkdir、mkdirs创建文件夹、delete删除文件夹、renameto重命名文件夹
3、文件属性读取
*/
import java.io.File;
import java.io.IOException;

public class JavaIOStudy{
	public static void main(String[] args) {
		// test1();
		test2();
	}


	public static void test1(){
		File file = new File("hello.txt");
		//是否存在
		if (file.exists()) {
			File nameto = new File("new hello.txt");
			file.renameTo(nameto);
			//文件
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
		}else{
			System.out.println("文件不存在");
			try{
				//创建文件
				file.createNewFile();
				System.out.println("文件已经成功创建");
			}catch(IOException e){
				e.printStackTrace();
				System.out.println("文件无法创建");
			}
		}	
	}


	public static void test2(){
		File file = new File("text.txt");
		//判断文件是否存在
		System.out.println("判断文件是否存在"+file.exists());
		//读取文件名称
		System.out.println("读取文件名称"+file.getName());
		//读取文件路径
		System.out.println("读取文件路径"+file.getPath());
		//读取文件绝对路径
		System.out.println("读取文件绝对路径"+file.getAbsolutePath());
		//读取文件父级路径
		System.out.println("读取文件父级路径"+new File(file.getAbsolutePath()).getParent());
		//读取文件大小
		System.out.println("读取文件大小"+file.length()+"bytes");
		//判断文件是否隐藏
		// System.out.println("文件是否被隐藏"+file.getIsHidden());
		//判断文件是否可读
		System.out.println("文件是否可读"+file.canRead());
		//判断文件是否可写
		System.out.println("文件是否可写"+file.canWrite());
		//判断文件是否是文件夹
		System.out.println("文件是否被隐藏"+file.isDirectory());

	}

}

