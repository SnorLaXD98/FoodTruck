package com.sbs.foodtruck;

import com.google.gson.Gson;
import com.sbs.foodtruck.DTO.CommentDTO;
import com.sbs.foodtruck.DTO.FoodTruckDTO;
import com.sbs.foodtruck.DTO.MenuDTO;
import com.sbs.foodtruck.DTO.UserDTO;
import com.sbs.foodtruck.Mapper.FoodTruckMapper;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.util.List;

import static com.sbs.foodtruck.API.TruckAPI.CommentRating;

@SpringBootTest
public class TruckMapperTest {

    @Autowired
    private FoodTruckMapper foodTruckMapper;


    @Test
    public void testInsert() {


        // 푸드트럭과 유저 입력확인
        FoodTruckDTO f1 = new FoodTruckDTO();
        FoodTruckDTO f2 = new FoodTruckDTO();
        UserDTO u1 = new UserDTO();
/*
        f1.setTruckName("test");
        f1.setUserIdx(1);
        f1.setMenuClassfi("일식");
        f1.setTruckIntroduce("테스트입니다.");

        u1.setUserEmail("testing@test.com");
        u1.setUserName("테스터");
        u1.setUserPhone("010-2111-1111");
        u1.setUserPw("123456");
        u1.setUserNickname("tester");
        u1.setUserLocation(" ");

        System.out.println(f1);
        System.out.println(u1);

        foodTruckMapper.insertFoodTruck(f1);
       foodTruckMapper.insertUser(u1);

        List<FoodTruckDTO> flist = foodTruckMapper.findAll();

        System.out.println(flist);
    
    
        // 객체 제이슨 변경확인
        Gson gson =new Gson(); // 제이슨으로 변환
        String json = gson.toJson(f1);
        System.out.println(json);


        //메뉴 입력확인
        MenuDTO m1 = new MenuDTO();

        m1.setMenu("테스트 한번더");
        m1.setTruckIdx(21);
        m1.setMenuClassfi("ㅁㄴㅇㄹ");
        m1.setCost(5000);
        m1.setMenuIntroduce("맛있어요 ^^");

        System.out.println(m1);

        foodTruckMapper.insertMenu(m1);

        //커멘트 입력 확인
        CommentDTO c1 = new CommentDTO();

        c1.setTruckIdx(21);
        c1.setComment("여기 맛있어용");
        c1.setCommentedUserIdx(1);
        c1.setCommentRating(8);

        foodTruckMapper.insertComment(c1);

        // 푸드트럭 메뉴 별 검색
        List<FoodTruckDTO> menus = foodTruckMapper.searchMenu("양식");

       System.out.println(menus);


        List<CommentDTO> Comnts = foodTruckMapper.truckComments( 21);

       System.out.println( CommentRating(Comnts));

       f1 = foodTruckMapper.selectFoodTruckname("타코집");

        f1.setTruckRating(CommentRating(foodTruckMapper.truckComments(f1.getTruckIdx())));
        System.out.println(f1);

        f1 = foodTruckMapper.selectFoodTruckIdx(21);
        f2 = foodTruckMapper.selectFoodTruckIdx(5);

        foodTruckMapper.openFoodTruckIdx(f1.getTruckIdx());

    */

        f1 = foodTruckMapper.selectFoodTruckIdx(21);



        int truckIdx1 = foodTruckMapper.searchFoodTruckIdx(f1.getTruckName());
        System.out.println(truckIdx1);
    }

}


