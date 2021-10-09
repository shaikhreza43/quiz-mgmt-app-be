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
@Table(name = "QUIZ")
public class Quiz implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUIZ_ID")
	private Long quizId;

	@Column(name = "QUIZ_NAME")
	@NotNull
	private String quizName;

	@Column(name = "TOTAL_MARKS")
	@NotNull
	private Integer totalMarks;

	@Column(name = "PASSED_MARKS")
	@NotNull
	private Integer passedMarks;

	@Column(name = "QUIZ_DIFFICULTY")
	@NotNull
	private String quizDifficulty;

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
	 * @param quizId
	 * @param quizName
	 * @param totalMarks
	 * @param passedMarks
	 * @param quizDifficulty
	 */
	public Quiz(Long quizId, @NotNull String quizName, @NotNull Integer totalMarks, @NotNull Integer passedMarks,
			@NotNull String quizDifficulty) {
		super();
		this.quizId = quizId;
		this.quizName = quizName;
		this.totalMarks = totalMarks;
		this.passedMarks = passedMarks;
		this.quizDifficulty = quizDifficulty;
	}

	/**
	 * 
	 */
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Quiz [quizId=" + quizId + ", quizName=" + quizName + ", totalMarks=" + totalMarks + ", passedMarks="
				+ passedMarks + ", quizDifficulty=" + quizDifficulty + "]";
	}

}
