package com.Hybris.Internship;

import com.Hybris.Internship.model.Products;
import com.Hybris.Internship.repository.ProductsRepository;
import com.Hybris.Internship.service.MainService;
import com.Hybris.Internship.service.impl.ServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class InternshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternshipApplication.class, args);

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println();
		System.out.println();

		boolean state = true;
			while(state) {

				System.out.println(" 1. Create product \n" +
						 " 2. Create order \n" +
						 " 3. Update order quantity \n" +
						 " 4. Search product by ID \n" +
						 " 5. List of ordered products \n" +
						 " 6. Search order by ID \n" +
						 " 7. List of all orders \n" +
						 " 8. Remove product by ID \n" +
						 " 9. Remove all products(pass needed) \n" +
						 " 0. EXIT");
				switch (sc.nextInt()){
					case 1:
						Products product = new Products();
						System.out.print("Write name of product - ");
						product.setName(sc1.nextLine());
						System.out.println("Write price of product - ");
						product.setPrice(sc1.nextDouble());
						System.out.println("Choose status of product - ");
						System.out.println(" 1. Out of stock\n" +
								" 2. In stock\n" +
								" 3. Running low");
						switch(sc1.nextInt()){
							case 1: product.setStatus("out_of_stock"); break;
							case 2: product.setStatus("in_stock"); break;
							case 3: product.setStatus("running_low"); break;
							default: product.setStatus("out_of_stock");
						}
						System.out.println("Write date of creation (YYYY-MM-DD HH:MM format) - ");
						product.setCreateAt(sc1.nextLine());
						product.setCreateAt(sc1.nextLine());
						System.out.println(product);
						break;
					case 2:
						System.out.println(2);
						break;
					case 0: state=false;
					    break;
				}
			}



	}

}
