package com.AppFinancas;

import javax.swing.JOptionPane;

public class appFinancas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciando objetos
		Pessoa usuario = new Pessoa();
		
		//Declaração de variaveis
		String valorSalario;
		
		// Delcaração de array
		Object[] continuar = {"Fazer novamente", "Sair"};
		Object desejaContinuar;
		
		do {
			
		// Informação pro usuario
		JOptionPane.showMessageDialog(null, "Informe o seu salário e o programa fala o quanto você deve guardar para despezas futuras.\nO calculo foi feito baseado na regra dos 70/30, onde 70% do salario devem ser usado \npara suas despesas com seu custo de vida e os outros 30% para reservas financeiras a \ncurto, médio e longo prazo.\nObs:não há necessidade de ponto.");
		
		// Trocar vírgula por ponto
		
		//Usuario informar o salario
		valorSalario = JOptionPane.showInputDialog("Informe o seu salário:");
		
		valorSalario = valorSalario.replace(",", ".");
		
		//Retorna o calculo
		JOptionPane.showMessageDialog(null, "Você deve guardar:" + String.format("%.2f", usuario.calcularSalario(Double.parseDouble(valorSalario))) + " reais\n ");
		
		//continuar ou sair
		desejaContinuar = JOptionPane.showInputDialog(null, "Deseja continuar?","Continuar",JOptionPane.INFORMATION_MESSAGE,null,continuar,continuar[0]);
		
		}while(desejaContinuar == "Fazer novamente");
		
		JOptionPane.showMessageDialog(null, "Tenha um bom dia!");
		
		System.exit(0);
	}

}
