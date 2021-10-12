package com.hu.kx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private KxConfigBean kxConfigBean;

    @Value("${kx.name}")
    private String name;
    @GetMapping("hello")
    public String hello() {

        return "欢迎来到开心之家，这里有好多"+kxConfigBean.getName()+"小朋友可爱的视频和照片哟！";
    }

    @GetMapping("config")
    public KxConfigBean getKxConfigBean(){
        return kxConfigBean;
    }
}
