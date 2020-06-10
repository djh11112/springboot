package com.djh.test.Controller;

import com.djh.test.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class errorController {


    @Autowired
    PersonService personService;

    @RequestMapping("/error111")
    public ModelAndView error1(){
        // 顾名思义 实体和数据 同时返回页面模板和数据
        ModelAndView mav = new ModelAndView("errorPage");
        List list = personService.getAll();
        mav.addObject("list",list);
        return mav;
    }
}
