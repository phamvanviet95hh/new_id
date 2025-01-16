package org.suite.suiteservice.controllers.webs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("admin/eid/v1")
public class HomeWebController {

    @GetMapping("test")
    public String test(){
        return "index";
    }

}
