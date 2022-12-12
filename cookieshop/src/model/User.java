package model;

public class User {
	private int id;
	private String username;
	private String email;
	private String password;
	private String name;
	private String phone;
	private String address;
	private boolean isadmin;
	private boolean isvalidate;
	
	//构造方法在需要时去补充
	//查询
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isIsadmin() {
		return isadmin;
	}
	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}
	public boolean isIsvalidate() {
		return isvalidate;
	}
	public void setIsvalidate(boolean isvalidate) {
		this.isvalidate = isvalidate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", name="
				+ name + ", phone=" + phone + ", address=" + address + ", isadmin=" + isadmin + ", isvalidate="
				+ isvalidate + "]";
	}

}
