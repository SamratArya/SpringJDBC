package P1_Basic;

public class Ex1_Student {
	
	int studentID;
	String studentName;
	String address;
	String DOB;
	
	public Ex1_Student(int studentID, String studentName, String address, String dOB) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.address = address;
		DOB = dOB;
	}

	public Ex1_Student() {
		
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "Ex1_Student [studentID=" + studentID + ", studentName=" + studentName + ", address=" + address
				+ ", DOB=" + DOB + "]";
	}
	
	

}
