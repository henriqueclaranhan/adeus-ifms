package com.example.trabaio.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class IndexController {
	
//	@Autowired
//    private MessageSource message; // internacionalização
	
	@GetMapping("/")
	public String adicionarUsuario(Model model /*, Locale locale*/) {
		
//		// internacionalização
//		String msn = message.getMessage("index.welcome", null, locale);
//		model.addAttribute("msnBemVindo", msn);
		
		return "index";
	}
}
