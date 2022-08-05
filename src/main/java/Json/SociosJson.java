package Json;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SociosJson {
	
	@JsonProperty("idSocios")
	private Long idSocios;
	
	@JsonProperty("Nombre")
	private String Nombre;
	
	@JsonProperty("Edad")
	private int Edad;
	
	@JsonProperty("Equipo")
	private String Equipo;
	
	@JsonProperty("EstadoCivil")
	private String EstadoCivil;

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
	
}
