package com.exemple.sweater;

import com.exemple.sweater.domain.Message;
import com.exemple.sweater.repos.LoginRepo;
import com.exemple.sweater.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@ControllerAdvice
public class AdminActions {

    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/admin")
    public String main(Map<String, Object> model){
        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);
        return "admin";
    }

    @PostMapping
    public String addCategoryOfProduct (String text, String tag, Map<String, Object> model){
        Message message = new Message(text, tag);

        messageRepo.save(message);

        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);
        return "admin";
    }

}
