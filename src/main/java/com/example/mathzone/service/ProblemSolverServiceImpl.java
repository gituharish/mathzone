package com.example.mathzone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mathzone.utils.MathUtils;

@Service
public class ProblemSolverServiceImpl implements ProblemSolverService{
	@Autowired
	private MathUtils mathUtils;
	
	/**
	 * Method to find the smallest number evenly divisible by all numbers 1 to n
	 */
	public String getSmallestNumberEvenlydivisible(String num) {		

		Long smallestDivisibleNum = mathUtils.lcm(Long.valueOf(num));
		return String.valueOf(smallestDivisibleNum);
	}
	
}
