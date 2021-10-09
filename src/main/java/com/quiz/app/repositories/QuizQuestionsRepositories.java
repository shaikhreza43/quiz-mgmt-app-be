/**
 * 
 */
package com.quiz.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.app.models.QuizQuestions;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@Repository
public interface QuizQuestionsRepositories extends JpaRepository<QuizQuestions, Long> {

}
