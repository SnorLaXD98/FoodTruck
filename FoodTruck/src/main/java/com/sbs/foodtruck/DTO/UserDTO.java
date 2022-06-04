package com.sbs.foodtruck.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private int userIdX; // firebase 고유아이디 key값
    private String userName; // 이름
    private String userNickname;
    private int userStatus = 1; // 유저의 상태 1 = 활성화 0 비활성화
    private String userEmail; // 아이디
    private String userPhone;
    private String userPw; // 패스워드
    private String userIntroduce =" ";
    private String userLocation = " "; //전화번호
    private String userProfileimgURL ="";
    private int truckstatus = 0;

    public UserDTO(){};

    public UserDTO(int userIdX, String userName, String userNickname, int userStatus, String userEmail, String userPhone, String userPw, String userIntroduce, String userLocation, String userProfileimgURL, int truckstatus) {
        this.userIdX = userIdX;
        this.userName = userName;
        this.userNickname = userNickname;
        this.userStatus = userStatus;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userPw = userPw;
        this.userIntroduce = userIntroduce;
        this.userLocation = userLocation;
        this.userProfileimgURL = userProfileimgURL;
        this.truckstatus = truckstatus;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userIdX=" + userIdX +
                ", userName='" + userName + '\'' +
                ", userNickname='" + userNickname + '\'' +
                ", userStatus=" + userStatus +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userIntroduce='" + userIntroduce + '\'' +
                ", userLocation='" + userLocation + '\'' +
                ", userProfileimgURL='" + userProfileimgURL + '\'' +
                ", truckstatus=" + truckstatus +
                '}';
    }
}
