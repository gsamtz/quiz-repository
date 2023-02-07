package com.gsam.WebQuizEngine.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private long id;
    private String title;
    private String text;
    private String[] options;
    private int answer;
}
