package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import roman.RomanToArabic;

class RomanToArabicTest {

	@Test
	void testEins() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(1, rta.convert("I",""));
	}
	
	@Test
	void testZwei() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(2, rta.convert("II",""));
	}

	@Test
	void testDrei() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(3, rta.convert("III",""));
	}

	@Test
	void testVier() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(4, rta.convert("IV",""));
	}
	
	@Test
	void testFünf() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(5, rta.convert("V",""));
	}
	
	@Test
	void testSechs() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(6, rta.convert("VI",""));
	}
	
	@Test
	void testSieben() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(7, rta.convert("VII",""));
	}
	
	@Test
	void testAcht() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(8, rta.convert("VIII",""));
	}

	@Test
	void testNeun() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(9, rta.convert("IX",""));
	}
	
	@Test
	void testZehn() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(10, rta.convert("X",""));
	}
	
	@Test
	void testElf() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(11, rta.convert("XI",""));
	}
	
	@Test
	void testVierzehn() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(14, rta.convert("XIV",""));
	}
	@Test
	void testNeunzehn() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(19, rta.convert("XIX",""));
	}
	
	@Test
	void testDreissig() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(30, rta.convert("XXX",""));
	}
	
	@Test
	void testVierzig() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(40, rta.convert("XL",""));
	}
	
	@Test
	void testEinUndVierzig() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(41, rta.convert("XLI",""));
	}
	
	@Test
	void testVierUndVierzig() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(44, rta.convert("XLIV",""));
	}

	@Test
	void testNeunUndVierzig() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(49, rta.convert("XLIX",""));
	}
	
	
	@Test
	void testFünfzig() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(50, rta.convert("L",""));
	}
	
	@Test
	void testNeunSndSibzig() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(79, rta.convert("LXXIX",""));
	}
	
	
	@Test
	void testAchtUndAchzig() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(88, rta.convert("LXXXVIII",""));
	}
	
	@Test
	void testNeunundNeunzig() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(99, rta.convert("XCIX",""));
	}	
	@Test
	void testHundert() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(100, rta.convert("C",""));
	}
	
	
	@Test
	void test149() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(149, rta.convert("CXLIX",""));
	}

	@Test
	void test379() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(379, rta.convert("CCCLXXIX",""));
	}
	
	
	@Test
	void test399() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(399, rta.convert("CCCXCIX",""));
	}
	
	@Test
	void test400() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(400, rta.convert("CD",""));
	}
	
	
	@Test
	void test495() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(495, rta.convert("CDXCV",""));
	}

	@Test
	void test499() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(499, rta.convert("CDXCIX",""));
	}
	
	@Test
	void test500() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(500, rta.convert("D",""));
	}
	
	
	@Test
	void test501() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(501, rta.convert("DI",""));
	}
	
	@Test
	void test800() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(800, rta.convert("DCCC",""));
	}
	
	@Test
	void test900() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(900, rta.convert("CM",""));
	}
	
	@Test
	void test1000() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(1000, rta.convert("M",""));
	}

	@Test
	void test13789() {
		RomanToArabic rta = new RomanToArabic();
		assertEquals(13789, rta.convert("MMMMMMMMMMMMMDCCLXXXIX",""));
	}
	
}
