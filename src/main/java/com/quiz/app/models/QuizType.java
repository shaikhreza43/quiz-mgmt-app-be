/**
 * 
 */
package com.quiz.app.models;

import java.io.Serializable;

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
@Table(name = "QUIZ_TYPE")
public class QuizType implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUIZ_TYPE_ID")
	private Long quizTypeId;

	@Column(name = "QUIZ_TYPE")
	@NotNull
	private String quizType;

	/**
	 * @return the quizTypeId
	 */
	public Long getQuizTypeId() {
		return quizTypeId;
	}

	/**
	 * @param quizTypeId the quizTypeId to set
	 */
	public void setQuizTypeId(Long quizTypeId) {
		this.quizTypeId = quizTypeId;
	}

	/**
	 * @return the quizType
	 */
	public String getQuizType() {
		return quizType;
	}

	/**
	 * @param quizType the quizType to set
	 */
	public void setQuizType(String quizType) {
		this.quizType = quizType;
	}

	/**
	 * @param quizTypeId
	 * @param quizType
	 */
	public QuizType(Long quizTypeId, @NotNull String quizType) {
		super();
		this.quizTypeId = quizTypeId;
		this.quizType = quizType;
	}

	/**
	 * 
	 */
	public QuizType() {

	}

	@Override
	public String toString() {
		return "QuizType [quizTypeId=" + quizTypeId + ", quizType=" + quizType + "]";
	}

}
