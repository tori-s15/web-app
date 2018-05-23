package model;

public class AddressMaster {
	private int id;
	private String name;
	private String address;
	private String key;

	public AddressMaster(String key) {
		this.key = key;
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

	public void run() {
		this.id = 1;
		this.name = "XYZ" + this.key;
		this.address = "東平山";
	}

}
