package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;



public class FrameCalculoImc {

	public String titulo;
	public int largura;
	public int altura;
	public Font fontedosLabels;
	public Color corDeFundoDaTela;
	public Color corDaFonte;
	public Color corFundoCaixa;
	public Color corLetraCaixa;
	public Color corFundoBotao;
	public Font fontedosLabelsResultado;
	public String teste;
	

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// Obter a instância do painel de conteúdo

		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);

		// Criar os componentes da tela e colocar no painel(container)

		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(30, 0, 100, 80);
		labelImc.setFont(new Font("aerif", Font.BOLD, 30));
		labelImc.setForeground(corDaFonte);

		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 60, 50, 30);
		labelNome.setFont(fontedosLabels);
		labelNome.setForeground(corDaFonte);

		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 90, 300, 20);
		textFieldNome.setForeground(corLetraCaixa);
		textFieldNome.setBackground(corFundoCaixa);

		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 120, 50, 30);
		labelPeso.setFont(fontedosLabels);
		labelPeso.setForeground(corDaFonte);

		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 150, 50, 20);
		textFieldPeso.setForeground(corLetraCaixa);
		textFieldPeso.setBackground(corFundoCaixa);

		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 180, 100, 30);
		labelAltura.setFont(fontedosLabels);
		labelAltura.setForeground(corDaFonte);

		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 210, 50, 20);
		textFieldAltura.setForeground(corLetraCaixa);
		textFieldAltura.setBackground(corFundoCaixa);

		JLabel labelDataNas = new JLabel();
		labelDataNas.setText("Data de Nascimento:");
		labelDataNas.setBounds(30, 240, 200, 30);
		labelDataNas.setFont(fontedosLabels);
		labelDataNas.setForeground(corDaFonte);

		JTextField textFieldDataNas = new JTextField();
		textFieldDataNas.setBounds(30, 270, 100, 20);
		textFieldDataNas.setForeground(corLetraCaixa);
		textFieldDataNas.setBackground(corFundoCaixa);

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(180, 270, 150, 20);
		buttonCalcular.setBackground(corFundoBotao);

		JLabel labelSeuImc = new JLabel();
		//labelSeuImc.setText("Seu IMC é:");
		labelSeuImc.setFont(fontedosLabelsResultado);
		labelSeuImc.setBounds(30, 320, 300, 20);
		labelSeuImc.setForeground(corDaFonte);

		JLabel labelStatus = new JLabel();
		//labelStatus.setText("O status do seu IMC é:");
		labelStatus.setBounds(30, 350, 520, 20);
		labelStatus.setFont(fontedosLabelsResultado);
		labelStatus.setForeground(corDaFonte);

		// Eventos de Click

		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Cliente cliente = new Cliente();
				cliente.nome = textFieldNome.getText();
				cliente.peso = Double.parseDouble(textFieldPeso.getText());
				cliente.altura = Double.parseDouble(textFieldAltura.getText());

				labelSeuImc.setText(cliente.nome + ", seu IMC é " + cliente.getImc());
				labelStatus.setText(cliente.getStatus());

				
			}
		});
		
		
		
		
		// Adicionar componentes ao painel(Container)

		painel.add(labelImc);
		painel.add(buttonCalcular);
		painel.add(labelNome);
		painel.add(textFieldNome);
		painel.add(labelPeso);
		painel.add(textFieldPeso);
		painel.add(labelAltura);
		painel.add(textFieldAltura);
		painel.add(textFieldDataNas);
		painel.add(labelDataNas);
		painel.add(labelSeuImc);
		painel.add(labelStatus);

		tela.setVisible(true);

	}

}
