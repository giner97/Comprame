package gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.text.MaskFormatter;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;

public class Formulario_Usuario {

	//Componentes Jframe
	private JFrame frame;
	
	private JTextField textFieldUsuario;
	private JTextField textFieldEmail;
	private JTextField jTextFieldProvincia;
	
	private JLabel jLabelEmail;
	private JLabel jLabelNombre;
	
	private ImageIcon icon;
	
	private JButton botonReiniciar;
	private JButton botonEnviar;

	public Formulario_Usuario() throws ParseException {
		
		
		componentesFormulario(frame);
	}

	private void componentesFormulario(JFrame jFrame) throws ParseException {
		
		/*Propiedades de JFrame*/
		icon = new ImageIcon("img/iconForm.png");
	
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 600);
		frame.setResizable(false);
		frame.setTitle("FORMULARIO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(icon.getImage());
		
	
		jLabelNombre = new JLabel("Usuario");
		jLabelNombre.setBounds(65, 50, 100, 14);
		frame.getContentPane().add(jLabelNombre);
		
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(150, 50, 100, 20);
		frame.getContentPane().add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JLabel jLabelContrasenya = new JLabel("Contraseña");
		jLabelContrasenya.setBounds(65, 75, 200, 14);
		frame.getContentPane().add(jLabelContrasenya);
		
		JPasswordField jPasswordField = new JPasswordField(20);
		jPasswordField.setBounds(150, 75, 100, 20);
		frame.getContentPane().add(jPasswordField);
		jPasswordField.setColumns(10);
		
		
		JLabel jlLabelTelefono = new JLabel("Telefono");
		jlLabelTelefono.setBounds(65, 100, 100, 14);
		frame.getContentPane().add(jlLabelTelefono);
		
		MaskFormatter mf1 = new MaskFormatter("###-###-###");
		mf1.setPlaceholderCharacter('_');
		JFormattedTextField textField_1 = new JFormattedTextField(mf1);
		textField_1.setBounds(150, 100, 100, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel jLabelEmail = new JLabel("Email Id");
		jLabelEmail.setBounds(65, 125, 100, 14);
		frame.getContentPane().add(jLabelEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(150, 125, 100, 17);
		frame.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel jLabelProvincia = new JLabel("Provincia");
		jLabelProvincia.setBounds(65, 162, 100, 14);
		frame.getContentPane().add(jLabelProvincia);

		jTextFieldProvincia= new JTextField();
		jTextFieldProvincia.setBounds(150, 157, 100, 20);
		jTextFieldProvincia.setColumns(10);
		frame.getContentPane().add(jTextFieldProvincia);
	
		botonReiniciar = new JButton("Reiniciar");
		
		botonReiniciar.setBounds(312, 387, 89, 23);
		frame.getContentPane().add(botonReiniciar);
	
		botonEnviar = new JButton("Enviar");
		
		botonEnviar.setBackground(Color.BLUE);
		botonEnviar.setForeground(Color.WHITE);
		botonEnviar.setBounds(65, 387, 89, 23);
		frame.getContentPane().add(botonEnviar);	
	}
}
