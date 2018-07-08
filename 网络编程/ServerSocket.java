import java.net.*;
import java.io.*;

public class ServerSocket{
	public static void main(String[] args) {
		ServerSocket server = new ServerSocket(9999);   //创建服务器
		Socket socket = server.accept();                //接受客户端的请求
		InputStream is = socket.getInputStream();       //获取输入流
		OutputStream os = socket.getOutputStream();     //获取输出流

		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintStream ps = new PrintStream(os);

		ps.println("欢迎咨询传智播客");
		System.out.println(br.readLine());
		ps.println("报满了,请报下一期吧");
		System.out.println(br.readLine());
		server.close();
		socket.close();
	}
}