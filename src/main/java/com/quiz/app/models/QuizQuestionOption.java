package com.quiz.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Shaikh Ahmed Reza
 *
 */
@Entity
@Table(name = "QUIZ_QUESTION_OPTION")
public class QuizQuestionOption {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "QUIZ_QUESTION_OPTION_ID")
	private Long quizQuestionOptionId;

	@Column(name = "OPTION_VALUE")
	private String optionValue;

	@Column(name = "OPTION_NAME")
	private String optionName;

	@Column(name = "QUIZ_QUESTION_ID")
	private Long quizQuestionId;

	@Column(name = "QUIZ_ID")
	private Long quizId;

	/**
	 * @return the quizQuestionOptionId
	 */
	public Long getQuizQuestionOptionId() {
		return quizQuestionOptionId;
	}

	/**
	 * @param quizQuestionOptionId the quizQuestionOptionId to set
	 */
	public void setQuizQuestionOptionId(Long quizQuestionOptionId) {
		this.quizQuestionOptionId = quizQuestionOptionId;
	}

	/**
	 * @return the quizQuestionId
	 */
	public Long getQuizQuestionId() {
		return quizQuestionId;
	}

	/**
	 * @param quizQuestionId the quizQuestionId to set
	 */
	public void setQuizQuestionId(Long quizQuestionId) {
		this.quizQuestionId = quizQuestionId;
	}

	/**
	 * @return the optionValue
	 */
	public String getOptionValue() {
		return optionValue;
	}

	/**
	 * @param optionValue the optionValue to set
	 */
	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	/**
	 * @return the optionName
	 */
	public String getOptionName() {
		return optionName;
	}

	/**
	 * @param optionName the optionName to set
	 */
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	/**
	 * @return the quizId
	 */
	public Long getQuizId() {
		return quizId;
	}

	/**
	 * @param quizId the quizId to set
	 */
	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}

	/**
	 * 
	 */
	public QuizQuestionOption() {

	}

	/**
	 * @param quizQuestionOptionId
	 * @param optionValue
	 * @param optionName
	 * @param quizQuestionId
	 * @param quizId
	 */
	public QuizQuestionOption(Long quizQuestionOptionId, String optionValue, String optionName, Long quizQuestionId,
			Long quizId) {
		super();
		this.quizQuestionOptionId = quizQuestionOptionId;
		this.optionValue = optionValue;
		this.optionName = optionName;
		this.quizQuestionId = quizQuestionId;
		this.quizId = quizId;
	}

}
