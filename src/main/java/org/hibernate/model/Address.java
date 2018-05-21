package org.hibernate.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String postcode;// 邮编
    private String address;// 地址
    private String telephone;// 电话
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
