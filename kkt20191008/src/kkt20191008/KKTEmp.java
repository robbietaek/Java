package kkt20191008;

class KKTEmp {
	
	private String name; // �̸�
	private String work; // ����
	private String position; // ����
	private int age; // ����
	
	public KKTEmp(String name, String work, String position, int age) {
		this.name = name;
		this.work = work;
		this.position = position;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getWork() {
		return work;
	}

	public String getPosition() {
		return position;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "������=" + name + ", ����=" + work + ", ����=" + position + ", ����=" + age;
	}
	
	

}