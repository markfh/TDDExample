package it.rambow.fhb.tdd;

public class TemplatePlain {
	private String replacement;
	private String variable;
	
	public TemplatePlain(String template) {
	}

	public void set(String variable, String replacement) {
		this.replacement = replacement;
		this.variable = variable;
	}

	public String evaluate() {
		return "Hello, " + this.replacement;
	}

}
