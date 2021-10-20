/**
 * 
 */
package com.quiz.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.app.dtos.CreateQuizRequestDto;
import com.quiz.app.dtos.QuizQuestionsDto;
import com.quiz.app.models.Quiz;
import com.quiz.app.services.QuizService;
import com.quiz.app.utils.Document;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@RestController
@RequestMapping(value = "/api/v1/quiz")
@CrossOrigin(origins = "*")
public class QuizController {

	@Autowired
	private QuizService quizService;

	@GetMapping("/")
	public ResponseEntity<Document> welcomeMessage() {

		Document doc = new Document();
		doc.setData("Success");
		doc.setMessage("Welcome to Quiz App.");
		doc.setStatusCode(HttpStatus.OK.value());

		return ResponseEntity.status(HttpStatus.OK).body(doc);

	}

	@PostMapping(value = "/create-quiz")
	public ResponseEntity<Document<Quiz>> createQuiz(@Valid @RequestBody CreateQuizRequestDto request) {

		Document<Quiz> response = quizService.createQuiz(request);

		return ResponseEntity.status(response.getStatusCode()).body(response);
	}

	@PostMapping(value = "/add-quiz-questions")
	public ResponseEntity<Document> addQuizQuestionsToExistingQuiz(
			@Valid @RequestBody List<QuizQuestionsDto> questionsList, @RequestParam(name = "quizId") Long quizId) {

		System.err.println(questionsList);
		System.err.println(quizId);

		Document response = quizService.addQuizQuestionsToExistingQuiz(questionsList, quizId);

		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
}
