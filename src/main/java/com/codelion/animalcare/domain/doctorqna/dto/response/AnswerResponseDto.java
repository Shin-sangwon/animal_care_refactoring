package com.codelion.animalcare.domain.doctorqna.dto.response;

import com.codelion.animalcare.domain.doctorqna.repository.Answer;
import com.codelion.animalcare.domain.doctorqna.repository.Question;
import com.codelion.animalcare.domain.user.entity.Member;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AnswerResponseDto {

    private Long id;
    private String content;
    private Question question;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Member member;

    public AnswerResponseDto(Answer entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.question = entity.getQuestion();
        this.createdAt = entity.getCreatedAt();
        this.updatedAt = entity.getUpdatedAt();
        this.member = entity.getMember();
    }

}
