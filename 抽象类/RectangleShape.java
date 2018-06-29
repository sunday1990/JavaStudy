public class RectangleShape extends Shape{
	@Override
	public double calRectangle(float wLength, float hLength){
		return (wLength+hLength)*2;
	}

	@Override
	public double calArea(float wLength, float hLength){
		return wLength*hLength;
	}
}
