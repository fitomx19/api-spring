package com.ipn.mx.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name = "Municipio")
public class Municipio implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMunicipio")
	private Long IdMunicipio;
	
	@NotEmpty(message="El nombre de el municipio es obligatorio")
	@Size (min = 3 , max = 100,message = "El valor debe estar entre 3 y 100")
	@Column(name = "nombreMunicipio")
	private String nombreMunicipio;
	
	@NotNull(message = "No debe estar vacio")
	@Column(name = "idEstado" , nullable = false)
	private int idEstado;
	
	
	
}
