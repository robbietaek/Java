package test20190916;

public class KKTFAMILY {
	private int no;
	private String name;
	private int age;
	private String job;
	private int gender;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "KKTFAMILY [no=" + no + ", name=" + name + ", age=" + age + ", job=" + job + ", gender=" + gender + "]";
	}

	public KKTFAMILY(int no, String name, int age, String job, int gender) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
	}

	public KKTFAMILY(String name, int age, String job, int gender) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
	}

}
