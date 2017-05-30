package de.marzeckm;

import org.junit.Test;

import static org.junit.Assert.*;

public class jUnitTest {
	@Test
	public void TestIstErstesHalbjahr(/*int monat*/) {
		 final int monat = 5;
		 final boolean sollWert = true;
		 assertEquals(sollWert, Util.istErstesHalbjahr(monat));
	} 
}
