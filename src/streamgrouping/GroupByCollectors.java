package streamgrouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByCollectors {

	public static void main(String[] args) {
		
		long start=0;
		long end=0;
		
		List<ProductBean> products=ProductDatabase.getAllProducts();
		
		//group by products
		

	start=System.currentTimeMillis();
		
	Map<String,Integer>	groupByPro=products.stream()
		.collect(
				
				Collectors.groupingBy(ProductBean::getProductGrp,
				Collectors.summingInt(ProductBean::getQuantity))
				
				);
	
	System.out.println(groupByPro);
	end=System.currentTimeMillis();
	System.out.println("Normal stream took time :"+(end-start) +"ms");
	
	
	//Parallel Stream
	
	
	start=System.currentTimeMillis();
	Map<String,Integer>	groupByPro1=products.parallelStream()
		.collect(
				
				Collectors.groupingBy(ProductBean::getProductGrp,
				Collectors.summingInt(ProductBean::getQuantity))
				
				);
	
	System.out.println(groupByPro1);
	end=System.currentTimeMillis();
	System.out.println("Parallel stream took time :"+(end-start) +"ms");

	}

}
