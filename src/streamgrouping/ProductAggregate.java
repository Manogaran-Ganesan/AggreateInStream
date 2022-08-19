package streamgrouping;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class ProductAggregate {

	public static void main(String[] args) {

		List<ProductBean> pro = ProductDatabase.getAllProducts();

		long count = pro.stream().map(ProductBean::getId).count();
		System.out.println("Total product Count :" + count);

		Map<String, Long> productCatCount = pro.stream().collect(

				Collectors.groupingBy(ProductBean::getProductCat, Collectors.counting())

		);

		System.out.println("Count by product Category :" + productCatCount);

		System.out.println("-------------------------");

		int sum = pro.stream().map(ProductBean::getQuantity).mapToInt(e -> e).sum();
		System.out.println("Sum of quqntity :" + sum);

		Map<String, Integer> ProductQuantityCountByCat = pro.stream().collect(
				Collectors.groupingBy(ProductBean::getProductCat, Collectors.summingInt(ProductBean::getQuantity)));

		System.out.println("Sum of Quqntity by Categoty :" + ProductQuantityCountByCat);

		System.out.println("-------------------------");

		double avg = pro.stream().map(ProductBean::getQuantity).mapToInt(e -> e).average().getAsDouble();
		System.out.println("Total Avg of Quantity :" + avg);

		Map<String, Double> AvgofQuantityByCategory = pro.stream().collect(Collectors
				.groupingBy(ProductBean::getProductCat, Collectors.averagingDouble(ProductBean::getQuantity)));

		System.out.println("Avg of Quantity by category :" + AvgofQuantityByCategory);

		System.out.println("-------------------------");

		int max = pro.stream().map(ProductBean::getQuantity).mapToInt(e -> e).max().getAsInt();
		System.out.println("Max of Quantity :" + max);
		
		
		Comparator<ProductBean> QuantityComparator=Comparator.comparing(ProductBean::getQuantity);
		
		Map<String, Optional<ProductBean>> maxOfQuantityByCategory=
				pro.stream()
				   .collect(
						   Collectors.groupingBy(ProductBean::getProductCat,
						   Collectors.reducing(BinaryOperator.maxBy(QuantityComparator))));
	
		maxOfQuantityByCategory.forEach((productCat,p)->{
			ProductBean pb=p.get();
			System.out.println(pb);
		});
		
		//System.out.println("Max of Quqntity of Category :"+maxOfQuantityByCategory);
		
		System.out.println("-------------------------");

		
		int min = pro.stream().map(ProductBean::getQuantity).mapToInt(e -> e).min().getAsInt();
		System.out.println("Min of Quantity :" + min);
		
	
		Comparator<ProductBean> QuantityComparator1=Comparator.comparing(ProductBean::getQuantity);
		
		Map<String, Optional<ProductBean>> minOfQuantityByCategory=
				pro.stream()
				   .collect(
						   Collectors.groupingBy(ProductBean::getProductCat,
						   Collectors.reducing(BinaryOperator.minBy(QuantityComparator1))));
	
		minOfQuantityByCategory.forEach((productCat,p)->{
			ProductBean pb=p.get();
			System.out.println(pb);
		});
		
		System.out.println("-------------------------");

	}

}
