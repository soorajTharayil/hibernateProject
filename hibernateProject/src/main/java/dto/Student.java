package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    
	@Id
	private int Student_id;
	private String Student_name;
	private String Student_branch;
	
	
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getStudent_branch() {
		return Student_branch;
	}
	public void setStudent_branch(String student_branch) {
		Student_branch = student_branch;
	}
	@Override
	public String toString() {
		return "Student [Student_id=" + Student_id + ", Student_name=" + Student_name + ", Student_branch="
				+ Student_branch + "]";
	}
	
	
	
}
