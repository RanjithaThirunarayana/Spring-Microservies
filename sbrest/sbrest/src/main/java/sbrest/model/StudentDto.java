package sbrest.model;

public class StudentDto {
	
	private Integer id;
	
	private Integer birthYear;
	
	private Integer groupId;
	
	public StudentDto() {}
	
	public StudentDto(Student s) {
		id = s.getId();
		birthYear = s.getBirthYear();
		groupId = s.getGroupId();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

}
