package com.example.trabaio.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.trabaio.repository.AdeusRepository;
import com.example.trabaio.orm.Adeus;

@Controller
@RequestMapping("/usuario")
public class IndexController {
	
	// @Autowired
	// private MessageSource message; // internacionalização

	@Autowired
	private AdeusRepository adeusRepository;
	
	@GetMapping("/")
	public String adicionarUsuario(Model model /*, Locale locale*/) {
		
		// internacionalização
		// String msn = message.getMessage("index.welcome", null, locale);
		// model.addAttribute("msnBemVindo", msn);
		model.addAttribute("count", adeusRepository.count());
		return "index";
	}

	@PostMapping("/")
	public String adicionarUsuario(Model model) {
		Adeus novoAdeus = new Adeus();

		Adeus adeusSalvo = model.save(novoAdeus);
		model.addAttribute("idAdeus", adeusSalvo.getId());
		model.addAttribute("count", adeusRepository.count());
		return "index";
	}
}
