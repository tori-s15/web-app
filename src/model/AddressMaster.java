package model;

public class AddressMaster {
	private int id;
	private String name;
	private String address;
//	private String key;

	public AddressMaster(int id,String name,String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}


}
