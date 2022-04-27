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
		
		Product product1 = new Product("Camisa	",50);
		Product product2 = new Product("Pantalon	",100);
		Client client1 = new Client("Giomar");
		Order order1 = new Order();
		order1.addClient(client1);
		order1.addProduct(product1, 1);
		order1.addProduct(product2, 2);
		order1.viewOrder();
	}

}
