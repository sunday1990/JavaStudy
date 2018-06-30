public class PassengersCar extends Car{
	
	GoodsCar(String name ,float passengersCount,float price){
		this.price = price;
		this.name = name;
		this.passengersCount = passengersCount;
	}
	@Override
	public void drive(){
		System.out.println("客车drive");
	}
}