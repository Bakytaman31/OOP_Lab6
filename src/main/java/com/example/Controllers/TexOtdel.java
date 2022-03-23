package com.example.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TexOtdel {

    @GetMapping("/tex")
    public String main(Model model) {
        return "tex";
    }
}
