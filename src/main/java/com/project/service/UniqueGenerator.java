package com.project.service;

import java.util.Random;

public class UniqueGenerator {

	public String generateNum(String candidateChars, int length) {
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars
	                .length()))); }
	    return sb.toString();
	}
}
