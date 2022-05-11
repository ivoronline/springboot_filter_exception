package com.ivoronline.springboot_filter_exception.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //==================================================================
  // HELLO
  //==================================================================
  @RequestMapping("Hello")
  String hello() {
    System.out.println("Controller: Code from Controller");
    return "Hello from Controller";
  }

}

