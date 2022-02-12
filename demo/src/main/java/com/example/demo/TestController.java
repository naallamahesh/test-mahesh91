package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
  @GetMapping(value = "/index")
  public ResponseEntity<String> getTestMessage(@RequestParam(required = false) String optionalText) {
    return new ResponseEntity<>(optionalText, HttpStatus.OK);
  }
}
