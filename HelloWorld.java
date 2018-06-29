public class HelloWorld{
	
	HelloWorld(){
		System.out.println("helloworld 初始化了");
	}

    public static void main(String[] args) {
	 	String str = "java";
		System.out.println("Hello  "+str);		
		PrivateHelloworld.doSomePrivateMethod();
	}
	
}
 class PrivateHelloworld extends HelloWorld{
 	
 	 PrivateHelloworld(){
	 	System.out.println("private hello world 初始化了");
	 }

	 public static void main(String[] args) {
		System.out.println("private hello world");
	 }

	 public static void doSomePrivateMethod(){
	 	System.out.println("doSomePrivateMethod");
	 }

	
}