package sessions.s10.collections;

import java.io.Serializable;

public class Car implements Serializable {
	private static final long serialVersionUID = 1L;

	private String brand;
	private String model;
	private int year;

	public Car(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String toString() {
		return "" + year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

}
