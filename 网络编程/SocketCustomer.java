import java.net.*;
import java.io.*;
public class SocketCustomer{
	public static void main(String[] args) {
		Socket socket = new Socket("127.0.0.1",9999);
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintStream ps = new PrintStream(os);
		System.out.println(br.readLine());
		ps.println("我想上课");
		System.out.println("爷不上了");
		socket.close();
	}
}


/*
1.客户端
创建Socket连接服务端(指定ip地址,端口号)通过ip地址找对应的服务器
调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
输入流可以读取服务端输出流写出的数据
输出流可以写出数据到服务端的输入流


2.服务端
创建ServerSocket(需要指定端口号)
调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
输入流可以读取客户端输出流写出的数据
输出流可以写出数据到客户端的输入流
*/