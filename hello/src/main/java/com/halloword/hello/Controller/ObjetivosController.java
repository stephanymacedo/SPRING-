package com.halloword.hello.Controller;


	
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/ObjetivosController")


	public class ObjetivosController {
		
		@GetMapping
		public String Hello() {
			
			return"Essa semana eu quero aprender a ser paciênte, me organizar e ser proativa";
		}

}
