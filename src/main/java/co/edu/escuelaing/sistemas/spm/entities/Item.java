package co.edu.escuelaing.sistemas.spm.entities;

public class Item {

	private final String name;

	private final Boolean resolved;

	public Item(String name, Boolean resolved) {
		this.name = name;
		this.resolved = resolved;
	}

	public String getName() {
		return name;
	}

	public Boolean getResolved() {
		return resolved;
	}
}
