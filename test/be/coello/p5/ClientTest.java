package be.coello.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTest {

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
	void testToString() {
		Client c = new Client("robin", "coello", 1020, 0); 
		
		String ex = "Client [clientRef=1020, solde=0, lastname=coello, name=robin]"; 		
		
		assertEquals(ex, c.toString() );
		
	}

}
