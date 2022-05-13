package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Product;
import com.zensar.spring.service.ProductService;

public class AppAllProduct {
	public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
        
        ProductService service=context.getBean("service",ProductService.class);
        
        //Product product=new Product(2,"Laptop",150000);
        Product product=new Product();
      System.out.println( service.getAllProduct());
        System.out.println("List of All product");
        
    }
}

