package com.bumblebee.newinvitation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author bumblebee
 */
@Controller
public class WebController {

    @GetMapping(value = "/")
    public String index(Model model) {

        return "index"; // 뷰 파일 리턴
    }
    @GetMapping(value = "/sample")
    public String sample(Model model) {

        return "index-demo"; // 뷰 파일 리턴
    }


}
