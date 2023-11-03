package models;

import java.util.Date;

public class trip {
	private Integer id;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private Double costo;
	private Integer destacado;

	private String estatus;
	private String img="no-image.png";
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) { this.fecha = fecha; }
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Integer getDestacado() {return destacado;}

	public void setDestacado(Integer destacado) {this.destacado = destacado;}
	

	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "trip [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha + ", estatus=" + estatus + ", costo=" + costo + ", destacado= " +  destacado + ", img=" + img + "]";
	}

}
