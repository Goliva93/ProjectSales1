package pe.goliva.sales;

/**
 *
 * @author : Giomar Oliva
 * @date : 25 abr 2022
 * 
 */
public class Client {
	private int idClient;
	private String nameClient;
	private static int countClient;

	private Client() {
		super();
		idClient = ++ countClient;
	}

	public Client(String nameClient) {
		this();
		this.nameClient = nameClient;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public int getIdClient() {
		return idClient;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [ idClient= ");
		builder.append(idClient);
		builder.append(", nameClient= ");
		builder.append(nameClient);
		builder.append(" ]");
		return builder.toString();
	}
	
	
	
}
