package com.ipartek.formacion.contoladores;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipartek.formacion.entidades.Usuario;

import lombok.extern.java.Log;

@Log
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping
	public String getUsuario(Usuario usuario) {

		log.info(usuario.toString());

		return "usuario";

	}

	@PostMapping
	public String postUsuario(@Valid Usuario usuario, BindingResult bindingResult) {

		log.info(usuario.toString());
		log.info(bindingResult.toString());

		if (bindingResult.hasErrors()) {
			return "usuario";
		} else {
			return "listadoUsuario";
		}

	}
}
