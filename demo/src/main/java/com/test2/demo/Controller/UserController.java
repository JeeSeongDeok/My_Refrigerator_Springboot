package com.test2.demo.Controller;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

import com.test2.demo.model.UserProfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    private int count = 2;
    private Map<String, UserProfile> userMap;
    @PostConstruct
    public void init(){
        // 더미 데이터
        userMap = new HashMap<String, UserProfile>();
        userMap.put("1", new UserProfile("bh939", "abc", "sung", "01051", "1204"));
        
    }
    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
    @GetMapping("/user")
    public UserProfile getUserProfile(){
        return userMap.get("1");
    }
    @RequestMapping(method=RequestMethod.POST, value="/signup")
    public Map<String, String> postUserProfile(@RequestBody UserProfile userprofile){
            System.out.println("id " + userprofile.getId() + " password: " + userprofile.getPw());
            userMap.put(
                Integer.toString(count),
                new UserProfile(userprofile.getId(), userprofile.getPw(), userprofile.getName(), userprofile.getPhone(), userprofile.getDate())
            );
            count++;
            HashMap<String, String> map = new HashMap<>();
            map.put("result", "Ok");
            System.out.println(userMap.get("2") + "결과");
            return map;
        }
        
}