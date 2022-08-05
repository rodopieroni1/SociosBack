package com.Socios.socios.Socios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOCIOS")
public class sociosClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable=true)
	private Long idSocios;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Edad")
	private int Edad;
	
	@Column(name="Equipo")
	private String Equipo;
	
	@Column(name="EstadoCivil")
	private String EstadoCivil;
	
	@Column(name="Estudios")
	private String Estudios;
	public sociosClass(Long idSocios, String nombre, int edad, String equipo, String estadoCivil, String estudios) {
		super();
		this.idSocios = idSocios;
		Nombre = nombre;
		Edad = edad;
		Equipo = equipo;
		EstadoCivil = estadoCivil;
		Estudios = estudios;
	}

	public Long getIdSocios() {
		return idSocios;
	}

	public void setIdSocios(Long idSocios) {
		this.idSocios = idSocios;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getEquipo() {
		return Equipo;
	}

	public void setEquipo(String equipo) {
		Equipo = equipo;
	}

	public String getEstadoCivil() {
		return EstadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}

	public String getEstudios() {
		return Estudios;
	}

	public void setEstudios(String estudios) {
		Estudios = estudios;
	}
	
	

}
