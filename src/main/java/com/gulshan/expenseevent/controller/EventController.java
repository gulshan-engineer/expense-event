package com.gulshan.expenseevent.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isEventComing(){
        return true;
    }

}
