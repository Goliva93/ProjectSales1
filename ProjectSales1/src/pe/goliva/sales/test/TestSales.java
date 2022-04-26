package pe.goliva.sales.test;

import pe.goliva.sales.*;

/**
 *
 * @author	: Giomar Oliva
 * @date	: 25 abr 2022
 * 
 */
public class TestSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1 = new Product("Camisa",50);
		System.out.println(product1.toString());	
		Client client1 = new Client("Giomar");
		System.out.println(client1.toString());
	}

}
