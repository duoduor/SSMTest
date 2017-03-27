package wdd.dto;

public class Customer {
	
	private  int customerId;
	private  int storeId;
	private String firstName;
	private String	lastName;
	private String  email;
	private int cursor;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public int getCursor() {
		return cursor;
	}
	public void setCursor(int cursor) {
		this.cursor = cursor;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", storeId=" + storeId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + "]";
	}


	
	
	
			
//private int	customer_id	smallint(5) unsigned	NO	PRI		auto_increment
//	store_id	tinyint(3) unsigned	NO	MUL		
//	first_name	varchar(45)	NO			
//	last_name	varchar(45)	NO	MUL		
//	email	varchar(50)	YES	
	
	
//	address_id	smallint(5) unsigned	NO	MUL		
//	active	tinyint(1)	NO		1	
//	create_date	datetime	NO			
//	last_update	timestamp	NO		CURRENT_TIMESTAMP	on update CURRENT_TIMESTAMP

}
