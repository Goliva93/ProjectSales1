package pe.goliva.sales;

/**
 *
 * @author : Giomar Oliva
 * @date : 25 abr 2022
 * 
 */
public class Product {
	private int idProduct;
	private String nameProduct;
	private double priceProduct;
	private static int countProduct;

	public Product() {
		super();
		idProduct = ++ countProduct;
	}

	public Product(String nameProduct, double priceProduct) {
		this();
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public int getIdProduct() {
		return idProduct;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [ idProduct= ");
		builder.append(idProduct);
		builder.append(", nameProduct= ");
		builder.append(nameProduct);
		builder.append(", priceProduct= ");
		builder.append(priceProduct);
		builder.append(" ]");
		return builder.toString();
	}
	
}
