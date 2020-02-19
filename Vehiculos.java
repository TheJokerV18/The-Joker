package Vehiculos;

import Caracteristicas.Propietario;
import Caracteristicas.TipoServicio;

public abstract class Vehiculos {

	private Integer placa;
	private Propietario propietario;
	private TipoServicio tiposervicio;

	public Vehiculos(Integer placa, Propietario propietario, TipoServicio tiposervicio) {

		this.placa = placa;
		this.propietario = propietario;
		this.tiposervicio = tiposervicio;

	}

	public Integer getPlaca() {
		return placa;
	}

	public void setPlaca(Integer placa) {
		this.placa = placa;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public TipoServicio getTiposervicio() {
		return tiposervicio;
	}

	public void setTiposervicio(TipoServicio tiposervicio) {
		this.tiposervicio = tiposervicio;
	}

	public abstract void Consultar();

}