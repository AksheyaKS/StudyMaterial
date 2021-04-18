package com.cg.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CurrencyConverterClient {

	public static void main(String args[]) throws Exception {
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno.xml");
		CurrencyConverter curr = (CurrencyConverter) factory.getBean("currencyConverterImpl");
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+" Rs.");
	}
}
