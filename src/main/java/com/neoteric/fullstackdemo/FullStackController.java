package com.neoteric.fullstackdemo;


import com.neoteric.fullstackdemo.model.Otp;
import com.neoteric.fullstackdemo.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FullStackController {

    @CrossOrigin("*")
    @PostMapping(value = "/api/saveUser",
            consumes = {"application/json"},
            produces = {"application/json"})
    public Otp saveUser(@RequestBody User user){

        System.out.println("from save User" +user);
        Otp otp=new Otp();
        otp.mobileNumber= user.getMobile();
        otp.otp="1234";
        return otp;
    }
}