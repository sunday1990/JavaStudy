public class People {
	public People(){

	}
}

class Man{
	public Man(){

	}

	public People getWoman(){
		class Woman extends People{
			int age = 0;
		}
		return new Woman();
	}
}


/*
局部内部类就像是方法里面的一个局部变量一样，不能有public、protected、private以及static修饰符

*/