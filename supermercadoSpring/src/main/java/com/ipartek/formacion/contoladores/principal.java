package com.ipartek.formacion.contoladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.formacion.entidades.Producto;

@Controller
@RequestMapping("/principal")

public class principal {

	@GetMapping
	public String GetPrincipal(Producto producto) {

		return "principal";

	}

}
