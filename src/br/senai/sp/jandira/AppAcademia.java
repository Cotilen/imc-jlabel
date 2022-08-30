package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
		
		FrameCalculoImc tela = new FrameCalculoImc();
		tela.titulo = "Calculadora IMC";
		tela.altura = 500;
		tela.largura = 450;
		tela.corDeFundoDaTela = new Color(0, 0, 0);
		tela.fontedosLabels = new Font("Castellar", Font.BOLD, 12);
		tela.corDaFonte = new Color(0, 255, 0);
		tela.corFundoCaixa = new Color(108, 123, 139);
		tela.corLetraCaixa = new Color(205 ,38 ,38);
		tela.corFundoBotao = new Color(0, 200, 0);
		tela.criarTela();
		tela.fontedosLabelsResultado = new Font("Castellar", Font.BOLD, 8);
	
		
//		Cliente ana =  new Cliente();
//		Cliente pedro = new Cliente();
////		
//		System.out.println(ana);
//		System.out.println(pedro);
//		
//		ana.nome = "Ana Maria Brega";
//		ana.dataDeNascimento = LocalDate.of(1950, 6, 21);
//		ana.peso = 62;
//		ana.altura = 1.68;
//		ana.getImc();
//		ana.getStatus();
//		
//		System.out.println(ana.getImc());
//		JOptionPane.showMessageDialog(null, ana.getStatus());
//		
//		
//		
//		pedro.nome = "Pedro Dias";
//		pedro.dataDeNascimento = LocalDate.of(2002, 2, 28);
	}

}
