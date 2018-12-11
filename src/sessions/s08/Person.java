package sessions.s08;

public class Person {
	public final int x = 1;
	private String cnp;
	private String name;
	private String age;

	public Person(String cnp, String name, String age) {
		super();
		this.cnp = cnp;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [cnp=" + cnp + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnp == null) ? 0 : cnp.hashCode());
		return result;
	}

//	public boolean equals(Person p) {
//		return true;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (cnp == null) {
			if (other.cnp != null)
				return false;
		} else if (!cnp.equals(other.cnp))
			return false;
		return true;
	}

}
