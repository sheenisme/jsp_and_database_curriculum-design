package weiyi.dao.vo;

import java.sql.Date;

public class EvaluationRecord {
	private int evaluateID;
	private String orderID;
	private int userID;
	private int adminID;
	private Date evaluateDate;
	private int starLevel;
	private String Context;
	private String remark;
	public int getEvaluateID() {
		return evaluateID;
	}
	public void setEvaluateID(int evaluateID) {
		this.evaluateID = evaluateID;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public int getStarLevel() {
		return starLevel;
	}
	public void setStarLevel(int starLevel) {
		this.starLevel = starLevel;
	}
	public Date getEvaluateDate() {
		return evaluateDate;
	}
	public void setEvaluateDate(Date evaluateDate) {
		this.evaluateDate = evaluateDate;
	}
	public String getContext() {
		return Context;
	}
	public void setContext(String context) {
		Context = context;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
