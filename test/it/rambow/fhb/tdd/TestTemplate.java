package it.rambow.fhb.tdd;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestTemplate {
	@Test
	public void oneVariable() throws Exception {
		Template template = new Template("Hello, ${name}");
		template.set("name", "Prof. Schmidt");
		assertEquals("Hello, Prof. Schmidt", template.evaluate());
	}
	
	@Test
	public void differentValue() throws Exception {
		Template template = new Template("Hello, ${name}");
		template.set("name", "Students");
		assertEquals("Hello, Students", template.evaluate());
	}
	
	@Test
	public void multipleVariables() throws Exception {
		TextTemplate template = new TextTemplate("${one}, ${two}, ${three}");
		template.set("one", "1");
		template.set("two", "2");
		template.set("three", "3");
		assertEquals("1, 2, 3", template.evaluate());
	}
/*	
	@Test
	public void unknownVariablesAreIgnored() throws Exception {
		TextTemplate template = new TextTemplate("Hello, ${name}");
		template.set("name", "Reader");
		template.set("doesnotexist", "Hi");
		assertEquals("Hello, Reader", template.evaluate());
	}
*/
}