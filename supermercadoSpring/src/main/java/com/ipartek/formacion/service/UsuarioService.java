package com.ipartek.formacion.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ipartek.formacion.entidades.Usuario;

public interface UsuarioService {

	// nos devuleve una coleccion enforma de iterable
	public Iterable<Usuario> findAll();

	public Page<Usuario> findAll(Pageable pageable);

	public Optional<Usuario> findById(Long id);

	public Usuario save(Usuario usuario);

	public void deleteByID(Long id);

}
