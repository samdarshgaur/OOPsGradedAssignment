package departments;

public class Admin extends Super {
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your document submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
