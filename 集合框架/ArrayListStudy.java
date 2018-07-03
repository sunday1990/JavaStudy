import java.util.*;
public class ArrayListStudy{	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		NewsEntity news = new NewsEntity("新华社标题0","0","ccSunday");
		NewsEntity news1 = new NewsEntity("新华社标题1","1","ccSunday");
		NewsEntity news2 = new NewsEntity("新华社标题2","2","ccSunday");
		list.add(0,news);
		list.add(1,news1);
		list.add(2,news2);		
		System.out.println("共存储了"+list.size()+"条数据");
		for (int i = 0;i<list.size() ;i++ ) {
			NewsEntity item = (NewsEntity)list.get(i);
			if (item instanceof NewsEntity) {
				System.out.println("分别是"+item.getTitle());
			}
	
		}
	}


}