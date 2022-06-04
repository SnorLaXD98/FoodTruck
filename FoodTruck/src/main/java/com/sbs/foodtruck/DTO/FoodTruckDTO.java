package com.sbs.foodtruck.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodTruckDTO {
    private int truckIdx;
    private int userIdx = 2;
    private String truckName;
    private int truckStatus = 0;
    private String truckProfileURL = "";
    private String menuClassfi;
    private String truckIntroduce;
    private String truckLocation = "";
    private double truckRating = 0;

    public FoodTruckDTO(int truckIdx, int userIdx, String truckName, int truckStatus, String truckProfileURL, String menuClassfi, String truckIntroduce, String truckLocation, double truckRating) {
        this.truckIdx = truckIdx;
        this.userIdx = userIdx;
        this.truckName = truckName;
        this.truckStatus = truckStatus;
        this.truckProfileURL = truckProfileURL;
        this.menuClassfi = menuClassfi;
        this.truckIntroduce = truckIntroduce;
        this.truckLocation = truckLocation;
        this.truckRating = truckRating;
    }

    public FoodTruckDTO() {
    }

    @Override
    public String toString() {
        return "FoodTruckDTO{" +
                "truckIdx=" + truckIdx +
                ", userIdx=" + userIdx +
                ", truckName='" + truckName + '\'' +
                ", truckStatus=" + truckStatus +
                ", truckProfileURL='" + truckProfileURL + '\'' +
                ", menuClassfi='" + menuClassfi + '\'' +
                ", truckIntroduce='" + truckIntroduce + '\'' +
                ", truckLocation='" + truckLocation + '\'' +
                ", truckRating=" + truckRating +
                '}';
    }
}


