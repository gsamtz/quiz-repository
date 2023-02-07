package com.gsam.WebQuizEngine.dao;

import com.gsam.WebQuizEngine.model.Quiz;
import com.gsam.WebQuizEngine.model.QuizDTO;
import com.gsam.WebQuizEngine.records.Submission;

import java.util.List;

public interface QuizDAO {

    // create new quiz
    QuizDTO create(Quiz quiz);

    // submit quiz answer
    Submission createSubmission(int answer);

    // get single quiz by id
    QuizDTO read(long id);

    // get all quizzes
    List<QuizDTO> readAll();
}
