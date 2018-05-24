package model;

public class AddressMaster {
	private int id;
	private String name;
	private String address;
	private String key;

	private final String DB_NAME = "webdb";
	private final String DB_USER = "webap";
	private final String DB_PASS = "webap";

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
		SelectAddressMaster master = new SelectAddressMaster();

		String result = master.run();

		this.id = 1;
		this.name = "XYZ" + this.key;
		this.address = result;
	}

}
