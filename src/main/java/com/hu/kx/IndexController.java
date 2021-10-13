package com.hu.kx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class IndexController {

    @Autowired
    private KxConfigBean kxConfigBean;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/index")
    public String index(ModelMap modelMap) {
        Locale locale = LocaleContextHolder.getLocale();
        modelMap.addAttribute("title",messageSource.getMessage("title",null,locale));
        modelMap.addAttribute("msg",messageSource.getMessage("msg",null,locale));

        return "index";
    }

    @GetMapping("/international")
    public String international(Model model) {
        Locale locale = LocaleContextHolder.getLocale();
        model.addAttribute("message", messageSource.getMessage("message", null, locale));
        return "international";
    }
}
