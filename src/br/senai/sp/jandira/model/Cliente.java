package br.senai.sp.jandira.model;

import java.awt.*;
import java.time.LocalDate;

public class Cliente {
	
	public String nome;
	public LocalDate dataDeNascimento;
	public String genero[] = {"Feminino", "Masculino","Outros"};
	public double peso;
	public double altura;
	
	public double getImc() {
		return peso / Math.pow(altura, 2);
	}
	
	public String getStatus() {
		if (getImc() <= 18.5){
		    return "Você está abaixo do peso!";	
		} else if (getImc() > 18.5 && getImc() <25) {
		    return ("Você está no peso ideal! Parabéns!");
		} else if (getImc() >=25 && getImc() <30) {
		 	return("Você está levemente acima do peso.");
		} else if (getImc() >=30 && getImc() < 35) {
			return("Você está com Obesidade de grau I.");
		} else if (getImc() >=35 && getImc() <40) {
			return("Você está com Obesidade de grau II (Severa) Consulte um médico");
		} else {
			return("Você está com Obesidade grau III (Morbida) Consulte um médico.");
			
		}
	}
	

}
