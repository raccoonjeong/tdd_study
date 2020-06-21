package more;

public class Employee {
	private String name;
	private String empId;
	private String id;
	private String position;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPosition() {
		return position;
	}

	
	public Employee() {
		super();
	}

	public Employee(String name, String empId, String id, String position) {
		super();
		this.name = name;
		this.empId = empId;
		this.id = id;
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", id=" + id + ", position=" + position + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}


}
