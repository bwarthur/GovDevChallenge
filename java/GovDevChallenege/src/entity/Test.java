package entity;

import com.googlecode.objectify.annotation.Entity;

@Entity
public class Test {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
