package com.heitian.ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by AL on 0008 08 05.
 */
@Controller
@RequestMapping("/music")
public class MusicController {
    private Logger log = Logger.getLogger(UserController.class);
    @RequestMapping("/showMusic")
    public String showMusic(){
        System.out.print("=====MUSIC LOGIC ACTION=====");

         return "showMusic";
    }
}
