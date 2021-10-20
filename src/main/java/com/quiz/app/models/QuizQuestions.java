/**
 * 
 */
package com.quiz.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@Entity
@Table(name = "QUIZ_QUESTIONS")
public class QuizQuestions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "QUIZ_QUESTION_ID")
	private Long quizQuestionId;

//	Quiz Questions Type i.e whether Objective or Subjective
	@Column(name = "QUIZ_TYPE_ID")
	@NotNull
	private Integer quizTypeId;

	@NotNull
	@Column(name = "QUESTION_TEXT")
	private String questionText;

	@Column(name = "QUIZ_ID")
	private Long quizId;

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
	 * @return the quizTypeId
	 */
	public Integer getQuizTypeId() {
		return quizTypeId;
	}

	/**
	 * @param quizTypeId the quizTypeId to set
	 */
	public void setQuizTypeId(Integer quizTypeId) {
		this.quizTypeId = quizTypeId;
	}

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
	 * @param quizQuestionId
	 * @param quizTypeId
	 * @param questionText
	 * @param quizId
	 */
	public QuizQuestions(Long quizQuestionId, @NotNull Integer quizTypeId, String questionText, Long quizId) {
		super();
		this.quizQuestionId = quizQuestionId;
		this.quizTypeId = quizTypeId;
		this.questionText = questionText;
		this.quizId = quizId;
	}

	/**
	 * 
	 */
	public QuizQuestions() {

	}

	@Override
	public String toString() {
		return "QuizQuestions [quizQuestionId=" + quizQuestionId + ", quizTypeId=" + quizTypeId + ", questionText="
				+ questionText + ", quizId=" + quizId + "]";
	}

}
