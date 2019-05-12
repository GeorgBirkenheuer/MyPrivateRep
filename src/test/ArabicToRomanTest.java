package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import roman.ArabicToRoman;
import roman.RomanToArabic;

class ArabicToRomanTest {

	@Test
	void testEins() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("I", rta.convert(1,""));
	}
	
	@Test
	void testZwei() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("II", rta.convert(2,""));
	}
	
	@Test
	void testDrei() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("III", rta.convert(3,""));
	}

	@Test
	void testVier() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("IV", rta.convert(4,""));
	}
	
	@Test
	void testFünf() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("V", rta.convert(5,""));
	}
	
	@Test
	void testAcht() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("VIII", rta.convert(8,""));
	}

	@Test
	void testNeun() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("IX", rta.convert(9,""));
	}
	
	@Test
	void testZehn() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("X", rta.convert(10,""));
	}

	@Test
	void testVierZehn() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("XIV", rta.convert(14,""));
	}
	
	@Test
	void testNeunZehn() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("XIX", rta.convert(19,""));
	}
	
	@Test
	void test39() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("XXXIX", rta.convert(39,""));
	}	
	
	@Test
	void test40() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("XL", rta.convert(40,""));
	}
	
	@Test
	void test49() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("XLIX", rta.convert(49,""));
	}
	
	@Test
	void test99() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("XCIX", rta.convert(99,""));
	}

	@Test
	void test199() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("CXCIX", rta.convert(199,""));
	}
	
	@Test
	void test499() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("CDXCIX", rta.convert(499,""));
	}
	
	
	@Test
	void test999() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("CMXCIX", rta.convert(999,""));
	}
	
	@Test
	void test1000() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("M", rta.convert(1000,""));
	}
	
	@Test
	void test13789() {
		ArabicToRoman rta = new ArabicToRoman();
		assertEquals("MMMMMMMMMMMMMDCCLXXXIX" , rta.convert(13789,""));
	
		
	}
	
}
