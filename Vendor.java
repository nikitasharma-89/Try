package Package;

import java.util.Set;

public class Vendor {
	
	private int vendorId;
	 private String vendorName;
	 private Set Customerchildren;
	 
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Set getCustomerchildren() {
		return Customerchildren;
	}
	public void setCustomerchildren(Set customerchildren) {
		Customerchildren = customerchildren;
	}

}
