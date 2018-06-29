
public class CircleShape extends Shape{
	@Override
	public double calRectangle(float wLength, float hLength){
		if (wLength == hLength) {
			return  2*3.14*wLength;
		}else{
			return 0;
		}
	}

	@Override
	public double calArea(float wLength, float hLength){
		if (wLength == hLength) {
			return 3.14*wLength*wLength;
		}else{
			return 0;
		}
	}

}
