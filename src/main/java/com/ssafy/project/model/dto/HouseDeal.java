package com.ssafy.project.model.dto;

 

public class HouseDeal implements  Comparable<HouseDeal> {
	public static String  APT_DEAL="아파트 매매";
	public static String  APT_RENT="아파트 전월세";
	public static String  HOUSE_DEAL="연립,주택 매매";
	public static String  HOUSE_RENT="연립,주택 전월세"; 
	private int    no; 
	private String dong; 
	private String aptName; 
	private int code; 
	private String dealAmount; 
	private int buildYear; 
	private int dealYear; 
	private int dealMonth; 
	private int dealDay; 
	private double area; 
	private int floor; 
	private String lat;
	private String lng;
	private String jibun; 
	private String type;
	private String rentMoney;
	
	private String img;
	public HouseDeal() {	}
	public HouseDeal(int no) {
		super();
		this.no = no;
	}
	
	
	public HouseDeal(String dong, String aptName, int code, String dealAmount, int buildYear, int dealYear,
			int dealMonth, int dealDay, double area, int floor, String lat, String lng, String jibun, String type) {
		super();
		this.dong = dong;
		this.aptName = aptName;
		this.code = code;
		this.dealAmount = dealAmount;
		this.buildYear = buildYear;
		this.dealYear = dealYear;
		this.dealMonth = dealMonth;
		this.dealDay = dealDay;
		this.area = area;
		this.floor = floor;
		this.lat = lat;
		this.lng = lng;
		this.jibun = jibun;
		this.type = type;
	}
	
	public HouseDeal(String dong, String aptName, int code, String dealAmount, int buildYear, int dealYear, int dealMonth,
			int dealDay, double area, int floor, String jibun) {
		super();
		this.dong = dong;
		this.aptName = aptName;
		this.code = code;
		this.dealAmount = dealAmount;
		this.buildYear = buildYear;
		this.dealYear = dealYear;
		this.dealMonth = dealMonth;
		this.dealDay = dealDay;
		this.area = area;
		this.floor = floor;
		this.jibun = jibun;
	}
//	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	
	public String getAptName() {
		return aptName;
	}
	public void setAptName(String aptName) {
		this.aptName = aptName;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getDealAmount() {
		return dealAmount;
	}
	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}
	public int getBuildYear() {
		return buildYear;
	}
	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}
	public int getDealYear() {
		return dealYear;
	}
	public void setDealYear(int dealYear) {
		this.dealYear = dealYear;
	}
	public int getDealMonth() {
		return dealMonth;
	}
	public void setDealMonth(int dealMonth) {
		this.dealMonth = dealMonth;
	}
	public int getDealDay() {
		return dealDay;
	}
	public void setDealDay(int dealDay) {
		this.dealDay = dealDay;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getJibun() {
		return jibun;
	}
	public void setJibun(String jibun) {
		this.jibun = jibun;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRentMoney() {
		return rentMoney;
	}
	public void setRentMoney(String rentMoney) {
		this.rentMoney = rentMoney;
	}
	
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public int compareTo(HouseDeal o) {
		if(o!=null && o.dong != null&&dong!=null) {
			return dong.compareTo(o.dong);
		}
		return 0;
	}
	@Override
	public String toString() {
		return "HouseDeal [no=" + no + ", dong=" + dong + ", AptName=" + aptName + ", code=" + code + ", dealAmount="
				+ dealAmount + ", buildYear=" + buildYear + ", dealYear=" + dealYear + ", dealMonth=" + dealMonth
				+ ", dealDay=" + dealDay + ", area=" + area + ", floor=" + floor + ", lat=" + lat + ", lng=" + lng
				+ ", jibun=" + jibun + ", type=" + type + ", rentMoney=" + rentMoney + ", img=" + img + "]";
	}
	
}






