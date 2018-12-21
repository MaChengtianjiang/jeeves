package com.cherry.jeeves;

import com.cherry.jeeves.service.WechatHttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JeevesController {


    @Autowired
    private WechatHttpService wechatHttpService;

    @RequestMapping(value = "/sendFileHelper",  method = RequestMethod.GET)
    public String sendFileHelper(@RequestParam(value="content") String content) {
        try {
            wechatHttpService.sendText("filehelper", content);
            return "success";
        } catch (Exception e) {
            return "fail";
        }
    }

    @RequestMapping(value = "/hello",  method = RequestMethod.GET)
    public String sayHello() {
        return "Hello,World!";
    }
}
