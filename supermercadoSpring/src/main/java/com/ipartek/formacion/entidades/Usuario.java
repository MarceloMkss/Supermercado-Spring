package com.ipartek.formacion.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

	// atributo
	@Id
	private Long id;

	private String email;
	private String password;

}
