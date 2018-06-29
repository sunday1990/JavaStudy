
public class Initial {
    public static void main(String[] args) {
		Shape rectangle = new RectangleShape();
		Shape circle = new CircleShape();
		System.out.println("长方形的周长为"+rectangle.calRectangle(10,20)+"面积为"+rectangle.calArea(10,20));		 
		System.out.println("圆形的周长为"+circle.calRectangle(10,10)+"面积为"+circle.calArea(10,10));	
	}
}