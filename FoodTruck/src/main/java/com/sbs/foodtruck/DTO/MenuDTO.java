package com.sbs.foodtruck.DTO;


import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class MenuDTO {

    private int menuIdx;
    private int truckIdx;
    private String  menu;
    private String menuClassfi;
    private int cost;
    private String menuIntroduce;

    public MenuDTO(){}


    public MenuDTO(int menuIdx, int truckIdx, String menu, String menuClassfi, int cost, String menuIntroduce) {
        this.menuIdx = menuIdx;
        this.truckIdx = truckIdx;
        this.menu = menu;
        this.menuClassfi = menuClassfi;
        this.cost = cost;
        this.menuIntroduce = menuIntroduce;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuIdx=" + menuIdx +
                ", truckIdx=" + truckIdx +
                ", menu='" + menu + '\'' +
                ", menuClassfi='" + menuClassfi + '\'' +
                ", cost=" + cost +
                ", menuIntroduce='" + menuIntroduce + '\'' +
                '}';
    }
}
