package P2_Annotations;

public class Ex1_Employee {
	
	int empID;
	String empName;
	String Address;
	String designation;
	
	
	public Ex1_Employee() {
		super();
		
	}

	public Ex1_Employee(int empID, String empName, String address, String designation) {
		super();
		this.empID = empID;
		this.empName = empName;
		Address = address;
		this.designation = designation;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Ex1_Employee [empID=" + empID + ", empName=" + empName + ", Address=" + Address + ", designation="
				+ designation + "]";
	}
	
	

}
