package classExample;

public abstract class Student {
	private String name;
	private int Id;
	private float cgpa;
	
	

	public Student(String name, int Id, float cgpa) {
		this.name = name;
		this.Id = Id;
		this.cgpa = cgpa;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}



	public float getCgpa() {
		return cgpa;
	}


	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	public abstract void StateRecord();



	public static void main(String[] args) {
		// TODO Auto-generated method stub changed here

	}

}

