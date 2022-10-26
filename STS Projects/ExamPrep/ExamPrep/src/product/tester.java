package product;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class tester {
	public static void main(String[] args) {
		List<Product> productList = CollectionUtils.populateData();
		System.out.println("enter destination file address");
		try(Scanner sc = new Scanner(System.in);
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine()))) {
			System.out.println("Enter product category:");
			String ctg = sc.next();
			productList.stream().filter(s -> s.getProductCategory().equals(Category.valueOf(ctg)))
			.sorted(Comparator.comparing(Product::getPrice)).forEach(pw::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
