package com.ipartek.formacion.entidades;

import java.math.BigDecimal;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// este data mi genera todo los get, set, constructores y toString gracias a lombok
@Data

@AllArgsConstructor
@NoArgsConstructor
public class Producto {

	// Atributos

	@Id
	private Long id;
	private String nombre;
	private String descripcion;
	private String urlImagen;
	private BigDecimal precio;
	private Integer descuento;
	private String unidadMedida;
	private BigDecimal precioUnidadMedida;
	private Integer cantidad;
	private BigDecimal total;

}
