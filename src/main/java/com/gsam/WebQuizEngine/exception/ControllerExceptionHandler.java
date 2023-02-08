package com.gsam.WebQuizEngine.exception;

import com.gsam.WebQuizEngine.records.CustomExceptionMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(QuizNotFoundException.class)
    public ResponseEntity<CustomExceptionMessage> handleQuizNotFoundException(QuizNotFoundException cause,
                                                                              WebRequest webRequest) {
        CustomExceptionMessage body = new CustomExceptionMessage(
                HttpStatus.NOT_FOUND.value(),
                LocalDateTime.now(),
                cause.getMessage(),
                webRequest.getDescription(false));

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
}
