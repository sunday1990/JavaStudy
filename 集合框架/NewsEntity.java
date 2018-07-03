
public class NewsEntity{
	private String title;
	private String ID;
	private String author;

	NewsEntity(String t,String a,String i){		
		this.title = t;
		this.ID = i;
		this.author = a;
	}

	public void setTitle(String t){
		title = t;
	}
	public String getTitle(){
		return title;
	}


	public void setID(String i){
		ID = i;
	}
	public String getID(){
		return ID;
	}

	public void setAuthor(String a){
		author = a;
	}
	public String getAuthor(){
		return author;
	}

}