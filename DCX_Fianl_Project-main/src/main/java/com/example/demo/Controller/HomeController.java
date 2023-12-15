package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


    
    @Controller
    public class HomeController{

        @GetMapping(value="/")
        public String home(Model model) {
        
            model.addAttribute("test", "안녕하세요");

            return "login";

        }

        @GetMapping(value="/service")
        public String service(Model model) {

            return "index";
        }

        @GetMapping(value="/storage")
        public String storage(Model model) {
            
            return "storage";
        }
        
        @GetMapping(value="/video")
        public String video(Model model) {
            
            return "videosender";
        }
        
        @GetMapping(value="/video4")
        public String video4(Model model) {
            
            return "videosender4";
        }

        @GetMapping(value="/python")
        public String python(Model model) {
            
            return "videotest";
        }
        
        @GetMapping(value="/python2")
        public String python2(Model model) {
            
            return "videotest2";
        }

        @GetMapping(value="/python3")
        public String python3(Model model) {
            
            return "videotest3";
        }
        
        
    }
