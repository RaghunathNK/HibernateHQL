package com.ty.HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
	private int oId;
	private String oName;
	private String oDestination;
	
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public String getoDestination() {
		return oDestination;
	}
	public void setoDestination(String oDestination) {
		this.oDestination = oDestination;
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId + ", oName=" + oName + ", oDestination=" + oDestination + "]";
	}
}
