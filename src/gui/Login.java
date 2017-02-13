package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.w3c.dom.css.ViewCSS;

import main.MetodosComprame;
import org.hibernate.*;
import models.Cliente;
import models.SessionFactoryUtil;

public class Login extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	
	JFrame frameLogin;
	JPanel panelLogin;
	ImageIcon icon;
	
	JButton botonLogin;
	JButton botonRegistro;
	
	JTextField jTextFieldUsuario;
	JPasswordField jPasswordField;

	
	public Login(){
		
		panelLogin = new JPanel();
		
		icon = new ImageIcon("img/iconKey.png");
		
		
		frameLogin= new JFrame("LOGIN USUARIO");
		frameLogin.add(panelLogin);
		frameLogin.setSize(300, 175);
		frameLogin.setIconImage(icon.getImage());
		frameLogin.setResizable(false);
		frameLogin.setLocationRelativeTo(null);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		componentesPanel(panelLogin);
		frameLogin.setVisible(true);
		
	}
	
	
	public void componentesPanel(JPanel panel) {

		panel.setLayout(null);

		JLabel jLabelUsuario = new JLabel("Usuario");
		jLabelUsuario.setBounds(10, 10, 80, 25);
		panel.add(jLabelUsuario);

		jTextFieldUsuario = new JTextField(20);
		jTextFieldUsuario.setBounds(100, 10, 160, 25);
		panel.add(jTextFieldUsuario);

		JLabel jLabelContrasenya = new JLabel("Contraseña");
		jLabelContrasenya.setBounds(10, 40, 80, 25);
		panel.add(jLabelContrasenya);

		jPasswordField = new JPasswordField(20);
		jPasswordField.setBounds(100, 40, 160, 25);
		panel.add(jPasswordField);

		botonLogin = new JButton("Entrar");
		botonLogin.setBounds(10, 80, 120, 25);
		
		
		botonRegistro = new JButton("Registrarse");
		botonRegistro.setBounds(150, 80, 120, 25);
		
		
		botonLogin.addActionListener(this);
		botonRegistro.addActionListener(this);
		
		panel.add(botonLogin);
		panel.add(botonRegistro);
	}
	
	
	public static void main (String []args){
		
		//Login login= new Login();	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==botonLogin){
				
			String usuario = obtenerUsuario();
			String pass = obtenerContrasenya();
			SessionFactory sesion;
			Session session;
			
			sesion = SessionFactoryUtil.getSessionFactory();
			session = sesion.openSession();
			
		
			 boolean comprobacion = MetodosComprame.Login(session, usuario, pass);
			 
			 
			 if(comprobacion==true){
				 
				 JOptionPane.showMessageDialog(this, "Inicio Correcto");
				 GUI_Comprame main = new GUI_Comprame(MetodosComprame.recuperaCliente(session, usuario, pass));
				 frameLogin.setVisible(false);
				 
			 }
			 
			 
			 else {
				 
				 JOptionPane.showMessageDialog(this, "Error en la autentificación");
				 jTextFieldUsuario.setText("");
				 jPasswordField.setText("");
			 }
			 
			 
			 
		}	
			
		
		
		else if (e.getSource()==botonRegistro){
			
			try {
				Formulario_Usuario formulario = new Formulario_Usuario();
			}
			
			catch (ParseException e1){e1.printStackTrace();}
		
			frameLogin.setVisible(false);
			
			}
		}
		
	
	
	public String obtenerUsuario(){
		
		return jTextFieldUsuario.getText().toString();	
	}
	
	public String obtenerContrasenya(){
		
		String str = new String(jPasswordField.getPassword());
		return str;
	
	}
	
	
}
