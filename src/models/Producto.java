package models;
// Generated 07-feb-2017 13:33:47 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto implements java.io.Serializable {

	private Integer idProducto;
	private Categoria categoria;
	private Cliente cliente;
	private String nombreProducto;
	private int precio;
	private Boolean estado;
	private String descripcion;
	private String imagen;
	private Date fechaAlta;
	private Set transaccions = new HashSet(0);

	public Producto() {
	}

	public Producto(Categoria categoria, int precio) {
		this.categoria = categoria;
		this.precio = precio;
	}

	public Producto(Categoria categoria, Cliente cliente, String nombreProducto, int precio, Boolean estado,
			String descripcion, String imagen, Date fechaAlta, Set transaccions) {
		this.categoria = categoria;
		this.cliente = cliente;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.estado = estado;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.fechaAlta = fechaAlta;
		this.transaccions = transaccions;
	}

	public Integer getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Set getTransaccions() {
		return this.transaccions;
	}

	public void setTransaccions(Set transaccions) {
		this.transaccions = transaccions;
	}

}
