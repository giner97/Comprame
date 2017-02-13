package models;
// Generated 07-feb-2017 13:33:47 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

	private Integer idCliente;
	private String dni;
	private String usuario;
	private String pass;
	private String nombre;
	private String apellidos;
	private int telefono;
	private String email;
	private String provincia;
	private String localidad;
	private String domicilio;
	private int cp;
	private Date fechaAlta;
	private Set transaccionsForIdClienteVendedor = new HashSet(0);
	private Set transaccionsForIdClienteComprador = new HashSet(0);
	private Set productos = new HashSet(0);

	public Cliente() {
	}

	public Cliente(String dni, String usuario, String pass, int telefono, String email, String provincia,
			String localidad, String domicilio, int cp) {
		this.dni = dni;
		this.usuario = usuario;
		this.pass = pass;
		this.telefono = telefono;
		this.email = email;
		this.provincia = provincia;
		this.localidad = localidad;
		this.domicilio = domicilio;
		this.cp = cp;
	}

	public Cliente(String dni, String usuario, String pass, String nombre, String apellidos, int telefono, String email,
			String provincia, String localidad, String domicilio, int cp, Date fechaAlta,
			Set transaccionsForIdClienteVendedor, Set transaccionsForIdClienteComprador, Set productos) {
		this.dni = dni;
		this.usuario = usuario;
		this.pass = pass;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.provincia = provincia;
		this.localidad = localidad;
		this.domicilio = domicilio;
		this.cp = cp;
		this.fechaAlta = fechaAlta;
		this.transaccionsForIdClienteVendedor = transaccionsForIdClienteVendedor;
		this.transaccionsForIdClienteComprador = transaccionsForIdClienteComprador;
		this.productos = productos;
	}

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getCp() {
		return this.cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Set getTransaccionsForIdClienteVendedor() {
		return this.transaccionsForIdClienteVendedor;
	}

	public void setTransaccionsForIdClienteVendedor(Set transaccionsForIdClienteVendedor) {
		this.transaccionsForIdClienteVendedor = transaccionsForIdClienteVendedor;
	}

	public Set getTransaccionsForIdClienteComprador() {
		return this.transaccionsForIdClienteComprador;
	}

	public void setTransaccionsForIdClienteComprador(Set transaccionsForIdClienteComprador) {
		this.transaccionsForIdClienteComprador = transaccionsForIdClienteComprador;
	}

	public Set getProductos() {
		return this.productos;
	}

	public void setProductos(Set productos) {
		this.productos = productos;
	}

}