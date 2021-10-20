/**
 * 
 */
package com.quiz.app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.quiz.app.dtos.CreateQuizRequestDto;
import com.quiz.app.dtos.QuizQuestionsDto;
import com.quiz.app.models.Quiz;
import com.quiz.app.models.QuizQuestions;
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

	@Override
	public Document addQuizQuestionsToExistingQuiz(List<QuizQuestionsDto> questionsList, Long quizId) {

		Document doc = new Document<>();

		try {
			if (quizId == null) {
				throw new NullPointerException("Quiz Id Cannot be Empty or Null");
			}

			if (questionsList.isEmpty()) {
				throw new NullPointerException("Question List Should not be Empty.");
			}

			List<QuizQuestions> questions = new ArrayList<>();

			for (QuizQuestionsDto quizQuestionsDto : questionsList) {

				QuizQuestions quizQuestions = new QuizQuestions();
				quizQuestions.setQuestionText(quizQuestionsDto.getQuestionText());
				quizQuestions.setQuizId(quizId);
				quizQuestions.setQuizTypeId(quizQuestionsDto.getQuestionType());
				
				questions.add(quizQuestions);
			}

			List<QuizQuestions> saveAll = questionsRepositories.saveAll(questions);

			doc.setData("Successful");
			doc.setStatusCode(HttpStatus.CREATED.value());
			doc.setMessage("Questions Added to the Quiz");

		} catch (Exception ex) {
			doc.setData(ex);
			doc.setMessage(ex.getLocalizedMessage());
			doc.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}

		return doc;
	}

}
