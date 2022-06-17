package com.example.trabaio.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.trabaio.repository.AdeusRepository;
import com.example.trabaio.orm.Adeus;

@Controller
public class IndexController {
	
	// @Autowired
	// private MessageSource message; // internacionalização

	@Autowired
	private AdeusRepository adeusRepository;
	
	@GetMapping("/")
	public String index(Model model /*, Locale locale*/) {

		// internacionalização
		// String msn = message.getMessage("index.welcome", null, locale);
		// model.addAttribute("msnBemVindo", msn);
		model.addAttribute("countAdeus", String.valueOf(adeusRepository.count()));
		return "index";
	}

	@PostMapping("/adeus")
	public String adicionarAdeus(Model model) {
		Adeus novoAdeus = new Adeus();

		Adeus adeusSalvo = adeusRepository.save(novoAdeus);
		model.addAttribute("idAdeus", adeusSalvo.getId());
		model.addAttribute("countAdeus", adeusRepository.count());
		return "redirect:/";
	}
}
