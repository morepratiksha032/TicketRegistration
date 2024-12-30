package com.advanto.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Buses {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bId;
	String bName;
	String bNo;
	String type;
	public Buses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Buses(int bId, String bName, String bNo, String type) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bNo = bNo;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Buses [bId=" + bId + ", bName=" + bName + ", bNo=" + bNo + ", type=" + type + "]";
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
