import java.util.*;
public class Person{
		private String name;

		private int age;

		public String getName(){
			return name;
		}

		public void setName(String name){
			this.name = name;
		}


		public int getAge(){
			return age;
		}

		public void setAge(int age){
			//在此处自定义异常错误,抛出异常
			if (age<1||age>100) {
				throw new IllegalArgumentException("年龄必须在1~100之间");				
			}
			this.age = age;
		}
}