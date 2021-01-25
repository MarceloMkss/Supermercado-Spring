package com.ipartek.formacion.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ipartek.formacion.entidades.Usuario;

public class UsuarioDaoMysql implements Dao<Usuario> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Iterable<Usuario> obtenerTodos() {

		return jdbcTemplate.query("SELECT * FROM usuarios", new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	@Override
	public Usuario obtenerPorId(Long id) {

		return jdbcTemplate.queryForObject("SELECT * FROM usuarios WHERE id = ?",
				new BeanPropertyRowMapper<Usuario>(Usuario.class), new Object[] { id });
	}

	@Override
	public Usuario agregar(Usuario usuario) {

		jdbcTemplate.update("INSERT INTO usuarios (email, password) VALUES (?, ?)",
				new Object[] { usuario.getEmail(), usuario.getPassword() });

		return usuario;
	}

	@Override
	public Usuario modificar(Usuario usuario) {

		jdbcTemplate.update("UPDATE usuarios SET email = ?, password = ? WHERE id = ?",
				new Object[] { usuario.getEmail(), usuario.getPassword(), usuario.getId() });
		return usuario;
	}

	@Override
	public void borrar(Long id) {

		jdbcTemplate.update("DELETE FROM usuarios WHERE id = ?", new Object[] { id });

	}

}
