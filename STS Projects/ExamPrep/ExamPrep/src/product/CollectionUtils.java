package product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface CollectionUtils { 
	static List<Product> populateData() {
		ArrayList<Product> prodList = new ArrayList<>();
		prodList.add(new Product(101, "Apple", Category.FRUITS, LocalDate.parse("2022-10-12"), 500 ));
		prodList.add(new Product(101, "Sunflower", Category.OIL, LocalDate.parse("2022-09-12"), 400 ));
		prodList.add(new Product(101, "Wheat", Category.GRAIN, LocalDate.parse("2021-11-30"), 500 ));
		prodList.add(new Product(101, "Orange", Category.FRUITS, LocalDate.parse("2022-10-12"), 500 ));
		return prodList;
	}
}
