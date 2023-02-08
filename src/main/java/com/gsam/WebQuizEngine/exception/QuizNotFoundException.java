package com.gsam.WebQuizEngine.exception;

public class QuizNotFoundException extends RuntimeException {

    // Should only be thrown when a quiz is not found under the
    // user-defined search requirements
    public QuizNotFoundException(String cause) {
        super(cause);
    }
}
