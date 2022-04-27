package pe.goliva.sales;

/**
 *
 * @author	: Giomar Oliva
 * @date	: 25 abr 2022
 * 
 */
public class Order {
	private int idOrder;
	private Product products[];
	private Client clients[];
	private int countOrder;
	private int countClient;
	private final static int MAX_PRODUCTS = 10;
	private int countProduct;
	private int cantProduct[] = new int[MAX_PRODUCTS];
	
	public Order() {
		super();
		idOrder = ++ countOrder;
		products = new Product[MAX_PRODUCTS];
		clients = new Client[1];
	}
	
	public void addClient(Client client) {
		if(countClient < 1 ) {
			clients[countClient ++] = client; 
		}else {
			System.out.println("no se puede añadir más clientes");
		}
	}
	
	public void addProduct(Product product,int cantProduct) {
		if(cantProduct < 1) {
			System.out.println("la cantidad debe ser mayor a 1");
		}else {
			if(countProduct < MAX_PRODUCTS) {
				products[countProduct] = product;
				this.cantProduct[countProduct++] = cantProduct;
			}else {
				System.out.println(" no se puede añadir más productos a la orden");
			}
		}

	}
	
	public double calculateTotal() {
		double total = 0.0;
		for (int i = 0; i < countProduct; i++) {
			total += cantProduct[i] * products[i].getPriceProduct();
		}
		return total;
	}
	
	public void viewOrder() {
		System.out.println("Número de orden: " + idOrder);
		System.out.println("Nombre Cliente: " + clients[0].getNameClient());
		for(int i = 0; i < countProduct; i++) {
			System.out.println((i+1) + " Producto: " + products[i].getNameProduct() +
								" Cantidad: " + cantProduct[i] + 
								" valor Unitario: " + products[i].getPriceProduct() + 
								" valor neto : " + (products[i].getPriceProduct() * cantProduct[i]));
		}
		System.out.println("Total a pagar: " + calculateTotal());
	}
	
}
