// import 
public  class TestThrow{
	public static void main(String[] args) {
		Person p = new Person();
		try{
			p.setAge(120);
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}finally{
			System.out.println("finally中的代码执行了");
		}
		System.out.println("年龄是"+p.getAge());
	}
}


/*
1、throw抛出错误
2、try-catch中捕获，并打印错误堆栈
3、执行finally中的代码块
4、最后执行try-catch-finally之外的代码


其他：
IllegalArgumentException是Exception的子类
*/