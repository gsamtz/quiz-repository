package com.gsam.WebQuizEngine;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebQuizEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebQuizEngineApplication.class, args);

		// Technically this does transform the quiz object into the quizDTO
//		Quiz quiz = new Quiz(1L,
//				"Counter-Strike Teams",
//				"Who is going to win the major?",
//				new String[]{"Na'Vi", "Heroic", "Faze Clan", "G2"},
//				2);
//		System.out.println(quiz);
//		QuizService ser = new QuizService(new ModelMapper());
//		QuizDTO quizDTO = ser.convertQuizToDTO(quiz);
//		System.out.println(quizDTO);
	}

}
