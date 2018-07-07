interface Product{
	public double getPrice();
	public String getName();
}

public class AbstractInnerClass{
	public void test(Product p){
		System.out.println("购买了一个"+p.getName()+"花掉了"+p.getPrice());
	}

	public static void main(String[] args) {
		AbstractInnerClass ta = new AbstractInnerClass();
		ta.test(new Product(){
			public double getPrice(){
				return 476;
			}
			public String getName(){
				return "AGP显卡";
			}
		});
	}

}


/*
1、匿名内部类必须继承一个父类，或实现一个接口，但最多只能继承一个父类，或实现一个接口

 关于匿名内部类还有如下两条规则：
 1）匿名内部类不能是抽象类，因为系统在创建匿名内部类的时候，会立即创建内部类的对象。因此不允许将匿名内部类
 定义成抽象类。
 2）匿名内部类不等定义构造器，因为匿名内部类没有类名，所以无法定义构造器，但匿名内部类可以定义实例初始化块

连接：https://www.cnblogs.com/dolphin0520/p/3811445.html


*/