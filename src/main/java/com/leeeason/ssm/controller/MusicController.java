package com.leeeason.ssm.controller;

import com.leeeason.ssm.model.Music;
import com.leeeason.ssm.service.MusicService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by AL on 0008 08 05.
 */
@Controller
@RequestMapping("/music")
public class MusicController {
    @Resource
    private MusicService musicService;

    private Logger log = Logger.getLogger(UserController.class);
    @RequestMapping("/showMusic")
    public String showMusic(HttpServletRequest request, ModelAndView model){
        System.out.print("=====MUSIC LOGIC ACTION=====");
        String url = "http://music.163.com/";
        List<Music> music = musicService.getMusic(url);
        for (Music m : music) {
            System.out.print(m);
        }
        model.addObject("music",music);
        return "showMusic";
    }



}
