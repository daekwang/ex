package java0803_jdbc;

//Data Transfer Object(DTO) : 데이터 관리 객체
//Variable Object(VO)->DTO로 변함
//하나의 테이블의 컬럼들을 객체로 묶어주기 위한것이 DTO라고 생각하면된다

public class DepartmentDTO {
	private int department_id;
	private String department_name;
	private int manager_id;
	private int location_id;
	//실제 테이블의 타입을 확인해준다 (number->int, char->String)
	
	public DepartmentDTO() {
		
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	
	
	
}//end class
