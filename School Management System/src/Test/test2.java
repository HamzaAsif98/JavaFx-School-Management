package Test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.Modules;
import Model.Name;

class test2 {
	Name n1;
	@BeforeEach
	void setUp() throws Exception {
	n1 = new Name ("Hamza","Ali","Khan");
	}

	@Test
	void test() {
		assertTrue("Cannot be null",(n1.getFirstName()!=null));
		assertTrue("Cannot be null",(n1.getMiddleName()!=null));
		assertTrue("Cannot be null",(n1.getLastName()!=null));
	}

}
