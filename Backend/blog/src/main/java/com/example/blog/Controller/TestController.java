package com.example.blog.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.Model.TableModel;

@RestController
@RequestMapping("/api/v1")
public class TestController {
    @GetMapping("/test")
   public String test(){
     String teString = "duc nguyen";
    return "xin chao " + teString;
   }
}
