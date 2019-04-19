package me.zurhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName IndexController
 * @Author huangzehang
 * @Date 2019/4/18
 **/
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "index")
    public String getAnswer(HttpServletRequest request) {
        return "answer";
    }
}
