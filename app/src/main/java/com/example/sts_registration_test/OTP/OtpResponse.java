package com.example.sts_registration_test.OTP;

public class UserResponse {

    /*
    * "message": "OTP SEND",
    * "status": "200"
    * */

    private String message;
    private int status;



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
