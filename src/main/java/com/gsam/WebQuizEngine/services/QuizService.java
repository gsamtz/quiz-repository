package com.gsam.WebQuizEngine.services;

import com.gsam.WebQuizEngine.model.Quiz;
import com.gsam.WebQuizEngine.model.QuizDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    private ModelMapper modelMapper;

    @Autowired
    public QuizService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    /*
    Note: 11:35pm -> need to test out if the object is actually converted to the DTO
     */
    public QuizDTO convertQuizToDTO(Quiz quiz) {
        QuizDTO dto = modelMapper.map(quiz, QuizDTO.class);
        return dto;
    }
}
