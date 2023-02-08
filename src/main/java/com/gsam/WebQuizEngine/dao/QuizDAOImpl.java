package com.gsam.WebQuizEngine.dao;

import com.gsam.WebQuizEngine.exception.QuizNotFoundException;
import com.gsam.WebQuizEngine.model.Quiz;
import com.gsam.WebQuizEngine.model.QuizDTO;
import com.gsam.WebQuizEngine.records.Submission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.gsam.WebQuizEngine.services.QuizService;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class QuizDAOImpl implements QuizDAO {

    @Autowired
    QuizService quizService;

    // we'll be utilizing an in-memory storage container until the database is set up
    private final Map<Long, Quiz> quizzes = Collections.synchronizedMap(new HashMap<>());

    @Override
    public QuizDTO create(Quiz quiz) {
        // I'll have to use a QuizDTO object here to avoid having an answer field
        // method (HAS BEEN IMPLEMENTED @1:16am) [still need to test]
        long generatedId = quizzes.size() + 1;
        quiz.setId(generatedId);
        quizzes.put(quiz.getId(), quiz);
        QuizDTO convertedQuiz = quizService.convertQuizToDTO(quiz);

        // Test output of DTO conversion
        System.out.println(Arrays.toString(Arrays.asList(quizzes.values()).toArray()));
        System.out.println(convertedQuiz);

        return convertedQuiz; // We don't want the client to receive a quiz with an answer field
    }

    @Override
    public Submission createSubmission(int answer) {
        return null;
    }

    @Override
    public QuizDTO read(long id) {
        // REALLY GACKY!!! ONLY WRITING LIKE THIS TO TEST IF I GET A QUIZDTO
        if (quizzes.containsKey(id)) {
            System.out.println(Arrays.toString(Arrays.asList(quizzes.values()).toArray()));
            QuizDTO convertedQuiz = quizService.convertQuizToDTO(quizzes.get(id));
            System.out.println(convertedQuiz);
            return convertedQuiz;
        }
        // implement custom FileNotFoundException with ExceptionHandler
        throw new QuizNotFoundException("Quiz not found id=" + id);
    }

    @Override
    public List<QuizDTO> readAll() {
        List<QuizDTO> convertedQuizzes = new ArrayList<>();
        if (!quizzes.isEmpty()) {
            for (Quiz quiz : quizzes.values()) {
                convertedQuizzes.add(quizService.convertQuizToDTO(quiz));
            }
            return convertedQuizzes;
        }
        // Return an empty list if there are no quiz entries
        return convertedQuizzes;
    }
}
