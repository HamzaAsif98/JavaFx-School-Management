package Test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.Student;

class test1 {
		Student s1;
	@BeforeEach
	void setUp() throws Exception {
	s1 = new Student ("Colan","Michael","Barry","colan@mycit.ie",231,"23-03-1989");
	}

	@Test
	void test() {
		assertTrue("Cannot be null",(s1.getEmail()!=null));
		assertTrue("Cannot be null",(s1.getDob()!=null));
		assertTrue("Cannot be null",(s1.getFirstName()!=null));
		assertTrue("Cannot be null",(s1.getLastName()!=null));
		assertTrue("Cannot be null",(s1.getMiddleName()!=null));
		
	}

}
