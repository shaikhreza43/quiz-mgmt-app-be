/**
 * 
 */
package com.quiz.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.app.dtos.CreateQuizRequestDto;
import com.quiz.app.models.Quiz;
import com.quiz.app.services.QuizService;
import com.quiz.app.utils.Document;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@RestController
@RequestMapping(value = "/api/v1/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;

	@PostMapping(value = "/create-quiz")
	public ResponseEntity<Document<Quiz>> createQuiz(@Valid @RequestBody CreateQuizRequestDto request) {

		Document<Quiz> response = quizService.createQuiz(request);

		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
}
