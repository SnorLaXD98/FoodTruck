package com.sbs.foodtruck.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDTO {

        private int commentedUserIdx;
        private int truckIdx;
        private String comment;
        private int commentStatus;//00 : 비활성화 01: 활성화
        private double commentRating;

        public CommentDTO(){}

    public CommentDTO(int commentedUser, int truckIdx, String comment, int commentStatus, int commentRating) {
        this.commentedUserIdx = commentedUser;
        this.truckIdx = truckIdx;
        this.comment = comment;
        this.commentStatus = commentStatus;
        this.commentRating = commentRating;


    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "commentedUser=" + commentedUserIdx +
                ", truckIdx=" + truckIdx +
                ", comment='" + comment + '\'' +
                ", commentStatus=" + commentStatus +
                ", commentRating=" + commentRating +
                '}';
    }

}


