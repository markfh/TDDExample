package it.rambow.fhb.tdd;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TestTemplateRefactored {
	private TextTemplate template;

	@Before
	public void setUp() throws Exception {
		template = new TextTemplate("${one}, ${two}, ${three}");
		template.set("one", "1");
		template.set("two", "2");
		template.set("three", "3");
	}
	@Test
	public void multipleVariables() throws Exception {
		assertTemplateEvaluatesTo("1, 2, 3");
	}
	@Test
	public void unknownVariablesAreIgnored() throws Exception {
		template.set("doesnotexist", "whatever");
		assertTemplateEvaluatesTo("1, 2, 3");
	}
	private void assertTemplateEvaluatesTo(String expected) {
		assertEquals(expected, template.evaluate());
	}
}