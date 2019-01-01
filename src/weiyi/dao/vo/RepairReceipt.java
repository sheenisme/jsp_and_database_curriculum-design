package weiyi.dao.vo;

import java.util.Date;

public class RepairReceipt {
	private int receiptID;
	private String orderID;;
	private int adminID;
	private Date repairTime;
	private boolean isNeedParts;
	private String partsType;
	private String resolvent;
	private String advise;
	private String remark;
	public int getReceiptID() {
		return receiptID;
	}
	public void setReceiptID(int receiptID) {
		this.receiptID = receiptID;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public Date getRepairTime() {
		return repairTime;
	}
	public void setRepairTime(Date repairTime) {
		this.repairTime = repairTime;
	}
	public boolean isNeedParts() {
		return isNeedParts;
	}
	public void setNeedParts(boolean isNeedParts) {
		this.isNeedParts = isNeedParts;
	}
	public String getPartsType() {
		return partsType;
	}
	public void setPartsType(String partsType) {
		this.partsType = partsType;
	}
	public String getResolvent() {
		return resolvent;
	}
	public void setResolvent(String resolvent) {
		this.resolvent = resolvent;
	}
	public String getAdvise() {
		return advise;
	}
	public void setAdvise(String advise) {
		this.advise = advise;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
