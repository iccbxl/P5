package be.coello.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

	Person p = new Person("Robinson", "Coello"); 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPerson() {
		//fail("Not yet implemented");		
		assertEquals("Robinson", p.getName());
	}

	@Test
	void testPersonStringString() {
		//fail("Not yet implemented");
	}

	@Test
	void testGetName() {
		//fail("Not yet implemented");
	}

	@Test
	void testSetName() {
		//fail("Not yet implemented");
	}

	@Test
	void testGetLastname() {
		//fail("Not yet implemented");
	}

	@Test
	void testSetLastname() {
		//fail("Not yet implemented");
	}

	@Test
	void testToString() {
		//fail("Not yet implemented");
	}

}
