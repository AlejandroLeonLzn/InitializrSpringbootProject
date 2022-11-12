package com.example.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class HolamundoApplication {
//Leon Lozano Alejandro 8s11
        @GetMapping("/")
        public String mostrarHome(Model model){
            model.addAttribute("mensaje", "Hola Mundo con thymeaf");
            return "index";
        }
	public static void main(String[] args) {
		SpringApplication.run(HolamundoApplication.class, args);
	}

}
