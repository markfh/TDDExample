package it.rambow.fhb.tdd;

import static org.junit.Assert.*;

import org.junit.Test;


public class PlainTemplateTest {
	@Test
	public void oneVariable() throws Exception {
		TemplatePlain template = new TemplatePlain("Hello, ${name}");
		template.set("name", "Prof. Schmidt");
		assertEquals("Hello, Prof. Schmidt", template.evaluate());
	}
	
	@Test
	public void differentValue() throws Exception {
		TemplatePlain template = new TemplatePlain("Hello, ${name}");
		template.set("name", "someone else");
		assertEquals("Hello, someone else", template.evaluate());
	}

	@Test
	public void differentTemplate() throws Exception {
		TemplatePlain template = new TemplatePlain("Hi, ${name}");
		template.set("name", "someone else");
		assertEquals("Hi, someone else", template.evaluate());
	}
}

