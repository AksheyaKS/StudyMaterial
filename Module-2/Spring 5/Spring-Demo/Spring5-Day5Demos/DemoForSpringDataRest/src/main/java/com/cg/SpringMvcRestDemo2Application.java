package com.cg;
/*
 * http://localhost:8083/
 * 
 * ---------------------------------
 * {
  "_links" : {
    "products" : {
      "href" : "http://localhost:8083/products{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8083/profile"
    }
  }
}
 * -----------------------------------
 * 
 * {
  "_links" : {
    "cgProducts" : {
      "href" : "http://localhost:8083/pathProducts{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8083/profile"
    }
  }
}
 * 
 * ---------------------------------
 * http://localhost:8083/pathProducts/search/findByProductName?pnm=bag
 * 
 * {
  "productName" : "bag",
  "quantity" : 5,
  "price" : 78000.0,
  "expiryDate" : null,
  "_links" : {
    "self" : {
      "href" : "http://localhost:8083/pathProducts/1002"
    },
    "product" : {
      "href" : "http://localhost:8083/pathProducts/1002"
    }
  }
}
 * ---------------------------------
 * http://localhost:8083/pathProducts/search/getByPrice?pri=20000.0
 * 
 * 
 * 
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg")
public class SpringMvcRestDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcRestDemo2Application.class, args);
		System.out.println("Strted at 8083");
	}

}
