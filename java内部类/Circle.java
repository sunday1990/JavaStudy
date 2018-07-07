public class Circle{	
	double radis = 0;
	private Draw draw;
	public Circle(double radius){
		this.radis = radius;
		getDrawInstance().drawShape();
	}

	public Draw getDrawInstance(){
		if (draw == null) {
			draw = new Draw();
			System.out.println("初始化了一个draw对象");
		}
		return  draw;
	}

	class Draw{
		public void drawShape(){
			System.out.println("外部类的成员变量radis为"+radis);
			System.out.println("draw shape");
		}
	}

}





/*
内部类之成员内部类

*/