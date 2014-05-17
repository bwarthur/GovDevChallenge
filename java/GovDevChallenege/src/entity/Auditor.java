package entity;

import java.util.Date;

public class Auditor {
	private Date paymentDate;
    private float warrantEFTAmt;
    private String warrantEFTAmtSign;
    private float lineAmt;
    private String lineAmtSign;
    private String vendor;
    private String vendorName;
    private String dept;
    private String document;
    private String invoice;
    private String paymentDescription;
    private String deptName;
    private String deptContact;
    private String warrantEFT;
    private String type;
    
    public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getWarrantEFTAmt() {
		return warrantEFTAmt;
	}
	public void setWarrantEFTAmt(float warrantEFTAmt) {
		this.warrantEFTAmt = warrantEFTAmt;
	}
	public String getWarrantEFTAmtSign() {
		return warrantEFTAmtSign;
	}
	public void setWarrantEFTAmtSign(String warrantEFTAmtSign) {
		this.warrantEFTAmtSign = warrantEFTAmtSign;
	}
	public float getLineAmt() {
		return lineAmt;
	}
	public void setLineAmt(float lineAmt) {
		this.lineAmt = lineAmt;
	}
	public String getLineAmtSign() {
		return lineAmtSign;
	}
	public void setLineAmtSign(String lineAmtSign) {
		this.lineAmtSign = lineAmtSign;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getPaymentDescription() {
		return paymentDescription;
	}
	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptContact() {
		return deptContact;
	}
	public void setDeptContact(String deptContact) {
		this.deptContact = deptContact;
	}
	public String getWarrantEFT() {
		return warrantEFT;
	}
	public void setWarrantEFT(String warrantEFT) {
		this.warrantEFT = warrantEFT;
	}
}
