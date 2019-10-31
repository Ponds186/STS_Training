package com.ofss.products;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	public ProductsController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hi STS First Application Setup Done";
	}

	@RequestMapping ("/products")
	public ArrayList<Products> getProducts () {
		
		ArrayList<Products> prds = new ArrayList<Products>();
		
		Products p1 = new Products ("FCUBS","FLEXCUBE UniversalBanking", "14.2");
		Products p2 = new Products ("FCR","FLEXCUBE Retail Banking", "11.8");
		Products p3 = new Products ("FCIS","FLEXCUBE Investor Service","14.2");
		Products p4 = new Products ("OBP","Oracle Banking Platform","1.4");
		Products p5 = new Products ("ELCM","Enterprise Limits and Collateral","11.2");
		
		prds.add(p1);
		prds.add(p2);
		prds.add(p3);
		prds.add(p4);
		prds.add(p5);
		
		return prds;
	}
	
	@RequestMapping ("/products/{productID}")
	public Products getProducts(@PathVariable String productID) {
		
		ArrayList<Products> prds =  getProducts();
		Products p1 = new Products ();

		for (int i=0; i< prds.size();i++) {
			if (prds.get(i).getProductID().equals(productID)) {
				p1 = prds.get(i);
				break;
			}
		}
		return p1;
	}
}
