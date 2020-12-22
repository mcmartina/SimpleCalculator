package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcolatriceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test //le asserzioni sono delle chiamate che servono per verificare se dei test sono passati o sono falliti
	void testSomma() {
		Calcolatrice c = new Calcolatrice(); //qui scriviamo quello che dovremmo scrivere nel main
		int risultato = c.add(3, 5); //3 e 5 sarebbero x e y
		int risultatoAtteso = 8; //devo scriverlo io
		assertEquals(risultatoAtteso, risultato, "Somma sbagliata");
//		fail("Not yet implemented");
	}
	
//	@Test //le asserzioni sono delle chiamate che servono per verificare se dei test sono passati o sono falliti
//	void testSomma1() {
//		Calcolatrice c = new Calcolatrice(); //qui scriviamo quello che dovremmo scrivere nel main
//		int risultato = c.add(0, 5); //3 e 5 sarebbero x e y
//		int risultatoAtteso = 8; //devo scriverlo io
//		assertEquals(risultatoAtteso, risultato, "Somma sbagliata");
////		fail("Not yet implemented");
//	}
	@Test
	void testDifferenza() {
		Calcolatrice c = new Calcolatrice(); //qui scriviamo quello che dovremmo scrivere nel main
		int risultato = c.sub(7, 5); //3 e 5 sarebbero x e y
		int risultatoAtteso = 2; //devo scriverlo io
		assertEquals(risultato, risultatoAtteso, "Differenza sbagliata");
//		fail("Not yet implemented");
	}
	@Test
	void testMoltiplicazione() {
		Calcolatrice c = new Calcolatrice(); //qui scriviamo quello che dovremmo scrivere nel main
		int risultato = c.mul(2, 7); //3 e 5 sarebbero x e y
		int risultatoAtteso = 14; //devo scriverlo io
		assertEquals(risultatoAtteso, risultato, "Moltiplicazione sbagliata");
//		fail("Not yet implemented");
	}
	@Test
	void testDivisione1() {
		Calcolatrice c = new Calcolatrice(); //qui scriviamo quello che dovremmo scrivere nel main
		int risultato = c.div(5, 2); //3 e 5 sarebbero x e y
		int risultatoAtteso = 2; //devo scriverlo io
		assertEquals(risultatoAtteso, risultato, "Divisione sbagliata");
//		fail("Not yet implemented");
	}
	@Test
	void testDivisione2() {
		Calcolatrice c = new Calcolatrice(); //qui scriviamo quello che dovremmo scrivere nel main
		int risultato = c.div(5, 0); //3 e 5 sarebbero x e y
		int risultatoAtteso = Integer.MAX_VALUE; //devo scriverlo io
		assertEquals(risultatoAtteso, risultato, "Divisione sbagliata");
//		fail("Not yet implemented");
	}
	
	@Test
	void testMCD() {
		Calcolatrice c = new Calcolatrice(); //qui scriviamo quello che dovremmo scrivere nel main
		int risultato = c.gcd(125, 0); 
		int risultatoAtteso = 125; //devo scriverlo io
		assertEquals(risultatoAtteso, risultato, "Calcolo MCD sbagliato");
//		fail("Not yet implemented");
	}
	
	@Test
	void testMCD2() {
		Calcolatrice c = new Calcolatrice(); //qui scriviamo quello che dovremmo scrivere nel main
		int risultato = c.gcd(125, 55); //3 e 5 sarebbero x e y
		int risultatoAtteso = 15; //devo scriverlo io
		assertEquals(risultatoAtteso, risultato, "Calcolo MCD sbagliato");
//		fail("Not yet implemented");
	}
	@Test
	void testMCD3() {
		Calcolatrice c = new Calcolatrice(); //qui scriviamo quello che dovremmo scrivere nel main
		int risultato = c.gcd(126, 147); //3 e 5 sarebbero x e y
		int risultatoAtteso = 21; //devo scriverlo io
		assertEquals(risultatoAtteso, risultato, "Calcolo MCD sbagliato");
//		fail("Not yet implemented");
	}
	
	@Test
	void testMCD4() {
		Calcolatrice c = new Calcolatrice(); //qui scriviamo quello che dovremmo scrivere nel main
		int risultato = c.gcd(126, 126); //3 e 5 sarebbero x e y
		int risultatoAtteso = 126; //devo scriverlo io
		assertEquals(risultatoAtteso, risultato, "Calcolo MCD sbagliato");
	}
	
	@Test
	void testMCD5() {
		Calcolatrice c = new Calcolatrice(); //qui scriviamo quello che dovremmo scrivere nel main
		int risultato = c.gcd(0, 126); //3 e 5 sarebbero x e y
		int risultatoAtteso = 126; //devo scriverlo io
		assertEquals(risultatoAtteso, risultato, "Calcolo MCD sbagliato");
	}

}
