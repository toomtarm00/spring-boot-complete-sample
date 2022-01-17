package com.example.springboot;

public class Test {

public static void main(String[] args) {
		

		String s = "abaabaabaabaabaabaabaabaabaabaaba";
		System.out.println(repeatedString(s, 10));
	}

	public static long repeatedString(String s, long n) {
		// Write your code here


		long sDevide = n / new String(s).length();
		long sMod = n % new String(s).length();

		long cntPerD = 0l;
		char[] dArr = new String(s).toCharArray();
		int target = dArr[0];

		for (char sChar : dArr) {

			if (target == (int) sChar) {
				cntPerD++;
			}
		}

		long cntPerM = 0l;
		char[] mArr = new String(s).substring(0, (int) sMod).toCharArray();

		for (char sChar : mArr) {

			if (target == (int) sChar) {
				cntPerM++;
			}
		}

		long cal = (cntPerD * sDevide) + cntPerM;

		return cal;
	}

}
