/**
 * 
 */
package com.quiz.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.app.models.Quiz;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@Repository
public interface QuizRepositories extends JpaRepository<Quiz, Long> {

}
