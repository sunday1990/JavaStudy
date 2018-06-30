public class PickupCar extends Car{
	PickupCar(String name, float passengersCount,float goodsCount,float price){
		this.name = name;
		this.passengersCount = passengersCount;
		this.goodsCount = goodsCount;
		this.price = price;
	}

	@Override
	public void drive(){
		System.out.println("皮卡drive");
	}
}