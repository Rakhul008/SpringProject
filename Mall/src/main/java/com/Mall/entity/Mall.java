package com.Mall.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mall {
	@Id
	private int MallNo;
	private String MallName;
	private String MallCity;
	private String MallOpeningTime;
	private String MallCloseTime;
    private String MallContactNo;
	public int getMallNo() {
		return MallNo;
	}
	public void setMallNo(int mallNo) {
		MallNo = mallNo;
	}
	public String getMallName() {
		return MallName;
	}
	public void setMallName(String mallName) {
		MallName = mallName;
	}
	public String getMallCity() {
		return MallCity;
	}
	public void setMallCity(String mallCity) {
		MallCity = mallCity;
	}
	public String getMallOpeningTime() {
		return MallOpeningTime;
	}
	public void setMallOpeningTime(String mallOpeningTime) {
		MallOpeningTime = mallOpeningTime;
	}
	public String getMallCloseTime() {
		return MallCloseTime;
	}
	public void setMallCloseTime(String mallCloseTime) {
		MallCloseTime = mallCloseTime;
	}
	public String getMallContactNo() {
		return MallContactNo;
	}
	public void setMallContactNo(String mallContactNo) {
		MallContactNo = mallContactNo;
	}
}
