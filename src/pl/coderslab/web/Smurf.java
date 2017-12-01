package pl.coderslab.web;

public class Smurf {
	
	private String name;
	private String attribute;
	private String description;
	
	public Smurf(String name, String attribute, String description) {
		super();
		this.name = name;
		this.attribute = attribute;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Smurf [name=" + name + ", attribute=" + attribute + ", description=" + description + "]";
	}
	
	
	
	

}
