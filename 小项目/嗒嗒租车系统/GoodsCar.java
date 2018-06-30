public class GoodsCar extends Car{	
	GoodsCar(String name ,float goodsCount,float price){
		this.price = price;
		this.name = name;
		this.goodsCount = goodsCount;
	}
	@Override
	public void drive(){
		System.out.println("货车drive");
	}
}