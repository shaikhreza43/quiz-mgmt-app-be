/**
 * 
 */
package com.quiz.app.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.quiz.app.dtos.CreateQuizRequestDto;
import com.quiz.app.models.Quiz;
import com.quiz.app.repositories.QuizQuestionsRepositories;
import com.quiz.app.repositories.QuizRepositories;
import com.quiz.app.services.QuizService;
import com.quiz.app.utils.Document;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizRepositories quizRepositories;

	@Autowired
	private QuizQuestionsRepositories questionsRepositories;

	@Override
	public Document<Quiz> createQuiz(CreateQuizRequestDto request) {

		Document<Quiz> doc = new Document<Quiz>();

		try {
			if (request != null) {
				Quiz qz = new Quiz();
				qz.setPassedMarks(request.getPassedMarks());
				qz.setQuizName(request.getQuizName());
				qz.setTotalMarks(request.getTotalMarks());
				qz.setQuizDifficulty(request.getQuizDifficulty());
				Quiz saved = quizRepositories.save(qz);

				doc.setData(saved);
				doc.setMessage("Quiz Created Successfully");
				doc.setStatusCode(HttpStatus.CREATED.value());
			} else {
				throw new NullPointerException("Quiz Data Cannot be Null");
			}

		} catch (Exception ex) {
			doc.setData(null);
			doc.setMessage(ex.getLocalizedMessage());
			doc.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}

		return doc;
	}

}
