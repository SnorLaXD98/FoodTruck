package com.sbs.foodtruck.Controller;

import com.sbs.foodtruck.DTO.FoodTruckDTO;
import com.sbs.foodtruck.Mapper.FoodTruckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TruckController {

    @Autowired
    private FoodTruckMapper ftmapper;


    @PostMapping("/TruckController")
    public String truckForm(
                FoodTruckDTO foodTruckDTO,
                Model model){

        System.out.println(foodTruckDTO);

        FoodTruckDTO ft1  = new FoodTruckDTO();


        System.out.println(foodTruckDTO.toString());
        ftmapper.insertFoodTruck(foodTruckDTO);

        FoodTruckDTO ft2 =  ftmapper.selectFoodTruckname("test1");
        System.out.println(ft2);

            return"/FoodTruckControllerView";
    }



}
