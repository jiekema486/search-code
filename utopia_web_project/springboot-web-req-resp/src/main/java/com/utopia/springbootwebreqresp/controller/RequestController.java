package com.utopia.springbootwebreqresp.controller;


import com.utopia.springbootwebreqresp.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@RestController
//public class RequestController {
//    @RequestMapping("/simpleParam")//申明请求路径
//    public String simplePatam(HttpServletRequest request){
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name+":"+age);
//        return "OK";
//    }
//}
    //springboot 方式
//@RestController
//public class RequestController {
//    @RequestMapping("/simpleParam")//申明请求路径
//    public String simplePatam(String name,Integer age){
//        System.out.println(name+":"+age);
//        return "OK";
//    }
//}

@RestController
public class RequestController {
    @RequestMapping("/simpleParam")//申明请求路径
    public String simplePatam(@RequestParam(name = "name",required = false)String username, Integer age){
        System.out.println(username+":"+age);
        return "OK";
    }


    //2.实体参数
    @RequestMapping("/complexPojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "OK";
    }


    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }


    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "OK";
    }

    //日期时间参数
    @RequestMapping("/dateParam")
    public String dataParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
        System.out.println(updateTime);
        return "OK";
    }

    //5.json参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }
    //路径参数
    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id){
        System.out.println(id);
        return "OK";
    }

    @RequestMapping("/path/{id}/{name}")
    public String pathParam2(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id+name);
        return "OK";
    }
}
