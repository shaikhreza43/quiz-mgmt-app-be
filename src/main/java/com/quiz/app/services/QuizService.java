/**
 * 
 */
package com.quiz.app.services;

import java.util.List;

import com.quiz.app.dtos.CreateQuizRequestDto;
import com.quiz.app.dtos.QuizQuestionsDto;
import com.quiz.app.models.Quiz;
import com.quiz.app.utils.Document;

/**
 * @author Shaikh Ahmed Reza
 *
 */
public interface QuizService {

	Document<Quiz> createQuiz(CreateQuizRequestDto request);

	Document addQuizQuestionsToExistingQuiz(List<QuizQuestionsDto> questionsList, Long quizId);

}
