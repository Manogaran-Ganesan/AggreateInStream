package streamgrouping;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
	
	public static List<ProductBean> getAllProducts(){
		
		List<ProductBean> products=new ArrayList<ProductBean>();
		
		products.add(new ProductBean(1,"soap","Non-eatable","A",4));
		products.add(new ProductBean(2,"Detergent","Non-eatable","A",6));
		products.add(new ProductBean(3,"Hand wash","Non-eatable","A",10));
		products.add(new ProductBean(4,"Sanitiser","Non-eatable","A",5));
		products.add(new ProductBean(5,"oil","eatable","B",50));
		products.add(new ProductBean(6,"choco","eatable","B",115));
		products.add(new ProductBean(7,"rice","eatable","B",500));
		products.add(new ProductBean(8,"pen","Non-eatable","A",500));
		products.add(new ProductBean(9,"Room Cleaners","Utility","C",5));
		products.add(new ProductBean(10,"Cleaner","Utility","C",10));
		
		
		return products;
		
	}

}
