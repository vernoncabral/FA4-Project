package user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buyer")
public class Buyer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BUYERID",nullable = false)
	private Integer buyerId;
	
	@Column(name = "NAME",nullable = false)
	private String name;
	
	@Column(name = "EMAIL",nullable = false)
	private String email;
	
	@Column(name = "PHONENUMBER",nullable = false)
	private String phoneNumber;
	
	@Column(name = "PASSWORD",nullable = false)
	private String password;
	
	@Column(name = "ISPRIVILEGED")
	private Boolean isPrivileged;
	
	@Column(name = "REWARDPOINTS")
	private Integer rewardPoints;
	
	@Column(name = "ISACTIVE")
	private Boolean isActive;

	//constructor
	
	public Buyer() {
		super();
	}
	
	
	public Buyer(String name, String email, String phoneNumber, String password, Boolean isPrivileged, int rewardPoints,
			Boolean isActive) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.isPrivileged = isPrivileged;
		this.rewardPoints = rewardPoints;
		this.isActive = isActive;
	}

	//Getters and Setters
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
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

	public Boolean getIsPrivileged() {
		return isPrivileged;
	}
	public void setIsPrivileged(Boolean isPrivileged) {
		this.isPrivileged = isPrivileged;
	}
	
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	//Converting into string
	@Override
	public String toString() {
		return "Buyer [buyerId=" + buyerId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + ", isPrivileged=" + isPrivileged + ", rewardPoints=" + rewardPoints
				+ ", isActive=" + isActive + "]";
	}

}

