package rs.ac.bg.fon.nprog.mvnbiblioteka.biblioteka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import biblioteka.interfejs.BibliotekaInterfaceTest;
import rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.Biblioteka;

class BibliotekaTest extends BibliotekaInterfaceTest {

	@BeforeEach
	void setUp() throws Exception {
		biblioteka = new Biblioteka();
	}
	
	 
	@AfterEach
	void tearDown() throws Exception {
		biblioteka = null;
	}

	@Test
	void test() {
	}

}
