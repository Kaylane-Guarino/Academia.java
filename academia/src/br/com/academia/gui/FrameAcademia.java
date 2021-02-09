package br.com.academia.gui;

import br.com.academia.model.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.academia.*;

public class FrameAcademia {
	
	public void criarTela{
		
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(500, 300);
		tela.setTitle("Academia Boa Forma");
		tela.setLayout(null);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Altura: ");
		labelNome.setBounds(10, 10, 80, 30);
		
		JTextField textNome = new JTextField();
		textNome.setBounds(90, 10, 100, 30);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(180, 10, 80, 30);
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds( 270, 10, 100, 30);
		
		JLabel peso = new JLabel();
		peso.setText("Peso: ");
		peso.setBounds(360, 45, 80, 30);
		
		JTextField textPeso = new JTextField();
		textPeso.setBounds(450, 45, 100, 30);
		
		
	}
}
