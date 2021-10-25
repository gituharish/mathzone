package com.example.mathzone.model;
/**
 * Represents the problem and the solution
 * @author Geethu Harish
 *
 */
public class ProblemResponse {
	private String problem;
	private String solution;
	/**
	 * Gets the problem number.
	 * @return A string containing problem number
	 */
	public String getProblem() {
		return problem;
	}
	/** Sets the problem.
	* 
	* @param problem String containing problem number
	*/
	public void setProblem(String problem) {
		this.problem = problem;
	}
	/**
	 * Gets the solution.
	 * @return A string containing solution
	 */
	public String getSolution() {
		return solution;
	}
	/** Sets the solution.
	 * 
	 * @param solution A string containing solution.
	 */
	public void setSolution(String solution) {
		this.solution = solution;
	}
	
}
