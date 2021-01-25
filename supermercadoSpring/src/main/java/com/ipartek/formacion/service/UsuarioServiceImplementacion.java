package com.ipartek.formacion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ipartek.formacion.entidades.Usuario;
import com.ipartek.formacion.repository.UsuarioRepository;

@Service
public class UsuarioServiceImplementacion implements UsuarioService {

	// injectamos el repositorio
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Usuario> findAll() {

		return usuarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Usuario> findAll(Pageable pageable) {

		return usuarioRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findById(Long id) {

		return usuarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {

		return usuarioRepository.save(usuario);
	}

	@Override
	@Transactional
	public void deleteByID(Long id) {

		usuarioRepository.deleteById(id);

	}

}
