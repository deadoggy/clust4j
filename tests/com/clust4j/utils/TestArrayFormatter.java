package com.clust4j.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayFormatter {
	static void p(String s) {
		System.out.println(s);
	}

	@Test
	public void testTooSmall() {
		short[]s = new short[]{1,2,3};
		p(ArrayFormatter.arrayToString(s));
		
		byte[] b = new byte[]{1,2,3};
		p(ArrayFormatter.arrayToString(b));
		
		float[]f = new float[]{1,2};
		p(ArrayFormatter.arrayToString(f));
		
		int[]  i = new int[]{1,2,3};
		p(ArrayFormatter.arrayToString(i));
		
		boolean[]be = new boolean[]{true, false};
		p(ArrayFormatter.arrayToString(be));
		
		long[] l = new long[]{1,2,3};
		p(ArrayFormatter.arrayToString(l));
		
		double[] d = new double[]{1,2};
		p(ArrayFormatter.arrayToString(d));
		
		char[] c = new char[]{'a','b'};
		p(ArrayFormatter.arrayToString(c));
		
		String[] st = new String[]{"a","b"};
		p(ArrayFormatter.arrayToString(st));
		p("");
	}
	
	@Test
	public void testBig() {
		short[]s = new short[]{1,2,3,4,5,6};
		p(ArrayFormatter.arrayToString(s));
		
		byte[] b = new byte[]{1,2,3,4,5,6};
		p(ArrayFormatter.arrayToString(b));
		
		float[]f = new float[]{1,2,3,4,5,6};
		p(ArrayFormatter.arrayToString(f));
		
		int[]  i = new int[]{1,2,3,4,5,6};
		p(ArrayFormatter.arrayToString(i));
		
		boolean[]be = new boolean[]{true, false, true, false};
		p(ArrayFormatter.arrayToString(be));
		
		long[] l = new long[]{1,2,3,4,5,6};
		p(ArrayFormatter.arrayToString(l));
		
		double[] d = new double[]{1,2,3,4,5,6};
		p(ArrayFormatter.arrayToString(d));
		
		char[] c = new char[]{'a','b','c','d','e','f'};
		p(ArrayFormatter.arrayToString(c));
		
		String[] st = new String[]{"a","b","c","d","e","f"};
		p(ArrayFormatter.arrayToString(st));
		p("");
	}

	@Test
	public void testNull() {
		byte[] b = null;
		assertNotNull(ArrayFormatter.arrayToString(new short[]{1,2,3,4,5,6}));
		assertNull(ArrayFormatter.arrayToString(b));
	}
}