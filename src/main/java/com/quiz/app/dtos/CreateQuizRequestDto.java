/**
 * 
 */
package com.quiz.app.dtos;

import javax.validation.constraints.NotNull;

/**
 * @author Shaikh Ahmed Reza
 *
 */
public class CreateQuizRequestDto {

	@NotNull(message = "Quiz Name Cannot be Empty or Null")
	private String quizName;
	@NotNull(message = "Total Marks of the Quiz Needs to be defined")
	private Integer totalMarks;
	@NotNull(message = "Passed Marks needs to be defined")
	private Integer passedMarks;
	@NotNull(message = "Please Provide Quiz Difficulty Level")
	private String quizDifficulty;

	/**
	 * @return the quizName
	 */
	public String getQuizName() {
		return quizName;
	}

	/**
	 * @param quizName the quizName to set
	 */
	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}

	/**
	 * @return the totalMarks
	 */
	public Integer getTotalMarks() {
		return totalMarks;
	}

	/**
	 * @param totalMarks the totalMarks to set
	 */
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	/**
	 * @return the passedMarks
	 */
	public Integer getPassedMarks() {
		return passedMarks;
	}

	/**
	 * @param passedMarks the passedMarks to set
	 */
	public void setPassedMarks(Integer passedMarks) {
		this.passedMarks = passedMarks;
	}

	/**
	 * @return the quizDifficulty
	 */
	public String getQuizDifficulty() {
		return quizDifficulty;
	}

	/**
	 * @param quizDifficulty the quizDifficulty to set
	 */
	public void setQuizDifficulty(String quizDifficulty) {
		this.quizDifficulty = quizDifficulty;
	}

	/**
	 * 
	 */
	public CreateQuizRequestDto() {

	}

	/**
	 * @param quizName
	 * @param totalMarks
	 * @param passedMarks
	 * @param quizDifficulty
	 */
	public CreateQuizRequestDto(@NotNull(message = "Quiz Name Cannot be Empty or Null") String quizName,
			@NotNull(message = "Total Marks of the Quiz Needs to be defined") Integer totalMarks,
			@NotNull(message = "Passed Marks needs to be defined") Integer passedMarks,
			@NotNull(message = "Please Provide Quiz Difficulty Level") String quizDifficulty) {
		super();
		this.quizName = quizName;
		this.totalMarks = totalMarks;
		this.passedMarks = passedMarks;
		this.quizDifficulty = quizDifficulty;
	}

}
