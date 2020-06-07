package user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller")
public class Seller {
	@Id
	@Column(name = "SELLERID",nullable = false)
	private Integer sellerId;
	
	@Column(name = "NAME",nullable = false)
	private String name;
	
	@Column(name = "EMAIL",nullable = false)
	private String email;
	
	@Column(name = "PHONENUMBER",nullable = false)
	private String phoneNumber;
	
	@Column(name = "PASSWORD",nullable = false)
	private String password;
	
	@Column(name = "ISACTIVE")
	private Boolean isActive;
	
	//constructor

	public Seller() {
		super();
	}
	
	
	public Seller(Integer sellerId, String name, String email, String phoneNumber, String password, Boolean isActive) {
		this.sellerId = sellerId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.isActive = isActive;
	}

	//getters/setters
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	//toString
	
	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + ", isActive=" + isActive + "]";
	}
	
}
