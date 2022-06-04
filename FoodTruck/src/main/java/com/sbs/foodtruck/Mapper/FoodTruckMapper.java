package com.sbs.foodtruck.Mapper;

import com.sbs.foodtruck.DTO.CommentDTO;
import com.sbs.foodtruck.DTO.FoodTruckDTO;
import com.sbs.foodtruck.DTO.MenuDTO;
import com.sbs.foodtruck.DTO.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface FoodTruckMapper {



    // FoodTruck 쿼리문 ---------------------------------------

    //푸드트럭삽입
    public void insertFoodTruck(FoodTruckDTO foodTruckDTO);

    //전체 푸드트럭검색
    @Select("SELECT * FROM foodtruck")
    List<FoodTruckDTO>  findAll();

    //푸드트럭 검색
    public FoodTruckDTO selectFoodTruckname(String truckName);
    public FoodTruckDTO selectFoodTruckIdx(int truckIdx);

    public int searchFoodTruckIdx(String truckName);

    //푸드트럭 오픈 상태 만들기
    public void openFoodTruckIdx(int truckIdx);
    //푸드트럭 문 닫은 상태 만들기
    public void closeFoodTruckIdx(int truckIdx);



    //User 쿼리문 ---------------------------------------------
    //유저삽입
    public void insertUser(UserDTO userDTO);

    //Menu 쿼리문 ---------------------------------------------

    //메뉴 삽입
    public void insertMenu(MenuDTO menuDTO);
    //메뉴 검색
    public List<FoodTruckDTO> searchMenu(String menuClassfi);

    public void updateMenu(int truckIdx, int menuIdx);

    //Comment 쿼리문 ------------------------------------------
    
    
    //커멘트입력
    public void insertComment(CommentDTO commentDTO);


    //커멘트 별점 평균을 내기위한 트럭의 커맨트들
    public List<CommentDTO> truckComments(int truckIdx);




}
