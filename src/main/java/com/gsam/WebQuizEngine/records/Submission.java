package com.gsam.WebQuizEngine.records;

public record Submission(
        boolean isCorrectAnswer,
        String submissionMessage
) {
}
