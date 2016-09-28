package br.com.autosmartparking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sistema")
public class SistemaController {
	
	 @RequestMapping(value = "/boasvindas", method = RequestMethod.GET)
	 public ModelAndView boasVindas(@RequestParam(value = "nome", required = false, defaultValue = "Auto Smart") String nome) {
		
		 ModelAndView modelAndView = new ModelAndView("boasvindas");
		 modelAndView.addObject("mensagem", "Ol� " + nome);
		
		 return modelAndView;
	 }

}