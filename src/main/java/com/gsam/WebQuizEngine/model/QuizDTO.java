package com.gsam.WebQuizEngine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizDTO {
    private long id;
    private String title;
    private String text;
    private String[] options;
}
