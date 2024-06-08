package com.helloworld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/greet")
  public ResponseEntity<String> greet() {
    return ResponseEntity.ok("Hello World !!!");
  }

}
