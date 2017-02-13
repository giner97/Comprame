package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.mapping.Fetchable;

import models.*;

public class MetodosComprame {

	public static void anyadirObjeto(Session sesion, int idProducto, int categoria, String nombreProducto, int precio, boolean estado, String descripcion, String imagen, int id_cliente, Date fechaAlta){
		
		//Creo un objeto
		
			Producto producto = new Producto();
			
		//Añado los datos a la base de datos
			
			producto.setIdProducto(idProducto);
			producto.setDescripcion(descripcion);
			producto.setEstado(estado);
			producto.setPrecio(precio);
			producto.setFechaAlta(fechaAlta);
			producto.setNombreProducto(nombreProducto);
			producto.setImagen(imagen);
		
			Iterator iter = sesion.createQuery("from Equipo where=idCliente='"+id_cliente+"'").iterate();
			Cliente cliente = (Cliente)iter.next();
			
			producto.setCliente(cliente);
			
			Iterator iter1 = sesion.createQuery("from Categoria where=idCategoria='"+categoria+"'").iterate();
			Categoria cat= (Categoria)iter1.next();
			
			producto.setCategoria(cat);
			
		//Persist y commit del session
			
			sesion.beginTransaction();
			sesion.persist(producto);
			sesion.getTransaction().commit();
			sesion.close();
		
	}
	
	public static ArrayList<Transaccion> ConsultarCompras(Session sesion, int id_cliente){
		
		//Creo  un arrayList
		
			ArrayList<Transaccion>compras = new ArrayList<>();
			
		Iterator iter = sesion.createQuery("from Transaccion where=idCliente='"+id_cliente+"'").iterate();
		
		while(iter.hasNext()){
			
			Transaccion compra = (Transaccion)iter.next();
			compras.add(compra);
			
		}
		
		return compras;
		
	}
	
	public static boolean Login(Session sesion, String user, String pass){
		
		boolean resultado=false;
		
		Iterator iter1 = sesion.createQuery("from Cliente").iterate();
			
		while(iter1.hasNext()){
		
			Cliente cliente = (Cliente) iter1.next();
			
			if(cliente.getUsuario().equals(user)){
				
				if(cliente.getPass().equals(pass)){
				
					resultado=true;
					
				}
				
			}
			
		}
		
		return resultado;
		
	}
	
	public static Cliente recuperaCliente(Session sesion,String user,String pass){
		
		Cliente resultado=new Cliente();
		
		Iterator iter1 = sesion.createQuery("from Cliente").iterate();
		
		//Almaceno los resultado en un arrayList
		
			ArrayList<Cliente>arrayLogin=new ArrayList<Cliente>();
			
		while(iter1.hasNext()){
		
			Cliente cliente = (Cliente) iter1.next();
			arrayLogin.add(cliente);
			
			if(cliente.getUsuario().equals(user)&&(cliente.getApellidos().equals(pass))){
				
				resultado=cliente;
				
			}
			
		}
		
		return resultado; 
		
	}
	
	/*public static void realizarTransaccion(Session sesion, Cliente cliente, Producto producto){
		
		//Creo un objeto transaccion	
			
			Transaccion transaccion = new Transaccion();
			
		Date fechaCompra = new Date();
			
		//Añado los datos a la tabla
			
			transaccion.setClienteByIdClienteComprador(cliente);
			transaccion.setClienteByIdClienteVendedor(producto.getCliente());
			transaccion.setFechaTransaccion(fechaCompra);
			transaccion.setProducto(producto);
			
		//Persist y commit del session
			
			sesion.beginTransaction();
			sesion.persist(transaccion);
			sesion.getTransaction().commit();
			sesion.close();	
		
	}*/
	
public static void realizarTransaccion(Session sesion, Cliente cliente, ArrayList<Producto>compras){
		
		//Creo un objeto transaccion	
			
			Transaccion transaccion = new Transaccion();
			
		Date fechaCompra = new Date();
		
		for(int i=0;i<compras.size();i++){
			
			Producto producto = compras.get(i);
			
		//Añado los datos a la tabla
			
			transaccion.setClienteByIdClienteComprador(cliente);
			transaccion.setClienteByIdClienteVendedor(producto.getCliente());
			transaccion.setFechaTransaccion(fechaCompra);
			transaccion.setProducto(producto);
			
		//Persist y commit del session
			
			sesion.beginTransaction();
			sesion.persist(transaccion);
			sesion.getTransaction().commit();
			sesion.close();	
			
		}
		
	}

	public ArrayList<Producto>carrito(Producto producto){
		
		ArrayList<Producto>carritoProductos = new ArrayList<>();
		
		carritoProductos.add(producto);
		
		return carritoProductos;
		
	}
	
	
}
