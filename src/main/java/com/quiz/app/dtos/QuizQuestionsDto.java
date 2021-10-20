/**
 * 
 */
package com.quiz.app.dtos;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.quiz.app.models.QuizQuestionOption;

/**
 * @author Shaikh Ahmed Reza
 *
 */
public class QuizQuestionsDto {

	@NotNull(message = "Question Text cannot be empty")
	public String questionText;
	@NotNull(message = "please choose question type")
	public Integer questionType;
	@NotEmpty(message = "option list cannot be empty")
	public List<QuizQuestionOption> listOfOptions;

	/**
	 * @return the questionText
	 */
	public String getQuestionText() {
		return questionText;
	}

	/**
	 * @param questionText the questionText to set
	 */
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	/**
	 * @return the questionType
	 */
	public Integer getQuestionType() {
		return questionType;
	}

	/**
	 * @param questionType the questionType to set
	 */
	public void setQuestionType(Integer questionType) {
		this.questionType = questionType;
	}

	/**
	 * @return the listOfOptions
	 */
	public List<QuizQuestionOption> getListOfOptions() {
		return listOfOptions;
	}

	/**
	 * @param listOfOptions the listOfOptions to set
	 */
	public void setListOfOptions(List<QuizQuestionOption> listOfOptions) {
		this.listOfOptions = listOfOptions;
	}

	/**
	 * @param questionText
	 * @param questionType
	 * @param listOfOptions
	 */
	public QuizQuestionsDto(String questionText, Integer questionType, List<QuizQuestionOption> listOfOptions) {
		super();
		this.questionText = questionText;
		this.questionType = questionType;
		this.listOfOptions = listOfOptions;
	}

	/**
	 * 
	 */
	public QuizQuestionsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "QuizQuestionsDto [questionText=" + questionText + ", questionType=" + questionType + ", listOfOptions="
				+ listOfOptions + "]";
	}

}
