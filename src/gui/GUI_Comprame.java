package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Cliente;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.JulianFields;
import javax.swing.JSpinner;
import javax.swing.BoxLayout;
import java.awt.Component;

public class GUI_Comprame extends JFrame implements ActionListener {

	  
	
	//Variables GUI
	   JFrame frame;
	   JPanel panelCabecera;
	   JPanel panelCabecera2;
	   ImageIcon icon;

	   JButton botonSubir;
	   JButton botonBuscar;
	   JButton botonConsultar;
	   JButton botonHome;
	   JButton botonCesta;
	
	
	
	public static void main(String[] args) {
	
				
	}
		
	public GUI_Comprame(Cliente cliente) {
		
			
			frame = new JFrame("Comprame APP");
			panelCabecera = new JPanel(); 
         
			
	
			/* BOTONES */
			botonSubir = new JButton("Añadir");
			botonSubir.setHorizontalAlignment(SwingConstants.LEFT);
	        botonConsultar = new JButton("Consultar");
	        botonConsultar.setHorizontalAlignment(SwingConstants.LEFT);
	        
	        //Titulo
	        ImageIcon tituloComprame = new ImageIcon("img/titulo.png");
	 
	        //Boton Home
	        ImageIcon iconHome = new ImageIcon("img/icon_home.png");
	        
	        //Boton Buscar
	        ImageIcon iconBuscar = new ImageIcon("img/icon_buscar.png");
	        
	        //Boton Cesta
	        ImageIcon iconCesta= new ImageIcon("img/icon_cesta.png");
	        panelCabecera.setLayout(new BoxLayout(panelCabecera, BoxLayout.X_AXIS));
	        	        
	      
	        //Añadimos los botones al JPanel
	        panelCabecera.add(botonSubir);
	        panelCabecera.add(botonConsultar);
	        
	 
	        //Propiedades el JFrame
	        icon = new ImageIcon("img/icon.png");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(500,500);
	        //frame.getContentPane().add(panelCabecera);
	        frame.getContentPane().add(panelCabecera, BorderLayout.NORTH);
	        
	        panelCabecera.setBackground(new Color(249, 230, 177));
	        panelCabecera2 = new JPanel();
	        panelCabecera2.setAlignmentX(15.0f);
	        panelCabecera.add(panelCabecera2);
	        panelCabecera2.setBackground(Color.gray);
	        panelCabecera2.setLayout(new FlowLayout(FlowLayout.RIGHT));
	        panelCabecera2.setBackground(new Color(249, 230, 177));
	        
	        botonHome= new JButton();
	        panelCabecera2.add(botonHome);
	         
	         
	         //Propiedades del Boton
	         botonHome.setIcon(iconHome);
	         botonHome.setMargin(new Insets(0, 0, 0, 0));
	         botonHome.setOpaque(false);
	         botonHome.setContentAreaFilled(false);
	         botonHome.setBorder(null);
	         botonBuscar = new JButton();
	         panelCabecera2.add(botonBuscar);
	         //Propiedades del Boton
	         botonBuscar.setIcon(iconBuscar);
	         botonBuscar.setMargin(new Insets(0, 0, 0, 0));
	         botonBuscar.setOpaque(false);
	         botonBuscar.setContentAreaFilled(false);
	         botonBuscar.setBorder(null);
	         botonCesta = new JButton();
	         panelCabecera2.add(botonCesta);
	         //Propiedades del Boton
	         botonCesta.setIcon(iconCesta);
	         botonCesta.setMargin(new Insets(0, 0, 0, 0));
	         botonCesta.setOpaque(false);
	         botonCesta.setContentAreaFilled(false);
	         botonCesta.setBorder(null);
	         botonCesta.addActionListener(this);
	         botonBuscar.addActionListener(this);
	         botonHome.addActionListener(this);
	       
	         //frame.pack();
	         frame.setLocationRelativeTo(null);
	         frame.setVisible(true);
	         frame.setIconImage(icon.getImage());
	        
	        
	        
	        //Escuchadores de los botones
	        botonSubir.addActionListener(this);
	        botonConsultar.addActionListener(this);
 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		
	}

}
