public class GoodsCar extends Car{
		//载货量
	public  float goodsCount;
	GoodsCar(String name ,float goodsCount,float price){
		this.price = price;
		this.name = name;
		this.goodsCount = goodsCount;
	}
	@Override
	public void drive(){
		System.out.println("火车drive");
	}
}