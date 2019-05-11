package com.exemple.sweater;

import com.exemple.sweater.domain.Login;
import com.exemple.sweater.domain.Message;
import com.exemple.sweater.repos.LoginRepo;
import com.exemple.sweater.repos.MessageRepo;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class GreetingController {

    @Autowired
//    private LoginRepo loginRepo;
    private MessageRepo messageRepo;

//    @GetMapping("/login")
//    public String login(Map<String, Object> loginModel){
//        Iterable<Login> singIns = loginRepo.findAll();
//
//        loginModel.put("singIns", singIns);
//        return "login";
//    }
//
//    @PostMapping
//    public String addLogin (String login, String password, Map<String, Object> loginModel){
//
//        boolean loginWhile = true;
//        for(;;){
//            Login singIn = new Login(login, password);
//
//            loginRepo.save(singIn);
//
//            Iterable<Login> singIns = loginRepo.findAll();
//
//            loginModel.put("singIns", singIns);
//            System.out.println(singIn.getLogin());
//            System.out.println(singIn.getPassword());
//            System.out.println(singIn.myLogin);
//            System.out.println(singIn.myPassword);
//            if (singIn.getLogin().contains(singIn.myLogin) && singIn.getPassword().contains(singIn.myPassword)) {
//                return "profile";
//
//            }
//            else if (singIn.getLogin().contains(singIn.adminLogin) && singIn.getPassword().contains(singIn.adminPassword)) {
//                return "admin";
//            }
//            else {
//                return "login";
//            }
//        }
//
//
//    }

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
                           Map<String, Object> model)
    {
        model.put("name", name);
        return "greeting";
    }


}
