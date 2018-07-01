public class StaticTest{
	static int num = 100;
	static{
		num+=100;
		System.out.println(num);
	}
	static{
		num+=100;
		System.out.println(num);
	}
}
/*
修饰符：    
private:本类
默认： 本类、同包
protected：本类，同包，子类
public：本类，同包，子类，任何地方
*/


/*
1、静态变量属于类，该类的所有对象持有同样的静态变量，访问时可以直接通过类名访问，也可以通过引用访问
2、静态方法，可以直接通过类名访问
3、代码块：
	Java虚拟机加载该类的时候，就会执行，按照顺序从上至下
4、方法里不可以定义静态变量
*/