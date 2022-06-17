package com.meloeclaranhan.adeusifms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.meloeclaranhan.adeusifms.orm.Adeus;
import com.meloeclaranhan.adeusifms.repository.AdeusRepository;

@Controller
public class IndexController {

	@Autowired
	private AdeusRepository adeusRepository;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("countAdeus", adeusRepository.count());
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
