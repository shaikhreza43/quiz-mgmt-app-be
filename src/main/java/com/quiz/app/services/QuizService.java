/**
 * 
 */
package com.quiz.app.services;

import com.quiz.app.dtos.CreateQuizRequestDto;
import com.quiz.app.models.Quiz;
import com.quiz.app.utils.Document;

/**
 * @author Shaikh Ahmed Reza
 *
 */
public interface QuizService {

	Document<Quiz> createQuiz(CreateQuizRequestDto request);

}
