package com.zmltd.httpdemo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import com.zmltd.httpdemo.pojo.Person;

@RestController
@RequestMapping("create")
public class Persons {

    @PostMapping(value = "person")
    public Person myPerson(@RequestBody Person myPerson) {
        myPerson.firstName= "Ali";
        return myPerson;

    }

}
