package com.heitian.ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by AL on 0008 08 05.
 */
@Controller
@RequestMapping("/music")
public class MusicController {
    private Logger log = Logger.getLogger(UserController.class);
    @RequestMapping("/showMusic")
    public String showMusic(HttpServletRequest request, Model model){
        System.out.print("=====MUSIC LOGIC ACTION=====");
        String url = "http://www.baidu.com";
        String result = "";
        BufferedReader in = null ;
        try {
            URL realUrl = new URL(url);

            URLConnection connection = realUrl.openConnection();
            connection.connect();
            in = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
            String line;
            while ((line =in.readLine()) != null)
            {
                result += line + "\n";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try
            {
                if (in != null)
                {
                    in.close();
                }
            }catch (Exception e1)
            {
                e1.printStackTrace();
            }
        }
        model.addAttribute("result",result);
        return "showMusic";
    }
}
