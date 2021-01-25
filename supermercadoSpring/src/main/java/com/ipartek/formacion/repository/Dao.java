package com.ipartek.formacion.repository;

import com.ipartek.formacion.entidades.Usuario;

public interface Dao<T> {

	Iterable<Usuario> obtenerTodos();

	T obtenerPorId(Long id);

	T agregar(T objeto);

	T modificar(T objeto);

	void borrar(Long id);

}
