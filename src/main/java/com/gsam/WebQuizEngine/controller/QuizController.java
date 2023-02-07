package com.gsam.WebQuizEngine.controller;

import com.gsam.WebQuizEngine.model.Quiz;
import com.gsam.WebQuizEngine.model.QuizDTO;
import com.gsam.WebQuizEngine.dao.QuizDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuizController {

    @Autowired
    private QuizDAOImpl quizDAOImpl;

    @RequestMapping(path ="/api/quizzes/{id}", method = RequestMethod.GET)
    public QuizDTO getQuiz(@PathVariable long id) {
        return quizDAOImpl.read(id);
    }

    @RequestMapping(path = "/api/quizzes", method = RequestMethod.GET)
    public List<QuizDTO> getAllQuizzes() {
        return quizDAOImpl.readAll();
    }

    @RequestMapping(path = "/api/quizzes", method = RequestMethod.POST)
    public QuizDTO createQuiz(@RequestBody Quiz quiz) {
        return quizDAOImpl.create(quiz);
    }
}
