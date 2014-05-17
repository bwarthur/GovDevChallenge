package entity;

import java.util.Date;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class Auditor {
	@Id
	private Long id;
	@Index
	private Date paymentDate;
	@Index
    private float warrantEFTAmt;
	@Index
    private String warrantEFTAmtSign;
	@Index
    private float lineAmt;
	@Index
    private String lineAmtSign;
	@Index
    private String vendor;
	@Index
    private String vendorName;
	@Index
    private String dept;
	@Index
    private String document;
	@Index
    private String invoice;
	@Index
    private String paymentDescription;
	@Index
    private String deptName;
	@Index
    private String deptContact;
	@Index
    private String warrantEFT;
	@Index
    private String type;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
