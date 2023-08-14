package com.reset.FruitsnVegiesRegistration.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FruitsAndVegetables")
public class FruitsAndVegies {
	
	@Id
	private int fruitsnvegiesid;
	private String fnvname;
	private String quantity;
	private String quality;
	private String cut_date;
	private String package_date;
	
	
	public int getFruitsnvegiesid() {
		return fruitsnvegiesid;
	}
	public void setFruitsnvegiesid(int fruitsnvegiesid) {
		this.fruitsnvegiesid = fruitsnvegiesid;
	}
	public String getFnvname() {
		return fnvname;
	}
	public void setFnvname(String fnvname) {
		this.fnvname = fnvname;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getCut_date() {
		return cut_date;
	}
	public void setCut_date(String cut_date) {
		this.cut_date = cut_date;
	}
	public String getPackage_date() {
		return package_date;
	}
	public void setPackage_date(String package_date) {
		this.package_date = package_date;
	}
	public FruitsAndVegies(int fruitsnvegiesid, String fnvname, String quantity, String quality, String cut_date,
			String package_date) {
		super();
		this.fruitsnvegiesid = fruitsnvegiesid;
		this.fnvname = fnvname;
		this.quantity = quantity;
		this.quality = quality;
		this.cut_date = cut_date;
		this.package_date = package_date;
	}
	public FruitsAndVegies() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FruitsAndVegies [fruitsnvegiesid=" + fruitsnvegiesid + ", fnvname=" + fnvname + ", quantity=" + quantity
				+ ", quality=" + quality + ", cut_date=" + cut_date + ", package_date=" + package_date
				+ ", getFruitsnvegiesid()=" + getFruitsnvegiesid() + ", getFnvname()=" + getFnvname()
				+ ", getQuantity()=" + getQuantity() + ", getQuality()=" + getQuality() + ", getCut_date()="
				+ getCut_date() + ", getPackage_date()=" + getPackage_date() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
