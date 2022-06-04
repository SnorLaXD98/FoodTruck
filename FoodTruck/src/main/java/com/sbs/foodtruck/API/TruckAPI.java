package com.sbs.foodtruck.API;

import com.sbs.foodtruck.DTO.CommentDTO;


import java.util.List;

public class TruckAPI {


    //트럭 idx나 이름으로 검색하여 받은 커맨트들의 별점 평균
    public static double CommentRating(List<CommentDTO> CommentList){
        double commentsSum =0;
        for(int i=0; i < CommentList.size() ; i++){
            commentsSum = commentsSum + CommentList.get(i).getCommentRating();
            System.out.println(commentsSum);
            System.out.println(CommentList.get(i));
        }
        double  commentsRating =  (double) commentsSum/ CommentList.size() ;

        return commentsRating;
    }






}
