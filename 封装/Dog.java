import java.util.*;
public class Dog{
	
	private String name;
	private String[] kinds;
	private int healthy;
	private String introdue;

	//名称
	public void setName(String n){
		this.name = n;
	}
	public String getName(){
		return this.name;
	}

	//种类

	public void setKinds(String[] k){
		this.kinds = k;
	}

	public String[] getKinds(){
		return this.kinds;
	}
	//健康值

	public void setHealthy(int h){
		if (h>=0 && h<=100) {
			this.healthy = h;
		}else{
			System.out.println("健康值应该在0至100之间，默认值为60");
			this.healthy = 60;
		}
	}
	public int getHealthy(){
		return this.healthy;
	}
	
	//简介
	public void setIntroduce(String intro){
		this.introdue = intro;
	}

	public String getIntroduce(){
		if (this.introdue.length() == 0) {
			return "暂无简介";
		}else{
			return this.introdue;
		}
		
	}

}