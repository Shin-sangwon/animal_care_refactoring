package com.codelion.animalcare.domain.doctorQna.controller.dto.response;

import com.codelion.animalcare.domain.doctorQna.repository.Answer;
import com.codelion.animalcare.domain.doctorQna.repository.Question;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AnswerResponseDto {

    private Long id;
    private String content;
    private Question question;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public AnswerResponseDto(Answer entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.question = entity.getQuestion();
        this.createdAt = entity.getCreatedAt();
        this.updatedAt = entity.getUpdatedAt();
    }

}
