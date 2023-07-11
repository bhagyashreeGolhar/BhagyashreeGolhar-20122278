package com;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HibernateCustomer")
public class Customer {

	@Id   												  //it will make cid as primary key
	@GeneratedValue(strategy = GenerationType.AUTO)       // it will generate sequence automatically for cid
	private int cid;
	@Column(name="CName")                             //column name in DB will "CName" for name
	private String cname;
	@Column(name="Place")                        //Column name will be "place" in DB
	private String place;
	@Column(name="Pan")                        //Column name will be "Pan" in DB
	private String pan;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}

}
